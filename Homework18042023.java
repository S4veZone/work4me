package Homework;

public class Homework18042023 {
    public static void main(String[] args) {
        // sposob 1
        char w = 'O';
        int w1 = (int) w;
        System.out.println("1 sposob = " + (w1));

        // sposob 2
        char e = '0';
        int e2 = Integer.parseInt(String.valueOf(e));
        System.out.println("2 sposob = " + (e2) );

        // sposob 3
        char r = 'O';
        int r3 = Character.getNumericValue(r);
        System.out.println("3 sposob = " + (r3));






    }
}
