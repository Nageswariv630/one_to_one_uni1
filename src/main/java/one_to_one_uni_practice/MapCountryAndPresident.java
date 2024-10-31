package one_to_one_uni_practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MapCountryAndPresident {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		int cid=1;
		int pcid=1;
		Country p=em.find(Country.class, cid);
		President pc=em.find(President.class, pcid);
		p.setP(pc);
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(p);
		et.commit();
		System.out.println("Done");
		
	}
	

}
