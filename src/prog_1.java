import java.util.Scanner;
public class prog_1 {

	public static void main(String[] args) {
		int num;
		Scanner data = new Scanner (System.in);
		System.out.println("Ingrese el numero de personas a evaluar: ");
		num=data.nextInt();
		res(num);
		
		
				

	

}
	
	
	public static void res(int a) {
		
		
		
		Scanner data2= new Scanner (System.in);
		int i=0;
		float alt;
		float prom=0;
		float prom2=0;
		int c1=0;
		int c2=0;
		int c3=0;
		float mayor = Float.MIN_VALUE;
		float min =Float.MAX_VALUE;
		
		
		
		
		for(i=0; i<a; i++) {
			
			System.out.println("Introduzca la altura de la persona #"+(i+1)+":");
			alt=data2.nextFloat();
			prom=prom+alt;
			mayor = Float.max(mayor,alt);
			min = Float.min(min,alt);
			if(alt>1.8)
				c1=c1+1;
			else if(alt>=1.5 && alt<=1.8)
				c2=c2+1;
			else 
				c3=c3+1;
			
			
			
			
			
			
			
			
			
			
			
			
		}
		prom2=prom/a;
		System.out.println("");
		System.out.println("La altura promedio es de: "+prom2);
		System.out.println("Numero de personas altas: "+c1);
		System.out.println("Numero de personas medias: "+c2);
		System.out.println("Numero de personas bajas: "+c3);
		System.out.println("");
		System.out.println("La persona mas alta mide: "+mayor);
		System.out.println("La persona mas baja mide: "+min);
		
		
		
		
		
		
		
		
		
	}
	
}	
