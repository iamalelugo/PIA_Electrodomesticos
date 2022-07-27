import java.util.ArrayList;
import java.util.Scanner;

public class JavaProject {

	private static Scanner number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Electrodomesticos> electrodomestico = new ArrayList<Electrodomesticos>();
		
		int continuar = 1;
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
			
			case '1' : leerLavadora(); 
			
			case '2' : leerTelevision();
			
			case '3' : leerElectrodomestico();
			
			case '4' : 
				salir=true;
				break;
          
			default:
             System.out.println("Solo números entre 1 y 4");
             
			}
			
			System.out.println();
			
			System.out.println("Desea agregar otro dispositivo?[]1.SI / 2.NO:");
			continuar = number.nextInt();
			
		}while(continuar == 1);
		
	}

	private static void leerElectrodomestico() {
		// TODO Auto-generated method stub
		
	}

	private static void leerTelevision() {
		// TODO Auto-generated method stub
		
	}

	private static void leerLavadora() {
		// TODO Auto-generated method stub
		
	}

}
