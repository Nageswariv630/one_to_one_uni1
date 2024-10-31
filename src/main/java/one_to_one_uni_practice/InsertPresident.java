package one_to_one_uni_practice;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPresident {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and Email:");
		President pc=new President(0,sc.next(),sc.next());
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(pc);
		et.commit();
	}

}
