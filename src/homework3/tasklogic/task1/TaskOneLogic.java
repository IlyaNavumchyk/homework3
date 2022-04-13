package homework3.tasklogic.task1;

import homework3.classes.Book;

import java.util.LinkedList;

public class TaskOneLogic {

    //This method generates LinkedList with the specified number of objects
    public static LinkedList<Book> generateLinkedList(int length) {
        LinkedList<Book> list = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            list.add(new Book());
        }
        return list;
    }
}
