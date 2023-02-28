
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int gradeInput = sc.nextInt();
                if (gradeInput >= 93 && gradeInput <= 100) {
                    System.out.println("Letter Grade: A");
                } else if (gradeInput >= 90 && gradeInput <= 92) {
                    System.out.println("Letter Grade: A-");
                } else if (gradeInput >= 87 && gradeInput <= 89) {
                    System.out.println("Letter Grade: B+");
                } else if (gradeInput >= 80 && gradeInput <= 86) {
                    System.out.println("Letter Grade: B");
                } else if (gradeInput >= 77 && gradeInput <= 80) {
                    System.out.println("Letter Grade: C+");
                } else if (gradeInput >= 73 && gradeInput <= 76) {
                    System.out.println("Letter Grade: C");
                } else if (gradeInput >= 70 && gradeInput <= 72) {
                    System.out.println("Letter Grade: C-");
                } else if (gradeInput >= 65 && gradeInput <= 69) {
                    System.out.println("Letter Grade: D");
                } else if (gradeInput >= 0 && gradeInput <= 64) {
                    System.out.println("Letter Grade: F");
                }
            }catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter a whole number.");
                sc.next();
            }

        }
    }
}
