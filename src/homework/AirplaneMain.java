package homework;

public class AirplaneMain {

    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Ryanair");
        Airplane plane2 = new Airplane("Ryanair");
        Airplane plane3 = new Airplane("Ryanair");
        Airplane plane4 = new Airplane("KLM");

        plane1.flightNumber = "123";
        plane2.flightNumber = "234";
        plane3.flightNumber = "123";
        plane4.flightNumber = "234";


        plane1.flyTo("Palma", "Wroclaw", "Paris");
        plane2.flyTo("London");
        plane3.flyTo("Wroclaw","Paris");


        System.out.println(plane1.equals(plane2)); //same company, different flight number
        System.out.println(plane1.equals(plane3)); //same company, same flight number
        System.out.println(plane2.equals(plane4)); //different company, same flight number

        System.out.println(plane2.getClass());
    }
}
