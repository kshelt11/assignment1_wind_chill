import java.util.Scanner;

public class WindChill {

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		
		double temperature = Integer.MAX_VALUE;	//values won't ever be calculated with
		double windSpeed = Integer.MAX_VALUE;
		
		while(temperature > 40 || temperature < -45)
		{
		System.out.print("Input temperature (Fahrenheit) between -45 and 40: ");
		temperature = stdin.nextDouble();
		if(temperature > 40 || temperature < -45)
			System.out.println("Input out of bounds.");
		}
		
		while(windSpeed < 5 || windSpeed > 60)
		{
		System.out.print("Input wind speed (miles per hour) between 5 and 60: ");
		windSpeed = stdin.nextDouble();
		if(windSpeed <- 5 || windSpeed > 60)
			System.out.println("Input out of bounds.");
		}
		
		double windChill = 35.74 + 0.6215*temperature - 35.75*Math.pow(windSpeed,0.16) + 0.4275*temperature*Math.pow(windSpeed,0.16);
		
		System.out.println("The wind chill is "+windChill+" degrees Fahrenheit.");
		
		stdin.close();
	}
	
}
