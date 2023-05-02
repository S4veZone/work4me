package Homework;

public class pizza1 {
    public double radius1; // radius 1 pizza
    public double calorii; // calorii
    public double radius2; // radius 2 pizza

    public pizza1(double radius1, double radius2 , double calorii){

        this.radius1 = radius1;
        this.radius2 = radius2;
        this.calorii = calorii;

    }
    public void print(){
        System.out.println("radius1: " + radius1 + "; radius2: " + radius2 + "; calorii: " + calorii);
        System.out.println("raznica v caloriah mejdu 2 pizzami: " +(((Math.PI * (radius1 * radius1)) - (Math.PI * (radius2 * radius2))/calorii)));
    }


}
