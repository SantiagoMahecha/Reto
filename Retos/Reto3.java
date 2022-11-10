package Retos;
import java.util.Scanner;
import java.util.Random;

public class Reto3 
{
    public static void main(String[] argumentos) 
    {
        
        Random rand = new Random();
        int TirarMoneda = Math.abs(rand.nextInt()) % 2;
        String resultado;
        int CoS;
        Scanner sc = new Scanner(System.in);

        System.out.println("CARA O SELLO");
        System.out.println("¿Que opcion desea?");
        System.out.println("Digite 1 para Cara o 2 para Sello");
        CoS = sc.nextInt();

        if (CoS == 1)
        {
        if (TirarMoneda == 1)
        {
            resultado= "Salio CARA, GANO!!!";
        System.out.println(resultado);
        }
        
        else 
        {
            resultado = "Salio SELLO, PERDIO:(((";
            System.out.println(resultado);
        }
        }

        else if (CoS == 2 )
        {
        if (TirarMoneda == 1)
        {
            resultado= "Salio CARA, PERDIO:(((";
        System.out.println(resultado);
        }
        
        else 
        {
            resultado = "Salio SELLO, GANO!!!";
            System.out.println(resultado);
        }
    }
    sc.close();
    } 
}
