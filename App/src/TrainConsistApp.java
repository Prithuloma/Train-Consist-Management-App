import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("======================================\n");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // DISPLAY bogies
        System.out.println("Bogie Details:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // REDUCE → sum of capacities
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, (a, b) -> a + b);

        // OUTPUT
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}