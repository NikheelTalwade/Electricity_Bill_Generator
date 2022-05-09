import java.util.Scanner;
class Electricity_Bill_Generator
{
public static void main(String[] args)
{
	System.out.println("Enter the number of units runned");
	Scanner s = new Scanner(System.in);
	double unit = s.nextInt();

	if(unit>0 && unit<=100   )
	{
		double energycharges = unit*1.45;
		double duty=5.52;
		double fixedcharges =30; 
		double total = energycharges+duty+fixedcharges;
		System.out.println("UNITS = " +unit);
		System.out.println("ENERGY CHARGES = " +energycharges);
		System.out.println("DUTY = " +duty);
		System.out.println("FIXED CHARGES = " +fixedcharges);
		System.out.println("-----------------------------------");
		System.out.println("YOUR BILL AMOUNT IS  = "+(total));

	}
	if(unit>101 && unit<=200)
	{
		double energycharges = unit*4.3;
		double duty=11.1;
		double fixedcharges =50; 
		double total = energycharges+duty+fixedcharges;
		System.out.println("UNITS = " +unit);
		System.out.println("ENERGY CHARGES = " +energycharges);
		System.out.println("DUTY = " +duty);
		System.out.println("FIXED CHARGES = " +fixedcharges);
		System.out.println("-----------------------------------");
		System.out.println("YOUR BILL AMOUNT IS  = "+(total));
	}
	 if(unit>201 && unit<=300)
	{
		double energycharges = unit*7.2;
		double duty=63.72;
		double fixedcharges =80; 
		double total = energycharges+duty+fixedcharges;
		System.out.println("UNITS = " +unit);
		System.out.println("ENERGY CHARGES = " +energycharges);
		System.out.println("DUTY = " +duty);
		System.out.println("FIXED CHARGES = " +fixedcharges);
		System.out.println("-----------------------------------");
		System.out.println("YOUR BILL AMOUNT IS  = "+(total));
	}
	 if(unit>301 && unit<=600)
	{
		double energycharges = unit*10;
		double duty=100;
		double fixedcharges =120; 
		double total = energycharges+duty+fixedcharges;
		System.out.println("UNITS = " +unit);
		System.out.println("ENERGY CHARGES = " +energycharges);
		System.out.println("DUTY = " +duty);
		System.out.println("FIXED CHARGES = " +fixedcharges);
		System.out.println("-----------------------------------");
		System.out.println("YOUR BILL AMOUNT IS  = "+(total));
	}
	 if(unit>601)
	{
		double energycharges = unit*15;
		double duty=150;
		double fixedcharges =200; 
		double total = energycharges+duty+fixedcharges;
		System.out.println("UNITS = " +unit);
		System.out.println("ENERGY CHARGES = " +energycharges);
		System.out.println("DUTY = " +duty);
		System.out.println("FIXED CHARGES = " +fixedcharges);
		System.out.println("-----------------------------------");
		System.out.println("YOUR BILL AMOUNT IS  = "+(total));
	}	
}
}