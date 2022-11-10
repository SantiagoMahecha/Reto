package Retos;
import java.util.*;

public class Reto8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite cuantos nadadores va a agregar:");
        int Cantidad= sc.nextInt();
        
        String[] Nombre= new String[Cantidad];
        double[] Tiempo=new double[Cantidad];

        for (int i=0;i<Cantidad;i++){

            System.out.println("Escriba nombre del competidor: "+ (i+1));
            Nombre[i]=sc.next();
            System.out.println("Escriba el tiempo del competidor: ");
            Tiempo[i]=sc.nextDouble();
        }

        for (int i = 0; i < Cantidad; i++) 
        {
            Arrays.sort(Tiempo);
            System.out.println(Nombre[i]+" "+ Tiempo[i]);
        }
        sc.close();
    }
}