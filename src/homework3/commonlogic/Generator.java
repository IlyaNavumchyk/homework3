package homework3.commonlogic;

public class Generator {

    private static int id = 0;

    public static void setId(int setId) {
        id = setId;
    }

    public static int getId() {
        return ++id;
    }

    //This method generates a random length of something
    public static int getRandomLength() {
        int randomLength = (int) (Math.random() * 4 + 3);
        return randomLength;
    }

    //This method generates a string of random length in Russian characters.
    //The first character is capitalized.
    public static String getRandomString() {
        String randomString = "";
        int randomLength = getRandomLength();
        for (int i = 0; i < randomLength; i++) {
            if (i == 0) {
                randomString += (char) ((int) (Math.random() * 32 + 1040));
            } else {
                randomString += (char) ((int) (Math.random() * 32 + 1072));
            }
        }
        return randomString;
    }
}
