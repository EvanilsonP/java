import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Variables {
    public static void main(String[] args) {

        // String
        String name = "Evanilson";
        System.out.println(name);

        // Float
        float n = 19.96f;
        System.out.println(n);

        // boolean
        boolean rich = false;
        System.out.println(rich);

        // char
        char singleCharacter = 'A';
        System.out.println(singleCharacter);

        // Integer
        int i = 17;
        System.out.println(i);
        // Long number
        long l = 45674L;
        System.out.println(l);

        double d = 8.9;
        System.out.println(d);
        // Replace a word
        String sentence = "This is a Java tutorial on variables";
        String sentence2 = sentence.replace("tutorial", "lesson");
        System.out.println(sentence2);

        String[] words = sentence.split(" "); // Split up words by ""
        List<String> list = Arrays.asList(words);   // Split up words by ""
        System.out.println(list);
        System.out.println(words[3]);               // printing to the console: Java

        LocalDate date = LocalDate.now();
        System.out.println(date.getMonth());

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(4);
        list2.add(-4);
        list2.add(24);

        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}