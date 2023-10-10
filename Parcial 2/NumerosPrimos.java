public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos del 1 al 10:");
        
        for (int i = 2; i <= 10; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}