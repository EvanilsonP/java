public class LogicOperators {
    public static void main(String[] args) {

        int i = 2;
        int j = 3;

        if(i == j) {
            System.out.println("i is equal to j");
        } else {
            System.out.println("i is not equal to j");
        }

        if(i != j) {
            System.out.println("i is not equal to j");
        } else {
            System.out.println("i is equal to j");
        }

        if(i > 1 && i < 10) {
            System.out.println("i is greater than 1 and less than 10");
        }

        int a = 16;

        if(a >= 18) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You cannot drive.");
        }
    }
};
