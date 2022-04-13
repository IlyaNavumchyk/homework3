package homework3.run;

import homework3.commonlogic.Input;

public class MainLogic {

    public static void getMainInfo() {
        System.out.print(
                "\n------------------------------------------------------------"
                        + "\nMainInfo:\n------------------------------------------------------------\n" +
                        "1. Complete task 1\n" +
                        "2. Complete task 2\n" +
                        "3. Complete task 3\n" +
                        "4. Complete task 4\n" +
                        "5. Complete task 5\n" +
                        "0. Exit\n");
    }

    public static byte getTaskNumber() {
        System.out.print("Select task number: ");

        String choice = Input.getString();
        char firstCharacter = choice.charAt(0);

        if (choice.length() == 1 && firstCharacter >= 48 && firstCharacter <= 53) {
            return (byte) Integer.parseInt(choice);
        } else {
            return -1;
        }
    }
}
