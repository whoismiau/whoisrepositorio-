/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    List<Float> notas = new ArrayList<>();
	    System.out.println("digite suas notas");
	    int i = 0;
        while (i < 8) {
            notas.add(sc.nextFloat());
            i++;
        }    
        System.out.println("A nota do seu 1 bimestre é " + (notas.get(0) + notas.get(1)) / 2);
        System.out.println("A nota do seu 2 bimestre é " + (notas.get(2) + notas.get(3)) / 2);
        System.out.println("A nota do seu 3 bimestre é " + (notas.get(4) + notas.get(5)) / 2);
        System.out.println("A nota do seu 4 bimestre é " + (notas.get(6) + notas.get(7)) / 2);
        System.out.println("A nota do seu 1 bimestre é " + (notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3)) / 4);
        System.out.println("A nota do seu 2 bimestre é " + (notas.get(4) + notas.get(5) + notas.get(6) + notas.get(7)) / 4);
        System.out.println("A nota do seu ano é " + (notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3) + notas.get(4) + notas.get(5) + notas.get(6) + notas.get(7)) / 8);


	        
	    
	}
}