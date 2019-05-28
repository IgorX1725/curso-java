package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void method1() {
		System.out.println("*** START METHOD1 ***");
		method2();
		System.out.println("*** START METHOD1 ***");
	}
	
	public static void method2() {
		
		System.out.println("*** START METHOD2 ***");
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Digite os nomes para serem armazenados no array");
		String[] vect = sc.nextLine().split(" ");
		System.out.println("Digite a posição que deseja acessar no array criado:");
		int index = sc.nextInt();
		
		System.out.println(vect[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Invalid Position!!!!");
			e.printStackTrace();
			sc.hasNext();
		}
		catch(InputMismatchException e) {
			System.out.println("Input Error!!");
		}
		
		sc.close();
		System.out.println("*** END METHOD2 ***");
		}
	public static void main(String[] args) {
		method1();
		
		}
}
