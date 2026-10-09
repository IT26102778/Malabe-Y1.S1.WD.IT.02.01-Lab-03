import java.util.Scanner;
public class IT26101731Lab3Q2{
	public static void main(String[] args){
		double T_Salary, Ot_Amount;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		double salary= input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		double Ot_Hours= input.nextDouble();
		
		System.out.println("Enter the OT hourly rate: ");
		double Ot_Rate= input.nextDouble();
		
		Ot_Amount=Ot_Hours * Ot_Rate;
		T_Salary= salary + Ot_Amount;
		
		System.out.println("The total salary including OT is "+ T_Salary);
		
		
	}
}