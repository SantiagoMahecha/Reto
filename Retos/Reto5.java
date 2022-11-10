package Retos;
import java.util.Scanner;

public class Reto5 
{
    public static void main(String[] args) {

        int Productos;
        double Valor;
        double Total = 0;
        
        System.out.println("¿Cuantos productos desea comprar?");
        Scanner sc = new Scanner(System.in);
        Productos = sc.nextInt();

        for(int i = 1; i <= Productos; i++)
        {
            System.out.println("Ingresar el precio del producto numero: " +i);
            Valor = sc.nextDouble();
            
            Total = Total + Valor;

        }
        System.out.println("El total a pagar es de:"+ Total);
        sc.close();
    }
}


A