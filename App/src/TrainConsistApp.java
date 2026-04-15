import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC17 - Sort Bogie Names (Arrays.sort) ");
        System.out.println("======================================\n");

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General"
        };

        // Before Sorting
        System.out.println("Before Sorting:");
        for (String b : bogieNames) {
            System.out.println(b);
        }

        // -------- BUILT-IN SORT --------
        Arrays.sort(bogieNames);

        // After Sorting
        System.out.println("\nAfter Sorting (Alphabetical):");
        for (String b : bogieNames) {
            System.out.println(b);
        }

        System.out.println("\nUC17 sorting completed...");
    }
}