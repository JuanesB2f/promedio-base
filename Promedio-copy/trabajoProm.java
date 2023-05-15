
/**
 * Write a description of class trabajoProm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class trabajoProm
{
         public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String[] identificaciones = new String[50];
          String[] nombres = new String[50];
          double[] semanauno= new double[50];
          double[] semanados = new double[50];
          double[] semanatres = new double[50];
          double[] semanacuatro = new double[50];
          int numeroPerfumes;
          String identificacion, nombre;
          double semana1, semana2, semana3, semana4;
          double promedio = 0;
          System.out.println("Digite el numero de perfumes segun el menu: ");
          numeroPerfumes = sc.nextInt();
          for (int i = 0; i < numeroPerfumes; i++) {
               System.out.println("Digite la identificacion del empleado: ");
               identificacion = sc.next();
               System.out.println("Digite el nombre del empleado: ");
               nombre = sc.next();
               System.out.println("Digite la venta de la semana uno del empleado: ");
               semana1 = sc.nextDouble();
               System.out.println("Digite la venta de la semana dos del empleado: ");
               semana2 = sc.nextDouble();
               System.out.println("Digite la venta de la semana tres del empleado: ");
               semana3 = sc.nextDouble();
               System.out.println("Digite la venta de la semana cuatro del empleado: ");
               semana4 = sc.nextDouble();
               identificaciones[i] = identificacion;
               nombres[i] = nombre;
               semanauno[i] = semana1;
               semanados[i] = semana2;
               semanatres[i] = semana3;
               semanacuatro[i] = semana4;
          }

          for (int i = 0; i < numeroPerfumes; i++) {
               promedio = promedio + ((semanauno[i] + semanados[i] + semanatres[i] + semanacuatro[i] ) / 4) / numeroPerfumes;
          }

          System.out.println("El promedio de ventas es: " + promedio);

          sc.close();
        }
// instance variables - replace the example below with your own
}
