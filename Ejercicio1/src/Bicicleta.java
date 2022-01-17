
public class Bicicleta {

	
		// TODO Esbozo de método generado automáticamente
		private int velocidadActual;
		private int platoActual;
		private int pinonActual;
		
		
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
		
		
		 public int getVelocidadActual() {
		        return velocidadActual;
		    }
		
		  public void setVelocidadActual(int velocidadActual) {
		        this.velocidadActual = velocidadActual;
		    }
		  
		  public int getPlatoActual() {
		        return platoActual;
		    }
		
		  public void setPlatoActual(int platoActual) {
		        this.platoActual = platoActual;
		    }
		
		  public int getPinonActual() {
		        return platoActual;
		    }
		
		  public void setPinonActual(int pinonActual) {
		        this.pinonActual = pinonActual;
		    }
}
