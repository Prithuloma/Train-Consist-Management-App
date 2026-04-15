import java.util.regex.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("======================================\n");

        // Sample inputs
        String trainId1 = "TRN-1234";
        String trainId2 = "TRAIN12";

        String cargo1 = "CG-567";
        String cargo2 = "CARGO99";

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "CG-\\d{3}";

        // Validate Train IDs
        System.out.println("Train ID Validation:");
        System.out.println(trainId1 + " -> " + isValid(trainId1, trainPattern));
        System.out.println(trainId2 + " -> " + isValid(trainId2, trainPattern));

        // Validate Cargo Codes
        System.out.println("\nCargo Code Validation:");
        System.out.println(cargo1 + " -> " + isValid(cargo1, cargoPattern));
        System.out.println(cargo2 + " -> " + isValid(cargo2, cargoPattern));

        System.out.println("\nUC11 validation completed...");
    }

    // Method using Pattern + Matcher
    public static boolean isValid(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}