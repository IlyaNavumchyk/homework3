package homework3.tasklogic.task5;

import homework3.commonlogic.Generator;
import homework3.commonlogic.Input;

import java.util.TreeMap;

public class CompleteTaskFive {

    public static void completeTask5() {
        System.out.println("\nTask 5:\n" +
                "Дан класс User:\npublic class User {\n" +
                "    private Long id;\n" +
                "    private String name;\n" +
                "    private String surname;\n" +
                "    private List<User> friends;\n" +
                "}\nНеобходимо сгенерировать объекты класса User, заполнить все поля и " +
                "список друзей List<User> friends другими объектами класса User.\nВывести список имен друзей," +
                " друзей друзей и так далее для пользователя до 5 уровня вложенности.\n" +
                "Пример вывода: Слава -> {Матвей, Лиза, Ваня, Артем} -> {} -> {} -> {} -> {}\n");

        //creating a map of names of objects class User
        TreeMap<String, User> users = new TreeMap<>(TaskFiveLogic.getMapOfUsers());

        int lvl = 5;
        System.out.print("Enter the username for which we will display a list of friends: ");
        String name = Input.getString();
        if (users.containsKey(name)){
            TaskFiveLogic.getFriendLvl(users.get(name), lvl, users);
        } else {
            TaskFiveLogic.getFriendLvl(new User(name), lvl, users);
        }

        Generator.setId(0);
    }
}
