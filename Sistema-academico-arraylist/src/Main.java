import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[10];
        //Asignamos valores a cada posicion
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota del estudiante " + i);
            notas[i] = sc.nextDouble();
        }
        System.out.println("El promedio de las notas es: " + promedio(notas));
        System.out.println("La nota maxima del curso es: " + notamaxima(notas));
        System.out.println("La nota minima del curso es: " + notaminima(notas));
        System.out.println("Cantidad de estudiantes que aprobaron: " + cantidadaprobado(notas));

    }

    public static double promedio(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static double notamaxima(double notas[]) {
        double notamax = 0;
        for (double nota : notas) {
            if (nota > notamax) {
                notamax = nota;
            }
        }
        return notamax;
    }

    public static double notaminima(double notas[]) {
        double notamin = 5;
        for (double nota : notas) {
            if (nota < notamin) {
                notamin = nota;
            }
        }
        return notamin;
    }

    public static byte cantidadaprobado(double notas[]) {
        byte cant = 0;
        for (double nota : notas) {
            if (nota >= 3) {
                cant++;
            }
        }
        return cant;
    }
}