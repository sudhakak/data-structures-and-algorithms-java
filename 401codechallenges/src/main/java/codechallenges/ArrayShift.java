package codechallenges;

public class ArrayShift {
    public static String[] insertShiftArray(String[] initialArray, String insertNum) {
       // String [] initialArray = new String[]{"1", "2", "3", "5", "6"};
        int initialArrayLength = initialArray.length;
        int insertPos;
        if ((initialArrayLength % 2) == 0) {
             insertPos = (initialArrayLength) / 2;
        } else {
             insertPos = (initialArrayLength / 2)+1;
        }
       // String insertNum = "4";
        String[] newArray = new String[initialArrayLength + 1];

        for (int i = 0; i <=initialArrayLength; i++) {
            if (i < insertPos) {
                newArray[i] = initialArray[i];
            } else if (i == insertPos) {
                newArray[i] = insertNum;
            } else {
                newArray[i] = initialArray[i - 1];
            }
        }
        return newArray;
    }
}