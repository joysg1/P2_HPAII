import java.util.Scanner;
public class prog_2 {

	public static void main(String[] args) {
		int n;
		Scanner data = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de numeros que desea evaluar: ");
		n=data.nextInt();
		res2(n);
		
		

	}
	
	
	public static void res2(int a) {
		
		int i=0;
		int num;
		int mul5=0;
		int mul3=0;
		int mul2=0;
		int sumg=0;
		int sum5=0;
		int sum3=0;
		int sum2=0;
		Scanner data2= new Scanner(System.in);
		
		for(i=0; i<a; i++) {
			
			System.out.println("Introduzca el numero #"+(i+1)+":");
			num=data2.nextInt();
			if (num==0) {
				
				System.out.println("Ha ingresado el numero 0, fin de la ejecucion.");
				System.exit(0);
				
			}
			else if(num!=0) {
				if (num%5==0) {
					mul5=mul5+1;
					sum5=sum5+num;
				}
				
				else if(num%3==0) {
					mul3=mul3+1;
					sum3=sum3+num;
				}
				
				else if(num%2==0) {
					mul2=mul2+1;
					sum2=sum2+num;
				}
				sumg=sumg+num;
				
				
			}
			
			
			
			
			
			
		}
		
		System.out.println("");
		System.out.println("Multiplos del 5: "+mul5);
		System.out.println("Multiplos del 3: "+mul3);
		System.out.println("Multiplos del 2: "+mul2);
		System.out.println("");
		System.out.println("Suma general: "+sumg);
		System.out.println("Suma multiplos de 5: "+sum5);
		System.out.println("Suma multiplos de 3: "+sum3);
		System.out.println("Suma de los multiplos de 2: "+sum2);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
