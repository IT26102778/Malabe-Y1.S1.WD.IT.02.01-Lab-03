import java.util.Scanner;
public class IT26102778Lab3Q1A{
    public static void main(String []args){
	    double price,kg,T_amount;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		price=input.nextDouble();
		
		System.out.print("Enter the Quantity of rice:");
		kg=input.nextDouble();
		
		T_amount= price*kg;
		System.out.print("Total amount is "+T_amount);
	}
}