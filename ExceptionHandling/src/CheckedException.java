
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class CheckedException {

    public static void main(String[] args) {
        
        try {
            FileReader f = new FileReader("D://Viren/java.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            Connection conn = DriverManager.getConnection("");
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
