package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
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
	}
	catch(InputMismatchException e) {
		System.out.println("Input Error!!");
	}
	System.out.println("End of Program!!!");
	
	sc.close();
	}
}
