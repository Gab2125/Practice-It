/*Write a method countStrings that takes an array of Strings and a target String and returns the number of occurences target appears 
in the array.*/

public static int countStrings(String[] array, String target) {
        int count = 0;
        for (String str : array) {
            if (str.equals(target)) {
                count++;
            }
        }
        return count;
}
