/**
 * @(#)carroeficiencia.java
 *
 *
 * @author vanessa susana rodriguez barrios 
 * @version 1.00 2011/8/28
 */

public class carroeficiencia {
//atributos
private int distancia,distanciaactual,cantidadgas, rendimiento;
double gasolrest;
    public carroeficiencia() {
    }
     public void setDistanciaActual(int xact){//metodo set
    	distanciaactual=xact;// el atributo se le asigna el valor del parametro
    	}//fin metodo
    	  public void setDistancia(int x){//metodo set
    	distancia=x;// el atributo se le asigna el valor del parametro
    	}//fin metodo
    	  public void setCantidadgas(int cga){//metodo set
    	cantidadgas=cga;// el atributo se le asigna el valor del parametro
    	}//fin metodo
    	 public void setRendimiento(int rend){//metodo set
    	rendimiento=rend;// el atributo se le asigna el valor del parametro
    	}//fin metodo
 
    	
    			  public int getDistanciaActual(){//funcion get
    		return distanciaactual;
    	}//fin funcion
      		  public int getDistancia(){//funcion get
    		return distancia;
    	}//fin funcion
    		  public int getCantidadgas(){//funcion get
    		return cantidadgas;
    	}//fin funcion
    		  public int getRendimiento(){//funcion get
    		return rendimiento;
    	}//fin funcion
   	public double calcrendimiento(){
    		double rendimiento;
    		     rendimiento=distancia*cantidadgas;

    	return rendimiento;
   	}
   	   	public double calcgasolrest(){
   	   		
    		double gasolrest;
    		    gasolrest=(calcrendimiento()-distanciaactual)/distancia;
    	return  gasolrest;
   	}
    	// otros metodos y funciones
}//fin class