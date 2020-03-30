package tableperclass;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {

        A a=new A();
        a.setId(101);
        a.setName("anu");

        B b=new B();
        b.setId(102);
        b.setName("priya");
        b.setValueOne("pass");

        C c=new C();
        c.setId(103);
        c.setName("rosh");
        c.setValueTwo("fail");

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sampleapp");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();

        em.persist(a);
        em.persist(b);
        em.persist(c);
        tx.commit();
        em.close(); ;
        emf.close();
    }
}
