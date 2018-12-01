package ue3;

import javax.swing.*;

public class Vehicle {

      int power;
      double weight;
      String name;


  public Vehicle (String name, int power, int weight){
      this.name = name;
      this.power = power;
      this.weight = weight;
  }

  public String printName(){
      return name;
  }

  public void calculatePower (){
      double ps = power * 1.36;
      double psgerundet = Math.round(ps * 10) / 10;
      JOptionPane.showMessageDialog(null, + psgerundet + " PS" );
  }
}
