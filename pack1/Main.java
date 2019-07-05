/* It is code for 2 objects matching check */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner sc = new Scanner(System.in);
		Product plist[] = new Product[2];
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter product 1 details:");
		String p1 = sc.nextLine();
		String a1[] = p1.split(",");
		plist[0] = new Product(a1[0], a1[1], sdf.parse(a1[2]), Double.parseDouble(a1[3]));
		System.out.println("Enter product 2 details:");
		p1 = sc.nextLine();
		a1 = p1.split(",");
		plist[1] = new Product(a1[0], a1[1], sdf.parse(a1[2]), Double.parseDouble(a1[3]));
		
		System.out.println("\nProduct 1");
		System.out.println(plist[0]);
		System.out.println("\nProduct 2");
		System.out.println(plist[1]);
		
		if(plist[0].equals(plist[1]))
			System.out.println("\nProduct 1 is same as Product 2");
		else
			System.out.println("\nProduct 1 and Product 2 are different");
		sc.close();
	}
}
