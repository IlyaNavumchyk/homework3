package homework3.classes;

import homework3.commonlogic.Generator;

import java.util.Objects;

public class Book {

    private String bookTitle;

    public Book() {
        bookTitle = Generator.getRandomString();
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle);
    }
}
