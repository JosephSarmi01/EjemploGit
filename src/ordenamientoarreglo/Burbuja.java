
package ordenamientoarreglo;

import java.util.Scanner;

/**
 *
 * @author Joseph Sarmiento
 */
public class Burbuja 
{
    int[] a; //creación del arreglo
            
    public void ingresar()
    {
        Scanner s=new Scanner(System.in);
        System.out.println ("Ingrese el tamaño: ");
        int t=s.nextInt();
        
        a=new int[t]; //inicializar el arreglo
        
        for(int i=0; i<t; i++)
        {
            System.out.print ("Ingrese los valores: ");
            int val=s.nextInt();
            a[i]=val;
        }
        
        //imprimir();
    }
        
    public void ordenar()
    {
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                imprimir();
                System.out.println ("i="+i+" "+j);
                
                if(a[i]>a[j])
                {
                    int aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
                }
            }
        }
        imprimir();
    }
    
    public void imprimir()
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print (a[i]+" ");
        }
    }
}
