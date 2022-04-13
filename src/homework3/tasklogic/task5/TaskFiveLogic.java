package homework3.tasklogic.task5;

import java.util.*;

public class TaskFiveLogic {

    //Basic array of names
    public static String[] arrayOfNames = new String[]{"Илья", "Никита", "Диана", "Слава", "Матвей", "Лиза",
            "Ваня", "Артём"};

    //converting an array to a collection to create a map of names. You can add names here
    public static List<String> listOfNames = new ArrayList<>(Arrays.asList(arrayOfNames));

    //creating a map of names of objects class User
    public static TreeMap<String, User> getMapOfUsers() {
        TreeMap<String, User> users = new TreeMap<>();
        for (int i = 0; i < TaskFiveLogic.listOfNames.size(); i++) {
            users.put(TaskFiveLogic.listOfNames.get(i), new User(TaskFiveLogic.listOfNames.get(i)));
        }
        return users;
    }

    //This method launches a recursive method for displaying a list of friends of friends
    public static void getFriendLvl(User user, int level, TreeMap<String, User> users) {
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        int count = level;
        TaskFiveLogic.getFriends(list, level, count, users);
    }

    //This method displays a list of names up to the <level>th level of nesting
    public static void getFriends(ArrayList<User> list, int level, int count, TreeMap<String, User> users) {
        if (--count < 0) return;
        System.out.print("\nLvl" + (level - count));
        ArrayList<User> friends = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.print("\n" + list.get(i).getName() + ":");
            for (String friend : list.get(i).getFriends()) {
                System.out.print(" " + friend);
                friends.add(users.get(friend));
            }
        }
        System.out.println();
        getFriends(friends, level, count, users);
    }

    //This method generate List<User> friends
    public static Set<String> generateList() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int randomNames = (int) (Math.random() * (TaskFiveLogic.listOfNames.size() - 1));
            set.add(TaskFiveLogic.listOfNames.get(randomNames));
        }
        return set;
    }
}
