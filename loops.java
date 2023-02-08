import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class loops {
    public static void main(String[] args) {
    // FOR LOOPS
    //     for(int i = 0; i <= 10; i += 2) {
    //         System.out.println(i);
    //     }

    // List<String> names = Arrays.asList("Micah", "Dutch", "Morgan");
    // for(String name: names) {
    //     System.out.println(name);
    //   }    
      
    //   for(int i = 0; i < names.size(); i++) {
    //     System.out.println(i + " = " + names.get(i));
    //   }

    //   // WHILE LOOPS
    //   int a = 2;
    //   while(a <= 8) {
    //     System.out.println(a);
    //     a += 2;
    //   }

      // ITERATOR
      List<String> people = Arrays.asList("Ricky", "Lucy", "Fred", "Ethel");
      Iterator<String> iterator = people.iterator();

      while(iterator.hasNext()) {
        System.out.println(iterator.next());
      }
    }
}