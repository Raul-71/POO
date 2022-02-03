package practica;
/**
 * 
 * @author HP
 *
 */
public class BicicletaMontana extends Bicicleta{
private int suspension = 1;



/*
 * Constructores
 */


public BicicletaMontana (int Suspension) {
	super();
	this.suspension = Suspension;

}

/**
 * Metodos
 */

	
public void CambiarSuspension(int Suspension) {
	suspension = Suspension;
	
	
}

public void acelerar() {
if (VelocidadActual == 0){
VelocidadActual = 3;	
	
}
else {
VelocidadActual = VelocidadActual*3;	
}
}

public String VariaBici(){
	
	return " Velocidad de la bicicleta: "+VelocidadActual+" Piyon actual: "+ PiyonActual +" PlatoActual"+PlatoActual + " Suspension " + suspension;
			
	
	

}






}
