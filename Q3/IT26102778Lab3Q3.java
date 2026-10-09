import java.util.Scanner;
public class IT26102778Lab3Q3{
    public static void main(String []args){
	    int Amount=0;
		
		int count5000=0;
        int count1000=0;
		int count500=0;
		int count200=0;
		int count100=0;
		int count50=0;
        int count20=0;
		int count10=0;
		int count5=0;
		int count2=0;
		int count1=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the Amount:");
		Amount=input.nextInt();
		
		count5000=Amount/5000;
		Amount=Amount%5000;
		
		count1000=Amount/1000;
		Amount=Amount%1000;
		
		count500=Amount/500;
		Amount=Amount%500;
		
		count200=Amount/200;
		Amount=Amount%200;
		
		count100=Amount/100;
		Amount=Amount%100;
		
		count50=Amount/50;
		Amount=Amount%50;
		
		count20=Amount/20;
		Amount=Amount%20;
		
		count10=Amount/10;
		Amount=Amount%10;
		
		count5=Amount/5;
		Amount=Amount%5;
		
		count2=Amount/2;
		Amount=Amount%2;
		
		count1=Amount/1;
		Amount=Amount%1;
		
		System.out.println();
		System.out.println("5000 Notes- "+count5000);
		System.out.println("1000 Notes- "+count1000);
		System.out.println("500 Notes- "+count500);
		System.out.println("200 Notes- "+count200);
		System.out.println("100 Notes- "+count100);
		System.out.println("50 Notes- "+count50);
		System.out.println("20 Notes- "+count20);
		System.out.println("10 Notes- "+count10);
		System.out.println("5 Notes- "+count5);
		System.out.println("2 Notes- "+count2);
		System.out.println("1 Notes- "+count1);
		}
    }