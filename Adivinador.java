package Adivinador;

	import java.util.Scanner;
	import java.util.Random;
	import java.lang.Thread;

public class Adivino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		boolean otra = true;
		boolean mas = true;
		
		while (otra) {
			
			int numaleat = rm.nextInt(10) + 1;
			
			System.out.println("-----------------------------------------");
			System.out.println("Bienvenido al juego de Adivinar el numero");
			System.out.println("-----------------------------------------");
			System.out.println(" ");
			System.out.println("Quieres que te adivine el numero? (S/N) ");
			String pregunta = sc.nextLine();
				
			if (pregunta.equals("S")) {
				System.out.println("Piensa en un numero del 1-10 solamente");
				System.out.println("cuando estes escribe 'ya': ");
				String comienzo = sc.nextLine();
				
				if (comienzo.equals("ya")) {
					System.out.println(numaleat);
					System.out.print(" Es ese? (S/N)");
					String respuesta = sc.nextLine();
					
					while (mas) {
					
					if (respuesta.equals("S")) {
						System.out.println("Vaya no, pa que despues digas");
						 try {
                             Thread.sleep(2000);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
						otra = true;
						mas = false;
						
					}else {
						numaleat = rm.nextInt(10) + 1; 
						System.out.println(numaleat);
						System.out.print("Es ese? (S/N)");
						respuesta = sc.nextLine();
					}
					
				}
		}
			}else if (pregunta.equals("N")) {
				System.out.println("Seguro? (S/N) ");
				String respuesta = sc.nextLine();
	            
				if (respuesta.equals("S")) {
	                otra = false;
				}else {
					otra = true;
				}
			}
	
		}
		
		sc.close();
        System.out.println("Ea pues vete a un monte");
		
	  	}
}
