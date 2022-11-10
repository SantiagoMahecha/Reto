package Retos;
import java.util.Scanner;
import java.util.Random;

public class Reto6 
{
    public static void main(String[] args) 
    {
        int i = 0;
        int Dinero;
		int Perdida =1000;
        int Ganancia =1000;
        int Moneda;
        int CoS;
   
        System.out.println("Ingrese la cantidad de dinero para apostar");
		Scanner sc = new Scanner(System.in);
        Dinero = sc.nextInt();

        do 
        {
            Random Aleatorio = new Random();
            Moneda = Aleatorio.nextInt()%2+1;

            System.out.println("Eliga una opción: 2 Cara, 1 Cruz o 3 para dejar de jugar");
            CoS = sc.nextInt();
    
            if (CoS==Moneda) 
            {
                if(Moneda==1)
                {
                    System.out.println("Gano Cruz '1'");
                }
                else if(Moneda==2)
                {
                    System.out.println("Gano Cara '2'");
                }
                Dinero += Ganancia;
            }   
			else if(CoS == 3)
			{
				System.out.println("Usted jugo: " + i +" veces");
				System.out.println("Dinero final: "+Dinero);
				System.exit(CoS);
			}
            else
            {
                if(Moneda==1)
                {
                    System.out.println("Perdio Cruz '1'");
                }
                else if(Moneda==2)
                {
                    System.out.println("Perdio Cara '2'");
                }
                Dinero = Dinero - Perdida;
            }
            System.out.println("Su acumulado: "+Dinero);
            i++;
        }
		while(Dinero == 0);
        sc.close();
    }
}




