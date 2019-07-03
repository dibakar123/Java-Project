
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id to be validated:");
		String productId= sc.nextLine();
		if(validateProductId(productId))
			System.out.println("Product Id is valid");
		else
			System.out.println("Product Id is invalid");
		sc.close();
		
	}

	static Boolean validateProductId(String productId){
		return(productId.matches("[#]{1}[A-Z]{2,3}[ ]{1}[0-9]{2}[ ]{1}[A-Z]{2,3}[-]{1}[0-9]{2,4}"));		
	}
}

