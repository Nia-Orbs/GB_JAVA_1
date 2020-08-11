public class Main {

    //task 1
    public static void main(String[] args) {
        // task 2
        byte b = 12;
        short s = 12312;
        int i = 21312;
        long l = 123123131L;

        float f = 4.7f;
        double d = 3.5;

        char c = 'a';

        boolean bool = false;

        String str = "String";

        //task 3
        System.out.println(calculation(2.1f, 3,4, 1));
        System.out.println();

        //task 4
        System.out.println(check(10, 3));
        System.out.println(check(10, 13));
        System.out.println(check(0, 3));
        System.out.println();

        //task 5
        check(2);
        check(0);
        check(-1);
        System.out.println();

        //task 6
        System.out.println(check2(2));
        System.out.println(check2(0));
        System.out.println(check2(-1));
        System.out.println();

        //task 7
        sayHello("Nia");
        System.out.println();

        //task 8
        cheakYear(400);
        cheakYear(200);
        cheakYear(404);
        cheakYear(405);
        System.out.println();
    }

    public static double calculation(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean check(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void check(int a) {
        if (a >= 0) {
            System.out.println("It's positive number!");
        } else {
            System.out.println("It's negative number!");
        }
    }

    public static boolean check2(int a) {
        if (a >= 0) {
            return true;
        }
        return false;
    }

    public static void sayHello(String name) {
        System.out.println("Привет, " +  name + "!");
    }

    public static void cheakYear(int year) {
        if (year % 400 != 0 && year % 100 == 0) {
            System.out.println("It is't leap year");
        } else if (year % 4 == 0) {
            System.out.println("It's leap year");
        } else {
            System.out.println("It is't leap year");
        }
    }
}
