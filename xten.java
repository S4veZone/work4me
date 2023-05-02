package Homework;

public class xten {
    public static void main(String[] args) {
        int[] q = {2,4,5,6,8,7,4,3,1};
        for (int i = 0; i < q.length; i +=10 );
        System.out.print("hello" + " " );
        System.out.println();
        for (int element : q)
            System.out.println(element + 10);

    }
}
