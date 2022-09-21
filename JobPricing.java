import java.util.Scanner;

public class JobPricing 
{
	public static void main (String [] args)
	{
		
		double price;
		double costOfMaterials;
		double travelingHours;
		double workingHours;
		String nameOfJob;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of job >>");
		nameOfJob = input.nextLine();
		System.out.println("Enter the cost of materials >> ");
		costOfMaterials = input.nextInt();
		System.out.println("How many hours do you required for this job? >> ");
		workingHours = input.nextInt();
		System.out.println("Time required for the travel >> ");
		travelingHours = input.nextInt();	
		input.close();
		
		price = jobEstimation(costOfMaterials, workingHours, travelingHours);
		System.out.print(nameOfJob+ " costs " +price);
		
	}
	public static double jobEstimation(double materials, double workingHours, double travelingHours)
	{
		final int HOURLY_WAGE = 35;
		final int TRAVELING_HOURS_PAYOUT = 12; 
		double estimatedPrice = materials + workingHours * HOURLY_WAGE + travelingHours * TRAVELING_HOURS_PAYOUT;
		return estimatedPrice;
	}

}
