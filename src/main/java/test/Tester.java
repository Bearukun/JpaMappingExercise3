package test;


import entity.DiscountFixed;
import entity.DiscountQuantity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {

    public static void main(String[] args) {

        Persistence.generateSchema("pu", null);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin();

            em.persist(new DiscountFixed());
            em.persist(new DiscountQuantity());

            em.getTransaction().commit();

            //If something goes wrong, use getTransaction().rollback();
        } finally {

            em.close();

        }

    }

}
