package one2one;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class One2OneApp {
	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.configure("Hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Address");
		List<Address>addr = query.list();
		for(Address a : addr)
			System.out.println(a.getStudent().getRno()+" "+a.getStudent().getName()+" "+
		                         a.getAddressid()+" "+a.getCity());
		session.close();
		/*Student std = new Student();
		std.setRno(127);
		std.setName("deloitte");
		
		Address addr = new Address();
		addr.setAddressid(12);
		addr.setCity("hyd");
		addr.setStudent(std);
		session.save(addr);
		tx.commit();*/
		
	}
}
