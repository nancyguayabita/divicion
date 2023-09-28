package divicionnumeros;
import java.util.Scanner;
public class Divicionnumeros 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        float n1,n2,denny;
        System.out.println("ingresa el primer numero: ");
        n1=leer.nextFloat();
        System.out.println("ingresa el numero por el que sera dividido: ");
        n2=leer.nextFloat();
        denny=n1/n2;
        System.out.println("el resultado es: " + denny);
    }
    
}
