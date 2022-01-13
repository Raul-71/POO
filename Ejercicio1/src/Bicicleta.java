
public class Bicicleta {

	
		// TODO Esbozo de método generado automáticamente
		public int velocidadActual;
		public int platoActual;
		public int pinonActual;
		
		
		public Bicicleta (int velocidadActual, int platoActual, int pinonActual) {
			this.velocidadActual = velocidadActual;
			this.platoActual = platoActual;
			this.pinonActual = pinonActual;
		}
		
		public Bicicleta(){
			velocidadActual = 0;
			platoActual = 1;
			pinonActual = 1;
		}
		//Metodos de Bicicleta
		
		//Aumentamos nuestra velocidad
		public void acelerar() {
		velocidadActual *= 2;
		}
		//Disminuimos nuestra velocidad actual
		public void frenar() {
		velocidadActual /= 2;
		}
		//Cambiamos nuestro plato a otro distinto
		public void cambiarPlato(int plato) {
			platoActual = plato;
		}
		//Cambiamos nuestro piñon a otro distinto
		public void cambiarpinon(int pinon) {
			pinonActual = pinon;
		}
	
	//Metodos sobrecargados
		public void cambiarPlato() {
			platoActual = 1;
		}
		
		public void cambiarpinon() {
			pinonActual = 1;
		}
		
}
