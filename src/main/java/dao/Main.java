package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Book;
import persistence.HibernateUtil;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Book book = new Book();
		book.setItsAuthor("George Martin");
		book.setItsName("Game of Thrones");
		book.setId(1);
		System.out.println("ready");

		session.save(book);
		session.getTransaction().commit();
		session.close();

	}
}
