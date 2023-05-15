
/**
 * Write a description of class VENTAS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class VENTAS
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int cantidadPerfumes;
        PerfumesPOO[] losPerfumes = new PerfumesPOO[50];
        String identificacion,nombre;
        double semana1, semana2, semana3, semana4;
        double promedio = 0;
        
        System.out.println("Digite la cantidad de perfumes");
        cantidadPerfumes = sc.nextInt();
        for( int i = 0; i < cantidadPerfumes; i++ )
        {
            System.out.println("Digite el numero de identificaion del empleado");
            identificacion = sc.next();
            System.out.println("Digite el nombre completo del empleado");
            nombre = sc.next();
            System.out.println("Digite la venta realizada en la semana uno");
            semana1 = sc.nextDouble();
            System.out.println("Digite la venta realizada en la semana dos");
            semana2 = sc.nextDouble();
            System.out.println("Digite la venta realizada en la semana tres");
            semana3 = sc.nextDouble();
            System.out.println("Digite la venta realizada en la semana cuatro");
            semana4 = sc.nextDouble();
            PerfumesPOO unPerfume = new PerfumesPOO();
            unPerfume.identificacion = identificacion;
            unPerfume.nombre = nombre;
            unPerfume.semanauno=semana1;
            unPerfume.semanados=semana2;
            unPerfume.semanatres=semana3;
            unPerfume.semanacuatro=semana4;
            losPerfumes[i] = unPerfume;
    
        }
        for (int i = 0; i < cantidadPerfumes; i++)
        {
            double sum = (losPerfumes[i].semanauno + losPerfumes[i].semanados + losPerfumes[i].semanatres + losPerfumes[i].semanacuatro)/4;
            promedio = promedio + sum /cantidadPerfumes;       
        }
        
        System.out.println("El promedio de la venta es : " + promedio);
    }

}
