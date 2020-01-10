package hbn;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetEmpls {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Query query= ssn.createQuery("from Employee");
		List<Employee> emplist= query.list();
		for(Employee e: emplist)
			System.out.println(e.getEmpcode()+" "+e.getEmpname()+" "+e.getSalary());
		
	}
}
