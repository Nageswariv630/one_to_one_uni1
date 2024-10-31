package one_to_one_uni_practice;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchCountryById {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		System.out.println("Enter Id:");
		Country c=em.find(Country.class, new Scanner(System.in).nextInt());
		System.out.println(c.getName());
		System.out.println(c.getCapital());
		System.out.println(c.getP().getName());
	}

}
