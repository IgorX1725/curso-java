package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		System.out.println("Enter client data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		
		System.out.print("Email:");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY):");
		Date birth = sdf.parse(sc.nextLine());
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		String status = sc.nextLine();
		
		Date currentDateHour = new Date();
		Order order = new Order(currentDateHour, OrderStatus.valueOf(status),new Client(name, email, birth));
		
		System.out.println();
		System.out.print("How many items to this order?");
		int qtdItems = sc.nextInt();

		for(int i = 0; i < qtdItems;i++) {
			System.out.println("Enter #"+(i+1)+" item data:");
			System.out.print("Product name:");
			String productName = sc.next();
			System.out.print("Product Price:");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity:");
			int quantityItem = sc.nextInt();
			order.addItem(new OrderItem(quantityItem, productPrice, new Product(productName, productPrice)));
		}
			System.out.println(order.toString());
		
		sc.close();
	}

}
