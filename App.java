public class App{
	
	public static void main(String []args){
		String a,b;
		int somma;
	a=args[0];
	b=args[1];
	int c = Integer.parseInt(b); 
	somma=0;
	while(c!=0){
		somma = somma+Integer.parseInt(a);
		c--;
	}
		
		System.out.println("Somma: "+somma);
		
	}
}