import java.util.*;

public class HashMapInJava {
    public static void main(String[] args) {
        System.out.println("HashMap can't Store duplicate Keys, Duplicate Values are allowed");
        
        HashMap<String, Integer> map = new HashMap<>();

        //Insert Value in HashMap
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 30);

        // Get any pair
        System.out.println( "How get Works : " + map.get("US") );

        // Iterate over HashMap
        Set <String> Keys = map.keySet();
        for(String key : Keys){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" : "+ e.getValue());
        }

        // Update value of any key
        map.put("China", 180);

        // Search
        if( map.containsKey("China")){
            System.out.println("It gives True is contains");
        }else{
            System.out.println("It gives False if not contains/exists");
        }

        System.out.println();
        
        // Deletes
        map.remove("China");

        System.out.println(map);

    }
}
