public class TrainConsistApp {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Bogie class with validation
    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Invalid capacity for " + name + " : " + capacity
                );
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("======================================\n");

        try {
            // Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 56);

            // Invalid bogie (will throw exception)
            PassengerBogie b3 = new PassengerBogie("First Class", -10);

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3); // won’t execute

        } catch (InvalidCapacityException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nUC14 validation completed...");
    }
}