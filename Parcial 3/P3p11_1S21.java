import java.util.Scanner;
public class P3p11_1S21{

static int k=0;
static int n,resultado1,factorialk,factorialn,factorialresta,resta;



	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el valor de n ");
		n=teclado.nextInt();
		resta();
		factoriales();
		division();


		System.out.println(resultado1);
	}



	public static void factoriales(){
		factorialn=1;
		factorialk=1;

		 for (int j = 1; j <= n; j++) {
            factorialn *= j;
        }

         for (int j = 1; j <= k; j++) {
            factorialk *= j;
        }

	}



	public static void resta(){
		factorialresta=1;

	resta=n-k;	
	 for (int j = 1; j <= resta; j++) {
            factorialresta*= j;
        }
    }
   
    	
    
	
	public static void division(){
		resultado1=factorialk*factorialresta/factorialn;
	}


}
