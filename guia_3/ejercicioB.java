package guia_3;
import java.util.Scanner;
public class ejercicioB {
	public static void main(String[] args) {
		int n1, n2, n3;
		int vec[] = new int [3];
		int orden;
  Scanner teclado = new Scanner(System.in);
   System.out.println("Ingrese 3 numeros.");
    n1=teclado.nextInt();
    n2=teclado.nextInt();
    n3=teclado.nextInt();
    System.out.println("En que orden desea mostrar los numeros 1(ascendente) ó 2(decreciente)");
	orden=teclado.nextInt();
	
	if(n1>n2 && n1>n3) {
		vec[0]=n1;
	}else if(n2>n1 && n2>n3){
		vec[0]=n2;
	}else {
		vec[0]=n3;
	}
	
	if(n1<n2 && n1<n3) {
		vec[2]=n1;
	}else if(n2<n1 && n2<n3){
		vec[2]=n2;
	}else {
		vec[2]=n3;
	}
	
	if((n1>n2 && n1<n3) || (n1<n2 && n1>n3)) {
		vec[1]=n1;
	}else if((n2>n1 && n2<n3) || (n2>n1 && n2>n3)){
		vec[1]=n2;
	}else {
		vec[1]=n3;
	}
	
	if (orden==2) {
	for (int i=0;i<3;i++) {
		System.out.print(vec[i]+" ");
	}}
	else {
		for (int i=2;i>=0;i--) {
			System.out.print(vec[i]+" ");
		}
	}
	}

}
