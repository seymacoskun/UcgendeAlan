import java.util.Scanner;

public class Alan 
{
	public static void main(String[] args) 
	{
		double a, b, c;
		Scanner girdi = new Scanner(System.in);
		System.out.println("a kenarýný giriniz: ");
		a = girdi.nextDouble();
		System.out.println("b kenarýný giriniz: ");
		b = girdi.nextDouble();
		System.out.println("c kenarýný giriniz: ");
		c = girdi.nextDouble();
		
		double u = ((a+b+c)/2);
		double alan = Math.sqrt (u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Üçgenin alaný: " +alan);
	}
}
