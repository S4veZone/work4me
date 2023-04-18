package Homework;

public class Box {
    private int width; // ширина
    private int height; // Высота
    private int length; // Длина

    public Box(int width, int height, int lenght) {

        this.width = width;
        this.height = height;
        this.length = lenght;
    }
   public void print(){
       System.out.println("width: " + width + "; height: " + height + "; lenght: " + length);
       System.out.println("box volume: " + width * height * length );
   }

}

