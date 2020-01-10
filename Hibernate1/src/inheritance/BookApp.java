package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class BookApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Transaction tx = ssn.beginTransaction();
		Book book = new Book();
		JavaBook book1 = new JavaBook();
		DotnetBook book2 = new DotnetBook();
		
		book.setBookid(1235);
		book.setAuthor("xyz");
		book.setTitle("JAVA");
		book.setPrice(111);
		
		book1.setBookid(5679);
		book1.setAuthor("abc");
		book1.setTitle("DOTNET");
		book1.setPrice(222);
		book1.setDiscount(30);
		
		book2.setBookid(9012);
		book2.setAuthor("defg");
		book2.setTitle("ANU");
		book2.setPrice(23456);
		book2.setCds(45);
		
		ssn.save(book);
		ssn.save(book1);
		ssn.save(book2);
		
		tx.commit();
		ssn.close();
	}
}
