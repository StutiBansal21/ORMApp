package collectionMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] arrgs)
    {
        Address ad=new Address();
        ad.setCity("chd");
        ad.setState("UT");
        Address ad1=new Address();
        ad1.setCity("aadarsh nagar");
        ad1.setState("pune");

        List<Address> list=new ArrayList<Address>();
        list.add(ad);
        list.add(ad1);
        Student s=new Student();
        s.setName("Abc");
        s.setAddress(list);

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sampleapp");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();

       em.persist(s);
       tx.commit();
       em.close();
       emf.close();
    }
}
