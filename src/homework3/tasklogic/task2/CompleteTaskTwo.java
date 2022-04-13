package homework3.tasklogic.task2;

import homework3.classes.Book;
import homework3.commonlogic.ShowCollections;

import java.util.HashSet;
import java.util.LinkedList;

public class CompleteTaskTwo {

    public static void completeTask2() {
        System.out.println("\nTask 2:\n" +
                "Создать экземпляр класса HashSet, добавить в него 25 экземпляров класса Book, " +
                "предусмотреть не менее 6 одинаковых книг.\nВывести на экран информацию о книгах " +
                "(содержащихся в коллекции HashSet), название которых начинается с гласной буквы.\n");

        LinkedList<Book> list = TaskTwoLogic.generateLinkedList(25);

        //Now let's create 6 identical books
        if (list.size() < 6) {
            for (int i = 0; i < 6; i++) {
                list.add(list.getFirst());
            }
        } else {
            for (int i = list.size() - 5; i < list.size(); i++) {
                list.set(i, list.getFirst());
            }
        }

        System.out.println("Start LinkedList");
        ShowCollections.showCollectionFivePerRow(list);

        HashSet<Book> set = new HashSet<>(list);
        System.out.println("\nFinal HashSet");
        ShowCollections.showCollectionFivePerRow(set);

        TaskTwoLogic.getListOfBooksStartingWithAVowel(set);
    }

}
