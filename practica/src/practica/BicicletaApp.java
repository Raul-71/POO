package practica;

import java.util.Scanner;

public class BicicletaApp {
	public static void main(String[] args) {
		int operacion = 0;
		
		Scanner entrada = new Scanner(System.in);
		//Creamos mibicicleta y tubicicleta
		BicicletaMontana miBicicleta = new BicicletaMontana(1);
		BicicletaTandem tuBicicleta = new BicicletaTandem(2);
		
		
		while (operacion == 0) {
		//Enseñamos los valores
		
		System.out.println("miBicicleta:"+miBicicleta+miBicicleta.VariaBici());
		System.out.println("tuBicicleta:"+tuBicicleta+tuBicicleta.VariaBici());
		System.out.println("Quieres bicicleta quieres cambiar/1 = miBicicleta/2 = tuBicicleta");
		operacion = entrada.nextInt();
		
		if (operacion == 1){
		//Cambiar los valores que queremos
		System.out.println("Quieres cambiar el plato/0 = SI");
		operacion = entrada.nextInt();
		
		
		//CAMBIAR PLATO
		if (operacion==0) {
			System.out.println("A que plato quieres cambiarlo");
			operacion = entrada.nextInt();
			miBicicleta.CambiarPlato(operacion);
		}
		//CAMBIAR PIÑON
		System.out.println("Quieres cambiar el piyon/0 = SI");
		operacion = entrada.nextInt();
		if (operacion==0) {
			System.out.println("A que piyon quieres cambiarlo");
			operacion = entrada.nextInt();
			miBicicleta.CambiarPiyon(operacion);
		}
		
		
		//ACELERAR A NO SER QUE VAYAS MUY RAPIDO Y PUEDAS FRENAR
		if (miBicicleta.getVelocidad() >= 50){
			System.out.println("Quieres frenar la bicicleta?VAS MUY RAPIDO/0 = SI");
			operacion = entrada.nextInt();
			if (operacion==0) {
				System.out.println("Has frenado tu velocidad...I");
				miBicicleta.frenar();
			}
		}
		else {
			System.out.println("Quieres acelerar la bicicleta?/0 = SI");
			operacion = entrada.nextInt();
			if (operacion==0) {
				System.out.println("Cuantas veces quieres acelerar?");
				operacion = entrada.nextInt();
				for (int i = 0;i < operacion;i++) {
				miBicicleta.acelerar();
				}
			}
		}
		
		}
		
		if (operacion == 2){
			//Cambiar los valores que queremos
			System.out.println("Quieres cambiar el plato/0 = SI");
			operacion = entrada.nextInt();
			
			
			//CAMBIAR PLATO
			if (operacion==0) {
				System.out.println("A que plato quieres cambiarlo");
				operacion = entrada.nextInt();
				tuBicicleta.CambiarPlato(operacion);
			}
			//CAMBIAR PIÑON
			System.out.println("Quieres cambiar el piyon/0 = SI");
			operacion = entrada.nextInt();
			if (operacion==0) {
				System.out.println("A que piyon quieres cambiarlo");
				operacion = entrada.nextInt();
				tuBicicleta.CambiarPiyon(operacion);
			}
			
			
			//ACELERAR A NO SER QUE VAYAS MUY RAPIDO Y PUEDAS FRENAR
			if (miBicicleta.getVelocidad() >= 100){
				System.out.println("Quieres frenar la bicicleta?VAS MUY RAPIDO/0 = SI");
				operacion = entrada.nextInt();
				if (operacion==0) {
					System.out.println("Has frenado tu velocidad...I");
					tuBicicleta.frenar();
				}
			}
			else {
				System.out.println("Quieres acelerar la bicicleta?/0 = SI");
				operacion = entrada.nextInt();
				if (operacion==0) {
					System.out.println("Cuantas veces quieres acelerar?");
					operacion = entrada.nextInt();
					for (int i = 0;i == operacion;i++) {
					tuBicicleta.acelerar();
					}
				}
			}
			
			}
		
		
		
		
		
		
		System.out.println("Quieres seguir con la bicicleta/0=SI");
		operacion = entrada.nextInt();
		}
		
	
	}

	
	}
