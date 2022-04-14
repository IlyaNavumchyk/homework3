package homework3.tasklogic.task4;

import homework3.classes.Student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TaskFourLogic {

    public static TreeSet<Student> generateTreeSet(int length) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<>() {
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });
        for (int i = 0; i < length; i++) {
            students.add(new Student());
        }
        return students;
    }

    public static void getSetOfEvenStudents(TreeSet<Student> students) {
        Iterator<Student> list = students.iterator();
        int count = 1;
        while (list.hasNext()) {
            list.next();
            if (count % 2 == 1) {
                list.remove();
            }
            count++;
        }
    }

}
