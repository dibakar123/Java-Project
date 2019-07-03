import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws NumberFormatException, ParseException {
		Scanner sc = new Scanner(System.in);
		List<Order> list= new ArrayList<Order>();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter the number of orders");
		int n= Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String s= sc.nextLine();
			String a[]=s.split(",");
			list.add(new Order(Integer.parseInt(a[0]),a[1],Double.parseDouble(a[2]),sdf.parse(a[3])));
		}
		Map<String,Integer> omap= Order.typeWiseCount(list);
		System.out.format("%-15s %s\n","Payment Type","Count");
		for(String t:omap.keySet()) {
			System.out.format("%-15s %s\n",t,omap.get(t));
		}
		sc.close();
	}
}
