public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int Cars, Drivers, Passengers, CarsNotDriven, CarsDriven;
        double SpaceInACar, CarpoolCapacity, AveragePassengersPerCar;

        Cars = 100;
        SpaceInACar = 4.0;
        Drivers = 30;
        Passengers = 90;
        CarsNotDriven = Cars - Drivers;
        CarsDriven = Drivers;
        CarpoolCapacity = CarsDriven * SpaceInACar;
        AveragePassengersPerCar = Passengers / CarsDriven;
		
		
        System.out.println( "There are " + Cars + " cars available." );
        System.out.println( "There are only " + Drivers + " drivers available." );
        System.out.println( "There will be " + CarsNotDriven + " empty cars today." );
        System.out.println( "We can transport " + CarpoolCapacity + " people today." );
        System.out.println( "We have " + Passengers + " to carpool today." );
        System.out.println( "We need to put about " + AveragePassengersPerCar + " in each car." );
    }
}