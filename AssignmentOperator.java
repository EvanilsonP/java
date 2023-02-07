public class AssignmentOperator {
    public static void main(String[] Args) {

        int value = 5;
        value += 3;
        System.out.print(value);

        int counter0 = 1;
        
        int start = counter0++;
        System.out.println(start);
        System.out.println(counter0);

        int counter = 10;
        counter += 2;
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + --counter);

        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }
    }
}
