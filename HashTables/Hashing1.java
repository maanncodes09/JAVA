package HashTables;
import java.util.*;
public class Hashing1 {
    public static void main(String[] args) {
        // country(key) , population(val)
        HashMap<String, Integer> map= new HashMap<>();

        //INSERT
        map.put("India", 120);
        map.put("US",50);
        map.put("Germany", 40);
        map.put("China",110);
        System.out.println(map); // {China=110, US=50, Germany=40, India=120}
        map.put("China",90);
        System.out.println(map); // {China=90, US=50, Germany=40, India=120}

        //SEARCH
        if(map.containsKey("Germany")){
            System.out.println("present in the map"); // present in the map
        }
        else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("Germany")); // 40
        System.out.println(map.get("Edinburgh")); // null

        //ITERATOR

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey()); 
            System.out.println(e.getValue());

            /*
            China Key 
            90    Value
            US
            50
            Germany
            40
            India
            120
            
            */
        }
        Set<String> keys= map.keySet();
        for(String Key : keys){
            System.out.println(Key+" "+map.get(Key));
            /*
            China
            US
            Germany
            India
             */ // 1st without map.get
            /*
            China 90
            US 50
            Germany 40
            India 120
             */ // 2nd with map.get

            map.remove("China");
            System.out.println(map); // {US=50, Germany=40, India=120}
        }
    }
    
}
