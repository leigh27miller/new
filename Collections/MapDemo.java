import java.util.*;
import java.util.Map.Entry;

public class MapDemo{
    public static void main(String[] args){
        //maps don't have iterators!!
        Map<Integer,String> hashMap = new HashMap<>();
        /*saying that this map interface will have a key value pair and the
        value will be a pair and will be pointed to by an integer*/
        hashMap.put(1, "Thanos");
        hashMap.put(2, "Iron Man");
        hashMap.put(3, "Dr. Strange");
        hashMap.put(4, "I don't feel so good");

        System.out.println(hashMap);
        System.out.println(hashMap.get(2));

        //using entry- turns hash map into a set
        for(Entry<Integer, String> e : hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        //using key set
        Set<Integer> keys = hashMap.keySet();
        for (Integer k : keys){
            System.out.println(k + ": " + hashMap.get(k));
        }
    }
}