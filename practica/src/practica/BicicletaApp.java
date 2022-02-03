package practica;

import java.util.Scanner;

public class BicicletaApp {
	public static void main(String[] args) {
		int operacion = 0;
		int arra = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		//Creamos mibicicleta y tubicicleta
		//Bicicleta[] new bicicleta;
		Bicicleta[] bicis = new Bicicleta[] { new Bicicleta(1,2,2), new BicicletaTandem(2), new BicicletaMontana(1) } ;
        
		
		//BicicletaMontana miBicicleta = new BicicletaMontana(1);
		//BicicletaTandem tuBicicleta = new BicicletaTandem(2);
		
		
		while (operacion == 0) {
		//Enseñamos los valores
		
		System.out.println("Bicicleta:"+bicis[0]+bicis[0].VariaBici());
		System.out.println("BicicletaTandem:"+bicis[1]+bicis[1].VariaBici());
		System.out.println("BicicletaMontana:"+bicis[2]+bicis[2].VariaBici());
		//System.out.println("tuBicicleta:"+bicicleta[3]+bicicleta[3].VariaBici());
		System.out.println("Quieres bicicleta quieres cambiar/0 = Bicicleta/1 = BicicletaTandem/2 = BicicletaMontana");
		arra = entrada.nextInt();
		
		
		//Cambiar los valores que queremos
		System.out.println("Quieres cambiar el plato/0 = SI");
		operacion = entrada.nextInt();
		
		
		//CAMBIAR PLATO
		if (operacion==0) {
			System.out.println("A que plato quieres cambiarlo");
			operacion = entrada.nextInt();
			bicis[arra].CambiarPlato(operacion);
		}
		//CAMBIAR PIÑON
		System.out.println("Quieres cambiar el piyon/0 = SI");
		operacion = entrada.nextInt();
		if (operacion==0) {
			System.out.println("A que piyon quieres cambiarlo");
			operacion = entrada.nextInt();
			bicis[arra].CambiarPiyon(operacion);
		}
		
		
		//ACELERAR A NO SER QUE VAYAS MUY RAPIDO Y PUEDAS FRENAR
		if (bicis[arra].getVelocidad() >= 50){
			System.out.println("Quieres frenar la bicicleta?VAS MUY RAPIDO/0 = SI");
			operacion = entrada.nextInt();
			if (operacion==0) {
				System.out.println("Has frenado tu velocidad...I");
				bicis[arra].frenar();
			}
		}
		else {
			System.out.println("Quieres acelerar la bicicleta?/0 = SI");
			operacion = entrada.nextInt();
			if (operacion==0) {
				System.out.println("Cuantas veces quieres acelerar?");
				operacion = entrada.nextInt();
				for (int i = 0;i < operacion;i++) {
					bicis[arra].acelerar();
				}
			}
		}
		
		
		
		
		
		
		
		
		System.out.println("Quieres seguir con la bicicleta/0=SI");
		operacion = entrada.nextInt();
		}
		
	
	}

	
	}
