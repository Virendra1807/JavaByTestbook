import java.util.*;

public class  HashSetClass{
    
    public static void main(String[] args) {
        

        Set<String> setSss = new HashSet<>();

        // List<String> arrList = ArrayList>();

        // arrList.add("January");

        setSss.add("Helo");

        setSss.add("Bye");
        setSss.add("Bye");
        
        for(String a : setSss){
            System.out.println(a);
        }

        System.out.println(setSss);

    }
}
