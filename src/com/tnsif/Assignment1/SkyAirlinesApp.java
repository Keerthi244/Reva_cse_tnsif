package com.tnsif.Assignment1;
import java.util.Scanner;

class FlightMessage 
{
    private String name;
    private String source;
    private String destination;

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setSource(String source) 
    {
        this.source = source;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void printMessage() 
    {
        System.out.println("Dear " + name + ", welcome onboard with service from " + source + " to " + destination + ". Thank you for choosing Sky Airlines. Enjoy your flight.");
    }
}


public class SkyAirlinesApp 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        // Get customer inputs
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter source");
        String source = scanner.nextLine();

        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        // Create FlightMessage object
        FlightMessage flightMessage = new FlightMessage();
        flightMessage.setName(name);
        flightMessage.setSource(source);
        flightMessage.setDestination(destination);

        // Print the message
        flightMessage.printMessage();

        // Close the scanner
        scanner.close();

	}

}
