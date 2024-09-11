package applicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		/*
		 * instanciando pessoas
		Pessoa p1 = new Pessoa(null, "Jonas Ramos", "jonas@gmail.com");
		Pessoa p2 = new Pessoa(null, "Hadassa Oliveira", "hadassa@gmail.com");
		Pessoa p3 = new Pessoa(null, "Simba Ramos", "simba@gmail.com");
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		/*
		 * salvando no banco
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		*/
		
		/*
		 * Buscando do Banco
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		*/
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
