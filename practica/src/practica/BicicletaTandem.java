package practica;
/**
 * 
 * @author HP
 *
 */
public class BicicletaTandem extends Bicicleta {
private int numAsientos = 2;



/*
 * Constructores
 */


public BicicletaTandem (int NumAsientos) {
	super();
	this.numAsientos = NumAsientos;

}



/**
 * Metodos
 */
public void acelerar() {
if (VelocidadActual == 0){
VelocidadActual = 4;	
	
}
else {
VelocidadActual = VelocidadActual*4;	
}
}




public String VariaBici(){
	
	return " Velocidad de la bicicleta: "+VelocidadActual+" Piyon actual: "+ PiyonActual +" PlatoActual"+PlatoActual + " Asientos " + numAsientos;
			
	
	

}



}
