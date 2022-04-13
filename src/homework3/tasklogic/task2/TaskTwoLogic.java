package homework3.tasklogic.task2;

import homework3.classes.Book;
import homework3.commonlogic.ShowCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public  class TaskTwoLogic {

    public static final char[] ARRAY_OF_VOWELS = {'А', 'Е', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'};

    //This method selects books whose title starts with a vowel
    public static void getListOfBooksStartingWithAVowel (HashSet<Book> set){
        ArrayList<Book> listOfBooksStartingWithAVowel = new ArrayList<>(set);
        for (int i = 0; i < listOfBooksStartingWithAVowel.size(); i++) {
            char vowel = listOfBooksStartingWithAVowel.get(i).getBookTitle().charAt(0);
            boolean isVowels = false;
            for (char j : ARRAY_OF_VOWELS){
                if (j == vowel) {
                    isVowels = true;
                    break;
                }
            }
            if (!isVowels) {
                listOfBooksStartingWithAVowel.remove(listOfBooksStartingWithAVowel.get(i--));
            }
        }
        if (listOfBooksStartingWithAVowel.size()==0) {
            System.out.println("\nThere are no books whose title starts with a vowel.");
        } else {
            System.out.println("\nBooks whose title starts with a vowel\n");
            ShowCollections.showCollectionFivePerRow(listOfBooksStartingWithAVowel);
        }
    }

    //This method generates LinkedList with the specified number of objects
    public static LinkedList<Book> generateLinkedList(int length){
        LinkedList<Book> list = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            list.add(new Book());
        }
        return list;
    }
}

