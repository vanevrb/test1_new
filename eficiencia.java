/**
 * @(#)1.java
 *
 *
 * @author vanessa susana rodriguez barrios 
 * @version 1.00 2011/8/29
 */

import javax.swing.*;
public class eficiencia {

    public static void main(String[] args) {
    	int x,xact,cga,xfin;
    	carroeficiencia car=new carroeficiencia();//instancia de clase empleado
    	x=Integer.parseInt(JOptionPane.showInputDialog("digite cuantos kilometros se conducen con un galon de gasolina"));
    	cga=Integer.parseInt(JOptionPane.showInputDialog("digite cantidad de galones en el tanque"));
        xact=Integer.parseInt(JOptionPane.showInputDialog("digite cantidad de kilometros que ha conducido hasta ahora "));
 car.setDistanciaActual(xact);
        	car.setDistancia(x);//llamada al metodo
        	car.setCantidadgas(cga);
       car.calcrendimiento();
    car.calcgasolrest();
    xfin=x-xact;
        JOptionPane.showMessageDialog(null, "la eficiencia del carro en kilometros fue de "+car.calcrendimiento()+" km");
    JOptionPane.showMessageDialog(null, "Usted coloco "+ cga +" galones en el tanque");
    
    JOptionPane.showMessageDialog(null, " la cantidad restante de combustible es de "+ car.calcgasolrest()+" galones");
        JOptionPane.showMessageDialog(null, " Usted todavia le quedan "+xfin +" km por rrecorrer");
    }//fin main


 

}//fin class