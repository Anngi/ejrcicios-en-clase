package ejercicio.pkg107;
import java.util.Scanner;

public class ejercico3 {
/*
 * N: Número de estudiantes.
 * PROEDE21: Promedio de la edad de los estudiantes mayores de 21 años.
 * PROEDRE: Promedio de la edad del resto de estudiantes.
 * COD: Código.
 * ED: Edad.
 */
public static void main(String[] args) {
Scanner E = new Scanner (System.in);

int N = 1;
int PROEDE21 = 0;
int PROEDRE = 0;
int COD;
int ED = 0;
int SUMA = 0;
System.out.println("Numero de estudiantes: ");
N = E.nextInt();

System.out.println("Codigo del estudiante: ");
COD = E.nextInt();

System.out.println("Edad del estudiante: ");
ED = E.nextInt();
SUMA = SUMA + 1;
PROEDE21 = PROEDE21 + N;
SUMA = SUMA + N/PROEDE21;

PROEDRE = PROEDRE + 1;
SUMA = SUMA * PROEDE21/PROEDRE;
System.out.println("El promedio de estudiantes mayores de 21 años es:"+PROEDE21);
System.out.println("El promedio del resto de estudiantes es:"+PROEDRE+PROEDE21);
}
    }
    

