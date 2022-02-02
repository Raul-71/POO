package practica;
/**
 * 
 * @author HP
 *
 */
public class Bicicleta {
protected int VelocidadActual = 0;
protected int PlatoActual = 0;
protected int PiyonActual = 0;


/*
 * Constructores
 */
public Bicicleta() {
	 VelocidadActual = 0;
	PlatoActual = 1;
	 PiyonActual = 1;
}

public Bicicleta (int velocidadActual, int platoActual, int pinonActual) {
	this.VelocidadActual = velocidadActual;
	this.PlatoActual = platoActual;
	this.PiyonActual = pinonActual;
}

/**
 * Metodos
 */
public void acelerar() {
if (VelocidadActual == 0){
VelocidadActual = 2;	
	
}
else {
VelocidadActual = VelocidadActual*2;	
}
}

public void frenar(){
	if (VelocidadActual != 0){
	VelocidadActual /= 2;
	}
}
	
public void CambiarPlato(int plato) {
	PlatoActual = plato;
	
}
	
public void CambiarPiyon(int piyon) {
	PiyonActual = piyon;
}

public int getVelocidad(){
	return VelocidadActual;
}

public String VariaBici(){
	//String datos = System.out.println("Hola");
	return " Velocidad de la bicicleta: "+VelocidadActual+" Piyon actual: "+ PiyonActual +" PlatoActual"+PlatoActual;
			
	
	

}






}
