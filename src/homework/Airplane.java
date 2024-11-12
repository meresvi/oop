package homework;


//TODO: add air company and flight number
//TODO: add hash code and equals that will compare company name and flight number
//TODO: add overload flyTo: destination, startAriport, transitAirport and print:
// Flight (flightNumber) of comapny (comapny) from to through

public class Airplane {

    String airCompany;
    String flightNumber;

    public Airplane(String airCompany) {
        this.airCompany = airCompany;
    }

    public void flyTo(String startAirport) {
        System.out.println("plane " + flightNumber + " is flying from " + startAirport);
    }

    public void flyTo(String startAirport, String destination) {
        System.out.println("plane " + flightNumber + " is flying from " + startAirport + " to " + destination);
    }

    public void flyTo(String startAirport, String destination, String transitAirport) {
        System.out.println("plane " + flightNumber + " is flying from " + startAirport + " to " + destination + " with a stop at " + transitAirport);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Airplane) {
            Airplane airplaneToCompare = (Airplane) o;
            if (this.flightNumber.equals(airplaneToCompare.flightNumber) && this.airCompany.equals(airplaneToCompare.airCompany)) {
                return true;
            }
            return false;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return flightNumber.hashCode();
    }

}
