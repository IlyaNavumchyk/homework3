package homework3.tasklogic.task3;

import homework3.classes.Book;
import homework3.commonlogic.Generator;

import java.util.Objects;

public class BookWithAuthors extends Book implements Comparable<BookWithAuthors> {

    private String name;
    private String surname;
    private String patronymic;

    public BookWithAuthors() {
        name = Generator.getRandomString();
        surname = Generator.getRandomString();
        patronymic = Generator.getRandomString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public int compareTo(BookWithAuthors o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookWithAuthors)) return false;
        if (!super.equals(o)) return false;
        BookWithAuthors that = (BookWithAuthors) o;
        return name.equals(that.name) && surname.equals(that.surname) && patronymic.equals(that.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, surname, patronymic);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + super.getBookTitle() + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }

}
