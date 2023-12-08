import java.util.Scanner;

public class P3p9_1S21 {
    static int n, i, cubo, factorialn, factoriali;
    static int[] valoresFactorialI; 
    static int sumatoria;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor de n ");
        n = teclado.nextInt();
        System.out.println("Ingresa el factorial de i");
        i = teclado.nextInt();

        cubo();
        factoriales();
        multiplicacion();
        sumatoria();

        System.out.println("La Sumatoria es de  " + sumatoria);
    }

    public static void factoriales() {
        factorialn = 1;
        factoriali = 1;

        for (int j = 1; j <= n; j++) {
            factorialn *= j;
        }

        for (int j = 1; j <= i; j++) {
            factoriali *= j;
        }
    }

    public static void cubo() {
        cubo = n * n * n;
    }

    public static void multiplicacion() {
        valoresFactorialI = new int[]{1, 2, 3}; 

        for (int j = 0; j < valoresFactorialI.length; j++) {
            valoresFactorialI[j] *= cubo;
        }
    }

    public static void sumatoria() {
        sumatoria = 0;

        for (int j = 0; j < valoresFactorialI.length; j++) {
            sumatoria += valoresFactorialI[j] / factorialn;
        }
    }
}

