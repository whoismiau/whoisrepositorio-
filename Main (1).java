import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Digite sua temperatura em graus celsius");
	   float temp = sc.nextFloat();
	   float frh = temp * 9/5 + 32;
	   float klv = temp + 273.15f;
	   System.out.println("sua temperatura em celsius em farenheint e kelvin são respectivamente");
	   System.out.println(temp);
	   System.out.println(frh);
	   System.out.println(klv);
	        
	    
	}
}