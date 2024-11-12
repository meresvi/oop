package collections;

import java.util.*;

public class CarHomeworkDemo {

    //TODO: Create list of 1000 cars
//TODO: Pain each car RANDOMLY in one for following colors: red, green, blue
//TODO: put cars in separate lists based on their colors
//TODO: print size of each list
    public static String[] colors = {"yellow", "green", "blue"};

    public static void main(String[] args) {

        List<Car> carList = generateCars(3);

        System.out.println("Unsorted cars list");
        printCarColorsList(carList);
        System.out.println("Sorted cars list");
        System.out.println(sortCarsByColors(carList));
for(Map.Entry<String, List<Car>> entry: sortCarsByColors(carList).entrySet() ){
    System.out.println("there are " + entry.getValue().size() + " "+ entry.getKey() + " cars" );
}

    }

    public static List<Car> generateCars(int numberOfCars) {
        List<Car> cars = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfCars; i++) {
            String color = colors[random.nextInt(colors.length)];
            cars.add(new Car(color));
        }
        return cars;
    }

    public static void printCarColorsList(List<Car> c) {
        for (Car car : c) {
            System.out.println(car.getColor());
        }
    }

    public static Map<String, List<Car>> sortCarsByColors(List<Car> carList) {
        Map<String, List<Car>> carsByColors = new HashMap<>();
        for (String c: colors) {
        carsByColors.put(c, new ArrayList<>());

            }

        for (Car car: carList) {
            String color = car.getColor();
            if (carsByColors.containsKey(color)) {

                carsByColors.get(color).add(car);
            }
        }


        return carsByColors;
        }

    }


