/// ogonz15 ///
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ingrese nota" + ":" );
        System.out.printf("\n");
        int nota = scanner.nextInt();
        if (nota >= 1 && nota <= 2) {
            System.out.printf("Su calificación es:");
            System.out.printf("\n");
            System.out.printf("F");
            System.out.printf("\n");
        }
        if (nota >= 3 && nota <= 4) {
            System.out.printf("Su calificación es:");
            System.out.printf("\n");
            System.out.printf("D");
            System.out.printf("\n");
        }
        if (nota >= 5 && nota <= 6) {
            System.out.printf("Su calificación es:");
            System.out.printf("\n");
            System.out.printf("C");
            System.out.printf("\n");
        }
        if (nota >= 7 && nota <= 8) {
            System.out.printf("Su calificación es:");
            System.out.printf("\n");
            System.out.printf("B");
            System.out.printf("\n");
        }
        if (nota >= 9 && nota <= 10) {
            System.out.printf("Su calificación es:");
            System.out.printf("\n");
            System.out.printf("A");
            System.out.printf("\n");
        }

        else
        if(nota == 0 ) {
            System.out.printf("Numero no valido por favor verifique");
        }
        if(nota >= 11 && nota <= 999999999) {
            System.out.printf("Numero no valido por favor verifique");
        }

    }
}