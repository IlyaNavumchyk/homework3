package homework3.tasklogic.task4;

import homework3.commonlogic.Generator;
import homework3.commonlogic.ShowCollections;
import homework3.classes.Student;

import java.util.TreeSet;

public class CompleteTaskFour {

    public static void completeTask4() {
        System.out.println("\nTask 4:\n" +
                "Создать экземпляр класса TreeSet, поместить в него объекты класса Student" +
                "(надо его спроектировать).\nВывести на экран информацию о каждом чётном в списке студенте," +
                " каждого нечётного студента удалить из коллекции.\n");

        TreeSet<Student> students = new TreeSet<>(TaskFourLogic.generateTreeSet(15));

        System.out.println("Start TreeSet");
        ShowCollections.showCollection(students);

        System.out.println("Final TreeSet");
        ShowCollections.showCollection(TaskFourLogic.getSetOfEvenStudents(students));

        Generator.setId(0);
    }
}
