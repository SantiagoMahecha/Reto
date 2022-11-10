package Retos;
import java.util.Scanner;

public class Reto7 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite cuantas notas desea agregar ");
        int Cantidad= sc.nextInt();

        double Notas[]= new double[Cantidad];
        double suma=0;

        for(int i=0;i<Cantidad;i++)
        {
        System.out.println("Nota "+(i+1));
        Notas[i]=sc.nextDouble();
        suma = suma+Notas[i];
        }

        double promedio=(suma/Cantidad);
        if(promedio<30)
        {
            System.out.println(promedio +": Reprobaste");
        }
        else if((promedio>30)&&(promedio<40))
        {
            System.out.println(promedio +": Pasaste raspando");
        }
        else if(promedio>40)
        {
            System.out.println(promedio+": Aprobaste con buenos resultados");
        }
        sc.close();
    }
}


