package homework3.tasklogic.task3;

import homework3.commonlogic.Input;
import homework3.commonlogic.ShowCollections;

import java.util.ArrayList;

public class CompleteTaskThree {

    public static void completeTask3() {
        System.out.println("\nTask 3:\n" +
                "Отсортировать коллекцию из 25 книг по фамилии, затем по имени, по отчеству автора книги " +
                "(эти поля надо добавить в класс Book).\nВывести 3 результата сортировки по разным параметрам," +
                " предусмотреть возможность передавать поле сортировки в качестве параметра метода.\n");

        ArrayList<BookWithAuthors> list = TaskThreeLogic.generateArrayList(25);

        System.out.println("Start ArrayList");
        ShowCollections.showCollection(list);

        System.out.print("Choose parameterOfSort (can take the following values: name, surname, patronymic, title): ");
        String parameterOfSort = Input.getString();
        TaskThreeLogic.sortCollection(list, parameterOfSort);

        System.out.println("Final ArrayList");
        ShowCollections.showCollection(list);
    }
}
