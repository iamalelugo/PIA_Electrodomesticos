import java.util.ArrayList;
import java.util.Scanner;

public class JavaProject {
	
	static ArrayList<Electrodomesticos> electrodomestico = new ArrayList<Electrodomesticos>();

	private static Scanner number;
	private static Scanner text;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int continuar = 1;
		int total = 0;
		int opcion;
		boolean salir = false;
		
		number = new Scanner(System.in);
		
		do {

			System.out.println("Seleccione que tipo de dispositivo a agregar: ");
			System.out.println(" 1. Television");
			System.out.println(" 2. Lavadora ");
			System.out.println(" 3. Otro dispositivo");
			System.out.println(" 4. Salir");
			System.out.println(" Ingrese su opcion: ");
			opcion = number.nextInt();
		
			switch(opcion) {
			
			case 1 : 
				if(opcion ==1) 
					leerLavadora(); 
			
			case 2 : 
				if (opcion == 2)
					leerTelevision();
			
			case 3 : 
				if(opcion == 3)
					leerElectrodomestico();
			
			case 4 : 
				if(opcion == 4)
					salir = true;
				break;
             
			}
			
			System.out.println();
			
			System.out.println("Desea agregar otro dispositivo?[]1.SI / 2.NO:");
			continuar = number.nextInt();
			
			
		}while(continuar == 1);
		
		//Imprimir el arraylist
		for(int i = 0; i <  electrodomestico.size(); i++) {
			System.out.println(electrodomestico.get(i).toString());
		}
		
	}

	private static void leerElectrodomestico() {
		
		number = new Scanner(System.in);
		text = new Scanner(System.in);
		String color;
		char consumo = 'F';
		int peso, preciobase;
		
		Electrodomesticos aux;
		
		System.out.println("Ingrese el precio base: ");
		preciobase = number.nextInt();
		
		System.out.println("Ingrese el color: ");
		color = text.nextLine();
		
		System.out.println("Ingrese el consumo energetico: ");
		consumo = text.next().charAt(0);
		
		System.out.println("Ingrese el peso: ");
		peso = number.nextInt();
		
		aux = new Electrodomesticos();
		
		aux.setPreciobase(preciobase);
		aux.setColor(color);
		aux.setConsumoenergetico(consumo);
		aux.setPeso(peso);
		
		electrodomestico.add(aux);
		
	}

	private static void leerTelevision() {
		
		number = new Scanner(System.in);
		text = new Scanner(System.in);
		String color;
		char consumo = 'F';
		int peso, preciobase, resolucion;
		boolean sintonizadorTDT = false;
		
		Television aux;
		
		System.out.println("Ingrese el precio base: ");
		preciobase = number.nextInt();
		
		System.out.println("Ingrese el color: ");
		color = text.nextLine();
		
		System.out.println("Ingrese el consumo energetico: ");
		consumo = text.next().charAt(0);
		
		System.out.println("Ingrese el peso: ");
		peso = number.nextInt();
		
		System.out.println("Cuenta con sintonizadorTDT? [True / False]: ");
		sintonizadorTDT = text.nextBoolean();
		
		System.out.println("Ingrese la resolucion: ");
		resolucion = number.nextInt();
	
		aux = new Television();
		
		aux.setPreciobase(preciobase);
		aux.setColor(color);
		aux.setConsumoenergetico(consumo);
		aux.setPeso(peso);
		aux.setResolucion(resolucion);
		aux.setSintonizadorTDT(sintonizadorTDT);
		
		electrodomestico.add(aux);
		
	}

	private static void leerLavadora() {
		
		
		number = new Scanner(System.in);
		text = new Scanner(System.in);
		String color;
		char consumo = 'F';
		int peso, preciobase, carga;
		
		Lavadora aux;
		
		System.out.println("Ingrese el precio base: ");
		preciobase = number.nextInt();
		
		System.out.println("Ingrese el color: ");
		color = text.nextLine();
		
		System.out.println("Ingrese el peso: ");
		peso = number.nextInt();
		
		System.out.println("Ingrese el consumo energetico: ");
		consumo = text.next().charAt(0);
		
		System.out.println("Ingrese la carga: ");
		carga = number.nextInt();
	
		aux = new Lavadora();
		
		aux.setPreciobase(preciobase);
		aux.setColor(color);
		aux.setConsumoenergetico(consumo);
		aux.setPeso(peso);
		aux.setCarga(carga);
		
		electrodomestico.add(aux);
		
		
	}

}
