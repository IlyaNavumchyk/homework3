package homework3.run;

import homework3.commonlogic.Input;
import homework3.tasklogic.task1.CompleteTaskOne;
import homework3.tasklogic.task2.CompleteTaskTwo;
import homework3.tasklogic.task3.CompleteTaskThree;
import homework3.tasklogic.task4.CompleteTaskFour;
import homework3.tasklogic.task5.CompleteTaskFive;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean run = true;
        while (run) {
            MainLogic.getMainInfo();
            byte numberOfTask = MainLogic.getTaskNumber();
            switch (numberOfTask) {
                case 1: {
                    CompleteTaskOne.completeTask1();
                    break;
                }
                case 2: {
                    CompleteTaskTwo.completeTask2();
                    break;
                }
                case 3: {
                    CompleteTaskThree.completeTask3();
                    break;
                }
                case 4: {
                    CompleteTaskFour.completeTask4();
                    break;
                }
                case 5: {
                    CompleteTaskFive.completeTask5();
                    break;
                }
                case 0: {
                    run = false;
                    break;
                }
                default: {
                    System.out.println("Wrong choice!");
                }
            }
            if (numberOfTask != 0) {
                System.out.print("\nPress ENTER to continue...");
                System.in.read();
            }
        }
        Input.input.close();
    }
}
