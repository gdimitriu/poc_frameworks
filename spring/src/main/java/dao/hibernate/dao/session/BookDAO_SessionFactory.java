package dao.hibernate.dao.session;

import dao.hibernate.beans.Book;
import dao.hibernate.dao.BookDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository(value="bookDAO_sessionFactory")
public class BookDAO_SessionFactory implements BookDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public int addBook(Book book) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(book);
            transaction.commit();
            session.close();
            return 1;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateBook(long ISBN, int price) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Book book = (Book) session.get(Book.class, ISBN);
            book.setPrice(price);
            session.saveOrUpdate(book);
            transaction.commit();
            session.close();
            return 1;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean deleteBook(long ISBN) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Book book = (Book) session.get(Book.class, ISBN);
            session.delete(book);
            transaction.commit();
            session.close();
            return true;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return false;
    }
}
