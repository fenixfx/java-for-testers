import java.util.Scanner;

public class Task3_CombinedApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int selectedMode;
        System.out.println("Please select mode:\n0 - Calculator\n1 - Longest word");
        selectedMode = scan.nextInt();
        switch (selectedMode){
            case 0:
                Task1_Calculator.main(null);
                break;
            case 1:
                Task2_LongestWord.main(null);
                break;
        }
    }
}