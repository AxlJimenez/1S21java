import java.util.Scanner;
public class P3p9_1S21{


    static int i,n,a,cubo,multiplicacion,sumatoria;
    static int factorialn,factoriali;


	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa el valor de n ");
		n=teclado.nextInt();
		System.out.println("Ingresa el factorial de i" );
		i=teclado.nextInt();
		System.out.println(factorialn);
	}



	public static void factoriales(){
		for(i=0;i<n;i++){
		    factorialn=1;
		    if (i==0) factorialn=1;
		    else{
		    	for (a=i;a>0;a--){
		    		factorialn*=a;
		    	}
		    }
		
    }
    }
  

		



	public static void cubo(){
		cubo=n*n*n;

	}

	public static void multiplicacion(){
		multiplicacion=factoriali*cubo;
	}


	public static void sumatoria(){
		sumatoria=multiplicacion/factorialn;
	}
} 