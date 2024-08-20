
import java.util.Scanner;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        System.out.print("Enter a Number : ");
        int b = sc.nextInt();

        try {
            int result = a/b;
            System.out.println("Answer is : "+ result);
        } catch (Exception e) {
            System.out.println("Exception Occured : "+ e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Program Runs Successfuly !");
            sc.close();
        }

        System.out.println("More lines of code !");
    }
}
