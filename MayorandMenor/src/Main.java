/// ogonz15 ///

import java.util.Scanner;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 0;
        System.out.printf("ingrese A" + "::");
        A = scanner.nextInt();

        /// variable B //
        int B = 0;
        System.out.printf("ingrese B" + "::");
        B = scanner.nextInt();

        /// variable C //
        int C = 0;
        System.out.printf("ingrese C" + "::");
        C = scanner.nextInt();
        System.out.printf("\n");
        System.out.println("el valor de A es " + A);
        System.out.println("el valor de B es " + B);
        System.out.println("el valor de C es " + C);

        if (A == B) {
            System.out.printf("\n");
            System.out.println("el valor de A es " + A);
            System.out.println("el valor de B es " + B);
            System.out.printf("los valores de A & B deben ser distintos:");
            System.out.printf("\n");
            return;
        }
        if (A == C) {
            System.out.printf("\n");
            System.out.println("el valor de A es " + A);
            System.out.println("el valor de C es " + C);
            System.out.printf("los valores de A & C deben ser distintos:");
            System.out.printf("\n");
            return;
        }
        if (B == A) {
            System.out.printf("\n");
            System.out.println("el valor de B es " + B);
            System.out.println("el valor de A es " + A);
            System.out.printf("los valores de B & A deben ser distintos:");
            System.out.printf("\n");
            return;
        }
        if (B == C) {
            System.out.printf("\n");
            System.out.println("el valor de B es " + B);
            System.out.println("el valor de C es " + C);
            System.out.printf("los valores de B & C deben ser distintos:");
            System.out.printf("\n");
            return;
        }

        if (C == A) {
            System.out.printf("\n");
            System.out.println("el valor de C es " + C);
            System.out.println("el valor de A es " + A);
            System.out.printf("los valores de C & A deben ser distintos:");
            System.out.printf("\n");
            return;
        }

        if (C == B) {
            System.out.printf("\n");
            System.out.println("el valor de C es " + C);
            System.out.println("el valor de B es " + B);
            System.out.printf("los valores de C & B deben ser distintos:");
            System.out.printf("\n");
            return;
        }
        //// 1
        if (A > B) {
            System.out.printf("\n");
            System.out.println("A es mayor que B; El valor de A es:" + A);
            System.out.printf("\n");
        } else
            System.out.println("B es mayor que A; El valor de B es:" + B);
        System.out.printf("\n");
        //// fin 1
        /// 2
        if (A > C) {
            System.out.printf("\n");
            System.out.println("A es el mayor que C ;El valor de A es:" + A);
            System.out.printf("\n");
        } else
            System.out.println("C es mayor que A;El valor de C es:" + C);
        System.out.printf("\n");
        /// fin 2

        //// 3
        if (B > A) {
            System.out.printf("\n");
            System.out.println("B es mayor que A; El valor de B es:" + B);
            System.out.printf("\n");
        } else
            System.out.println("A es mayor que B; El valor de A es:" + A);
        System.out.printf("\n");
        //// fin 3
        /// 4
        if (B > C) {
            System.out.printf("\n");
            System.out.println("B es el mayor que C ;El valor de B es:" + B);
            System.out.printf("\n");
        } else
            System.out.println("C es mayor que B;El valor de C es:" + C);
        System.out.printf("\n");
        /// fin 4

        //// 5
        if (A < B) {
            System.out.printf("\n");
            System.out.println("A es Menor que B; El valor de A es:" + A);
            System.out.printf("\n");
        } else
            System.out.println("B es Menor que A; El valor de B es:" + B);
        System.out.printf("\n");
        //// fin 5
        /// 6
        if (A < C) {
            System.out.printf("\n");
            System.out.println("A es el Menor que C ;El valor de A es:" + A);
            System.out.printf("\n");
        } else
            System.out.println("C es Menor que A;El valor de C es:" + C);
        System.out.printf("\n");
        /// fin 6

        //// 7
        if (B < A) {
            System.out.printf("\n");
            System.out.println("B es Menor que A; El valor de B es:" + B);
            System.out.printf("\n");
        } else
            System.out.println("A es Menor que B; El valor de A es:" + A);
        System.out.printf("\n");
        //// fin 7
        /// 8
        if (B < C) {
            System.out.printf("\n");
            System.out.println("B es el Menor que C ;El valor de B es:" + B);
            System.out.printf("\n");
        } else
            System.out.println("C es Menor que B;El valor de C es:" + C);
        System.out.printf("\n");
        /// fin 8


    }

}