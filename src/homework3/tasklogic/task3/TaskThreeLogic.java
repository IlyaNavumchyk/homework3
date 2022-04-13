package homework3.tasklogic.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TaskThreeLogic {

    //This method generates ArrayList with the specified number of objects
    public static ArrayList<BookWithAuthors> generateArrayList(int length) {
        ArrayList<BookWithAuthors> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(new BookWithAuthors());
        }
        return list;
    }

    public static ArrayList<BookWithAuthors> sortCollection(ArrayList<BookWithAuthors> list,
                                                            String parameterOfSort) {
        switch (parameterOfSort) {
            case "name":
                Collections.sort(list, new Comparator<BookWithAuthors>() {
                    @Override
                    public int compare(BookWithAuthors o1, BookWithAuthors o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                break;
            case "surname":
                Collections.sort(list, new Comparator<BookWithAuthors>() {
                    @Override
                    public int compare(BookWithAuthors o1, BookWithAuthors o2) {
                        return o1.getSurname().compareTo(o2.getSurname());
                    }
                });
                break;
            case "patronymic":
                Collections.sort(list, new Comparator<BookWithAuthors>() {
                    @Override
                    public int compare(BookWithAuthors o1, BookWithAuthors o2) {
                        return o1.getPatronymic().compareTo(o2.getPatronymic());
                    }
                });
                break;
            case "title":
                Collections.sort(list, new Comparator<BookWithAuthors>() {
                    @Override
                    public int compare(BookWithAuthors o1, BookWithAuthors o2) {
                        return o2.getBookTitle().compareTo(o1.getBookTitle());
                    }
                });
                break;
        }
        return list;
    }
}
