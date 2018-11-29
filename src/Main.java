import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    paritalString(JOptionPane.showInputDialog("Geben Sie einen Text ein:"));

    }

    public static void paritalString(String a){
       if (a.length() < 3){
           System.out.println("Ihr Text hat weniger Buchstaben als 3");;
       }
       else
       {
           System.out.println(a.substring(a.length()/2))
       ;
       }
    }
}

