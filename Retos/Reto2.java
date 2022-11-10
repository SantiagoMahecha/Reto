package Retos;
import java.util.Scanner;

public class Reto2 
{
    public static void main(String[] argumentos) 
    {
       Scanner sc = new Scanner(System.in); 

            System.out.println("Ingresa Peso del bebe: ");
            float Peso = sc.nextFloat();
            System.out.println("Ingresa Meses del bebe: ");
            int Meses = sc.nextInt();
        
    
        double DosisVacuna = ((Peso + 10) /(Meses *10) * 8);
        System.out.printf("La dosis que necesita el bebe es de: %f", DosisVacuna);
        sc.close();
    }
}

