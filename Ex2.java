package Examen;

import java.util.Random;

public class Ex2{
    public static void main(String[] args){
        int[] q = new int[8];
        for(int i=0;i<q.length;i++){
            q[i]=(int)(Math.random()*9+1);
            System.out.print(q[i] +" ");
        }
        for(int i=0;i<q.length;i++){
            if(q[i]%2!=0)q[i]=0;
            System.out.println(q[i] +"");
        }
    }
}
