package PiedraPapelTijeras;

import java.util.Scanner; //se utiliza para leer la entrada del usuario.

public class PiedraPapelTijeras {
	public static void main(String args[])
    {
        System.out.println("Juego piedra-papel-tijera");
        //crea una instancia de Scanner llamada teclado para 
        //leer la entrada del usuario desde la consola.
        Scanner teclado = new Scanner(System.in);
 
        //Variable para que la maquina escoga un numero entre 1 y 3
        int seleccionCompu = (int)(Math.random() * 3) + 1;
        System.out.println("El ordenador ya escogio...");
 
        //menu de seleccion una vez se la maquina haya seleccionado
        System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
        //lee lo que a puesto el usuario y lo guarda
        int seleccionUsuario = teclado.nextInt();
        
        //se verifica si el objeto teclado no es null y, en ese caso, 
        //se llama al método close() para cerrarlo.
        if (teclado != null) {
            teclado.close();
        }
        
        
        System.out.print("El ordenador habia escogido: ");
        switch ( seleccionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Usted gana!"); break;
                   case 3: System.out.println("El ordenador gana!"); break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("El ordenador gana!"); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Usted gana!"); break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Usted gana!"); break;
                   case 2: System.out.println("El ordenador gana!"); break;
                   case 3: System.out.println("Empate!"); break;
                }
                break;
        }
    }
}
