import java.util.*;

public class ListDemo{
    public static void main(String[] args){
        //use arraylists to save time
        List<Integer> arrayList = new ArrayList<>();
        //List is an interface and an arraylist is an implementation of the list interface
        //anything that implements list can be iterated 
        //an arraylist only implements lists
        arrayList.add(5);
        arrayList.add(35);
        arrayList.add(5);
        arrayList.add(3);

        //array list has no restriction to its length/size
        
        System.out.println("ArrayList:" + arrayList);
        System.out.println("SingleValue:" + arrayList.get(1));

        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> dequeLinkedList = new LinkedList<>();
        //Deque = a double ended a que/ a line with an open front and back
        LinkedList<Integer> trueLinkedList = new LinkedList<>();

        filter(arrayList);
        System.out.println(arrayList);
    }

    static void filter(Collection<Integer> c){
        //collection interface-can pass in anything from interface collection
        for(Iterator<Integer> it = c.iterator(); it.hasNext();){
            if (it.next() > 3)
                it.remove();

        }
    }
}