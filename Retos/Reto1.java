package Retos;
import java.util.Scanner;

public class Reto1 
{
    public static void main(String[] argumentos) 
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Ingresa los grados fahrenheit: ");
            Float fahrenheit = sc.nextFloat();
        
       
        float centigrados = (fahrenheit - 32) / 1.8f;
        System.out.printf(fahrenheit + " grados fahrenheit son " +centigrados +" grados centigrados");
        sc.close();
    }
}




