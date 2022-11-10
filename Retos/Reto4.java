package Retos;
import java.util.Scanner;
 
public class Reto4
{
    public static void main(String args[])
    {
        int Persona;
        int Computadora;

        System.out.println("piedra-papel-tijera");
        Scanner sc = new Scanner(System.in);
 
        Computadora = (int)(Math.random() * 3) + 1;
        System.out.println("La computadora ya escogio...");
 
        System.out.println("Seleccione 1=Piedra, 2=Papel, 3=Tijera: ");
        Persona = sc.nextInt();
 
        System.out.print("La computadora habia escogido: ");
        switch ( Computadora )
        {
            case 1:
                System.out.println("Piedra");
                switch ( Persona )
                {
                   case 1: System.out.println("Empate"); 
                   break;
                   case 2: System.out.println("Gano"); 
                   break;
                   case 3: System.out.println("Computadora Gana"); 
                   break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( Persona )
                {
                   case 1: System.out.println("Computadora Gana"); 
                   break;
                   case 2: System.out.println("Empate"); 
                   break;
                   case 3: System.out.println("Gano"); 
                   break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( Persona )
                {
                   case 1: System.out.println("Gano"); 
                   break;
                   case 2: System.out.println("Computadora Gana"); 
                   break;
                   case 3: System.out.println("Empate"); 
                   break;
                }
                break;
        }
        sc.close();
    }
}


