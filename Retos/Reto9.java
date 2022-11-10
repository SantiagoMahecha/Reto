package Retos;
import java.util.Scanner;
public class Reto9
{
    public static void main(String[]args)
    {   
        Scanner sc = new Scanner(System.in);

        int filas = 4, columnas = 4;

        String [][]Producto = new String[filas][columnas];
        int [][] precio = new int[filas][columnas];

        System.out.println("BIENVENIDO A LA MAQUINA DE DULCES");

        for(int f =0; f < filas;f++)
        {
            for(int c =0; c< columnas;c++)
            {
                System.out.println("Ingrese nombre del producto que se encuentra en la fila "+ f + " columna " + c);
                Producto[f][c] = sc.next();
                System.out.println("Ingrese el precio del producto " + Producto[f][c] +" que se encuentra en la fila "+ f + " columna " + c);
                precio[f][c] = sc.nextInt();
            }
        }
        
        for (int x=0; x < Producto.length; x++) 
        {  
            for (int y=0; y < Producto[x].length; y++) 
            { 
                System.out.print("Posicion "+x+y+" producto "+Producto[x][y] +"  precio "+precio[x][y]+ "\n");
                
            }
        }
        sc.close();
    }
    
}