package one_to_one_uni_practice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Country {
	
	public Country() {
		
	}
	
	
	public Country(int id, String name, String capital, President p) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.p = p;
	}


	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String name;
	private String capital;
	@OneToOne
	private President p;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	public President getP() {
		return p;
	}


	public void setP(President p) {
		this.p = p;
	}
	

}
