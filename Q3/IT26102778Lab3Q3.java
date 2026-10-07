import java.util.Scanner;
public class IT26102778Lab3Q3{
    public static void main(String []args){
		int Amount,Remainder,Quotient;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Rupee amount:");
		Amount=input.nextInt();
		
		Quotient=Amount/5000;
		Remainder=Amount%5000;
		System.out.println("5000 Notes- " +Quotient);
		
		Quotient=Amount/1000;
		Remainder=Amount%1000;
		System.out.println("1000 Notes- " +Quotient);
		
		Quotient=Remainder/500;
		Remainder=Amount%500;
		System.out.println("500 Notes- " +Quotient);
		
		Quotient=Remainder/200;
		Remainder=Amount%200;
		System.out.println("200 Notes- " +Quotient);
		
		Quotient=Remainder/100;
		Remainder=Amount%100;
		System.out.println("100 Notes- " +Quotient);
		
		Quotient=Remainder/50;
		Remainder=Amount%50;
		System.out.println("50 Notes- " +Quotient);
		
		Quotient=Remainder/20;
		Remainder=Amount%20;
		System.out.println("20 Notes- " +Quotient);
		
		Quotient=Remainder/10;
		Remainder=Amount%10;
		System.out.println("10 Notes- " +Quotient);
		
		Quotient=Remainder/05;
		Remainder=Amount%05;
		System.out.println("05 Notes- " +Quotient);
		
		Quotient=Remainder/02;
		Remainder=Amount%02;
		System.out.println("02 Notes- " +Quotient);
		
		Quotient=Remainder/01;
		Remainder=Amount%01;
		System.out.println("01 Notes- " +Quotient);
	}
}