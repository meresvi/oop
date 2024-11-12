package map;

import java.util.*;

public class MappingCartToOwners {


    public static void registerCar(Map<Car, List<CarOwner>> map, Car car, CarOwner owner) {
        map.computeIfAbsent(car, k -> new ArrayList<>()).add(owner);
    }


    public static void checkIfCarBelongsToMultipleOwners(Map<Car, List<CarOwner>> carOwnersMap) {
        for (Car car: carOwnersMap.keySet()
             ) {
            List<CarOwner> list = carOwnersMap.get(car);
            int length = list.toArray().length;
            if(length > 1){
                System.out.println(car.getColor() + ' '+ car.getModel() + " is owned by:");
    for(int i=0; i<length; i++){

        System.out.println(list.get(i).getFirstName() + ' ' + list.get(i).getLastName() );
    }

}

        }
    }



    public static void main(String[] args) {
        Map<Car, List<CarOwner>> ownersHasCars = new HashMap<>();
        CarOwner carOwner1 = new CarOwner("Svitlana", "Merezhko");
        CarOwner carOwner2 = new CarOwner("Vladyslav", "Mykhailov");
        CarOwner carOwner3 = new CarOwner("Andrii", "Mykhailov");

        Car car1 = new Car("black", "Jetta");
        Car car2 = new Car("green", "Passat cc");
        Car car3 = new Car("black", "Range Rover");

        ownersHasCars.computeIfAbsent(car1, k -> new ArrayList<>()).add(carOwner1);
        ownersHasCars.computeIfAbsent(car1, k -> new ArrayList<>()).add(carOwner2);
        ownersHasCars.computeIfAbsent(car2, k -> new ArrayList<>()).add(carOwner1);
        ownersHasCars.computeIfAbsent(car3, k -> new ArrayList<>()).add(carOwner2);

        checkIfCarBelongsToMultipleOwners(ownersHasCars);
    }




}
