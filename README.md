# PhoneOOP
Phone Assignment
In this assignment, we are going to use Abstract classes and Interfaces to create 2 types of phones: iPhone and Galaxy.

Objectives:
Define classes.

Define Interfaces.

Implement classes that use abstract classes and interfaces.

Tasks:
Create a Phone abstract class.

Phone.java
public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
}
copy
Create a Ringable interface that contains the following methods:

ring(): This method returns a String.
unlock(): This method returns a String.
Ringable.java
public interface Ringable {
    // your code here
}
copy
Create an IPhone and Galaxy classes. Both classes should extend from the Phone abstract class and implement the Ringable interface.

IPhone.java
public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    }
    @Override
    public String unlock() {
        // your code here
    }
    @Override
    public void displayInfo() {
        // your code here            
    }
}
copy
Galaxy.java
public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    }
    @Override
    public String unlock() {
        // your code here
    }
    @Override
    public void displayInfo() {
        // your code here            
    }
}
copy
Implement the overriden methods (ring, unlock, displayInfo) from the IPhone and Galaxy classes according to the PhoneTester file below:
