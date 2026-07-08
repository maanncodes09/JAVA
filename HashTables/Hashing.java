package HashTables;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // CREATING
        HashSet<Integer> set=new HashSet<>();

        //INSERT
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // set ke andar 1 2 3 hee store honge , because it only stores unique items

        //SIZE
        System.out.println("size of set is : "+ set.size()); // size of set is : 3

        //Print All Elements
        System.out.println(set); // [1, 2, 3]

        //SEARCH
        if(set.contains(1)){
            System.out.println("set contains 1"); // set contains 1
        }
        if(!set.contains(6)){
            System.out.println("does not contain"); // does not contain

        }

        //DELETE
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we deleted 1"); // we deleted 1
        }

        // Iterator
        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            /*1 2 3 */
        }
    }
    
}
