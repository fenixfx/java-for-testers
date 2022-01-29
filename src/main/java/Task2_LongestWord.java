import java.util.Scanner;

public class Task2_LongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please specify count of words");
        int size = scan.nextInt();
        if (size == 0){
            System.err.println("Incorrect count of words is specified!");
            return;
        }

        System.out.println("Please type specified count of words");
        String[] wordsArr = new String[size];
        while (size > 0){
            wordsArr[size-1] = scan.next();
            size--;
        }
        System.out.print("Longest word is: \n" + GetLongest(wordsArr));
    }

    public static String GetLongest(String[] wordsArr){
        String longestString = "";
        for (String word:wordsArr) {
            if (longestString.length() < word.length())
                longestString = word;
        }
        return longestString;
    }
}
