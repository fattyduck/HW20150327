/**
 * Created by fattyduck on 3/25/15.
 */
import java.util.Scanner;
public class reCap {

    private static final boolean foundIn(char[] temp, int size, char c) {
        for (int i = 0; i < size; i++) {
            if (temp[i] == c) {
                return true;
            }
        }
        return false;
    }

    public static String uniqueCharacters(String str) {
        char[] temp = str.toCharArray();
        int size = 0; //number of unique chars found so far
        for (int i = 0; i < temp.length; i++) {
            if (!foundIn(temp, size, temp[i])) {
                // move the first-time char to the end of the return value
                temp[size] = temp[i];
                size++;
            }
        }
        return new String(temp, 0, size);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string that you want repeating characters deleted");
        String str=scan.nextLine();
        System.out.println(uniqueCharacters(str));

    }
}
