

/**
 * The car class changes the fuel of a car object based on the fuel efficiency
 * 
 * @author Rob Norton
 * @version September 12 2014
 */
public class Car
{
    /** The fuel efficiency of the car in miles per gallon (mpg) */
    private int fuelEfficiency;
    
    /** The amount of fuel in the tank in gallons */
    private double fuelInTank;

    /**
     * Creates a car with a specified fuel efficiency
     */
    public Car(int fuelEff)
    {
        // initialise instance variables
        this.fuelEfficiency = fuelEff;
        this.fuelInTank = 0;
    }

    /**
     * Reduces the amount of fuel in the tank based on the miles driven and the fuel efficiency
     *
     * @pre        This method is never called if there is not enough fuel to travel the number of miles
     * @param    miles    number of miles driven
     */
    public void drive(int miles)
    {
        double gallonsUsed = miles/this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsUsed;
    }
    

    /**
     * Returns the number of gallons of gas remaining in this car's tank
     *
     * @return  number of gallons of gas remaining in this car's tank
     */
    public double getGasInTank()
    {
        return 0;
    }

    /**
     * Adds gas to tank
     *
     * @pre     Can't add a negative number to gas
     * @param   gas   amount of gas to add
     */
    public void addGas(double gas)
    {
        // put your code here
        this.fuelInTank = gas;
    }

}
