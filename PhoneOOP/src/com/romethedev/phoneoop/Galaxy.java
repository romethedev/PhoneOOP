package com.romethedev.phoneoop;

//Create an IPhone and Galaxy classes. Both classes should extend from the Phone abstract class and implement the Ringable interface.
public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	System.out.print("Galaxy " + getVersionNumber() + " says ");
        return getRingTone();
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlocking via slide to unlock";
    }
    @Override
    public void displayInfo() {
        // your code here
    	System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery charge.");     
    }
}


