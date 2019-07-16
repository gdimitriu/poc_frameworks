package learning.collections.beans;

import java.util.Objects;

public class Book {
    private String isbn;
    private String book_name;
    private int price;
    private String publication;

    public Book() {
        isbn = "310IND";
        book_name = "unknown";
        price= 0;
        publication = "publication";
    }

    public Book(String isbn, String book_name, int price, String publication) {
        this.isbn = isbn;
        this.book_name = book_name;
        this.price = price;
        this.publication = publication;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return book_name + "\t" + isbn + "\t" + price + "\t" + publication;
    }
}
