package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>(); 
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char typeProduct = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Price:");
			Double price = sc.nextDouble();
			switch(typeProduct) {
				case 'i':
					System.out.print("Customs free:");
					Double customsFree = sc.nextDouble();
					products.add(new ImportedProduct(name, price, customsFree));
					break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/AAAA):");
					Date manufactureDate = sdf.parse(sc.next());
					products.add(new UsedProduct(name, price, manufactureDate));
					break;
				case 'c':
					products.add(new Product(name, price));
					break;
			}
		}
		System.out.println("PRICE TAGS:");
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
