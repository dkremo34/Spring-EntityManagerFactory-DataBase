package com.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        Student st = new Student();
        
        st.setStd_id(7);
        st.setName("Veeru");
        st.setCity("Noida");
        st.setPin(123456);      
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dataBaseConfFile");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(st);
    	em.getTransaction().commit();
    	Student s = em.find(Student.class, 4);
    	System.out.println(s);
    	
    }
}
