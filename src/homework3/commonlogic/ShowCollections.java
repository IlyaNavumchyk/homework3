package homework3.commonlogic;

import java.util.Collection;

public class ShowCollections {

    //This method displays one element of the collection in a row
    public static void showCollection(Collection collection) {
        for (Object object : collection) {
            System.out.println(object);
        }
    }

    //This method displays five elements of the collection in a row
    public static void showCollectionFivePerRow(Collection collection) {
        int count = 1;
        for (Object object : collection) {
            if (count % 5 == 0) {
                System.out.println(object);
            } else {
                System.out.print(object + "\t");
            }
            count++;
        }
    }
}
