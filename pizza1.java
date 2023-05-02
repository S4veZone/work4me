package Homework;

public class pizza1 {
    private double radius1; // radius 1 pizza
    private double calorii; // calorii
    private double radius2; // radius 2 pizza

    public pizza1(double radius1, double radius2 , double calorii){

        this.radius1 = radius1;
        this.radius2 = radius2;
        this.calorii = calorii;

    }
    public void print(){
        System.out.println("radius1: " + radius1 + "; radius2: " + radius2 + "; calorii: " + calorii);
        System.out.println("raznica v caloriah mejdu 2 pizzami: " +
                (((Math.PI * ((radius1/2) * (radius1/2))) - (Math.PI * ((radius2/2) * (radius2/2))))*calorii));

    }


}
