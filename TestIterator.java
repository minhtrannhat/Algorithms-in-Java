import java.util.*;

public class TestIterator {
    public static void main(String[] args){
      Collection<String> collection = new ArrayList<>();

      collection.add("New York");
      collection.add("Atlanta");
      collection.add("Dallas");

      // traversing the elements in the ArrayList
      Iterator<String> iterator = collection.iterator();

      while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase() + " ");
        }

        System.out.println();
    }
}
