package ue3;

public class Aufruf {
    public static void main(String[] args){
        Vehicle pkw = new Vehicle("BMW X5", 224, 1700);

        Vehicle lkw = new Vehicle("Iveco", 500, 4000);

        System.out.println(pkw.printName());
        System.out.println(lkw.printName());

        pkw.calculatePower();
        lkw.calculatePower();

    }
}
