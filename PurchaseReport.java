// Code reviewed by @professorgordon
//Kyungjin Jang
public class PurchaseReport 
{

	public static void main(String[] args) 
	{
		double shirt = 21.99;
		double pants = 49.97;
		double shoes = 89.50;
		double belt = 19.99;
		double coat = 129.95;
		double total = 311.40;
		System.out.println("=========================");
		System.out.println("Purchase Report");
		System.out.println("=========================");
		System.out.printf("Shirt\t	   $%.2f\n", shirt);
		System.out.printf("Pants\t	   $%.2f\n", pants);
		System.out.printf("Shoes\t	   $%.2f\n", shoes);
		System.out.printf("Belt\t	   $%.2f\n", belt);
		System.out.printf("Coat\t	  $%.2f\n", coat);
		System.out.println("=========================");
		System.out.printf("Total\t	  $%.2f\n", total);
	

	}

}
