package homework3.tasklogic.task1;

import homework3.classes.Book;
import homework3.commonlogic.ShowCollections;

import java.util.LinkedList;

public class CompleteTaskOne {

    public static void completeTask1() {
        System.out.println("\nTask 1:\n" +
                "Создать экземпляр класса LinkedList, разместить в нём 20 объектов класса Book.\n" +
                "Вывести информацию о всех книгах. Программно удалить из коллекции 7-ю книгу, " +
                "вывести на экран информацию о оставшихся книгах.\n");

        LinkedList<Book> list = TaskOneLogic.generateLinkedList(25);

        System.out.println("Start LinkedList");
        ShowCollections.showCollectionFivePerRow(list);

        System.out.println("\nNow we will delete the 7th book " + list.remove(6));

        System.out.println("\nFinal LinkedList");
        ShowCollections.showCollectionFivePerRow(list);
    }

}
