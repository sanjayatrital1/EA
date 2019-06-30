package csmum;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BookApp {
    public static EntityManagerFactory emf;
    public static void main(String [] args) throws ParseException {
        emf = Persistence.createEntityManagerFactory("cs544");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        //public Book(String title, String ISBN, String author, double price, Date publish_date)
        SimpleDateFormat sdf = new SimpleDateFormat("yy/mm/dd");
        //creates book object
        Book book1 = new Book("EA","abc123","Michel",230, sdf.parse("2015/9/12"));
        entityManager.persist(book1);

        Book book2 = new Book("WAA","def123","John",200, sdf.parse("2018/7/15"));
        entityManager.persist(book2);

        Book book3 = new Book("WAP","ghi123","Tom",150, sdf.parse("2017/6/5"));
        entityManager.persist(book3);

        entityManager.getTransaction().commit();
        entityManager.close();

        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        //Retrieve book and output to console
        TypedQuery<Book> query = entityManager.createQuery("from Book ",Book.class);
        List<Book> bookList = query.getResultList();
        for(Book b: bookList){
            System.out.println("Title= "+b.getTitle()+" ISBN= "+b.getISBN()+" Author= "+b.getAuthor()+" Price= "+b.getPrice());
        }
        entityManager.getTransaction().commit();
        entityManager.close();


        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        TypedQuery<Book> update = entityManager.createQuery("from Book" ,Book.class);
        List<Book> getBook= update.getResultList();
            for(Book b: getBook){
                if(b.getAuthor().equals("Tom")){
                    b.setPrice(100);
                    b.setTitle("MPP");
                    System.out.println("Title= "+b.getTitle()+" ISBN= "+b.getISBN()+" Author= "+b.getAuthor()+" Price= "+b.getPrice());
                }
                if(b.getAuthor().equals("Michel")){
                    entityManager.remove(b);
                }

            }

        entityManager.getTransaction().commit();
        entityManager.close();

        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        List<Book> show = entityManager.createQuery("from Book ",Book.class).getResultList();
        for(Book b: show){
            System.out.println("Title= "+b.getTitle()+" ISBN= "+b.getISBN()+" Author= "+b.getAuthor()+" Price= "+b.getPrice());
        }


    }
}
