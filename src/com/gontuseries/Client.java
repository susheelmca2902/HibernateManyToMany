package com.gontuseries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Client {

	public static void main(String[] args) {
		
		Certification certification1 = new Certification();
		certification1.setCertificateName("Java");
			
		Certification certification2 = new Certification();
		certification2.setCertificateName("Oracle");
		
		Student student1 = new Student();
		student1.setName("Susheel");
		
		Student student2 = new Student();
		student2.setName("Soni");
		
		(certification1.getStudent()).add(student1);
		(certification1.getStudent()).add(student2);
		
		(student1.getCertification()).add(certification1);
		(student1.getCertification()).add(certification2);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(certification1);
		session.save(certification2);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
