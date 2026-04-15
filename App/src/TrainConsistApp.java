import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("======================================\n");

        // Sorted bogie IDs (IMPORTANT)
        String[] bogieIds = {
                "BG101",
                "BG150",
                "BG205",
                "BG220",
                "BG310"
        };

        String searchId = "BG205"; // change to test

        // DISPLAY
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // -------- BINARY SEARCH --------
        int left = 0;
        int right = bogieIds.length - 1;
        int position = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int compare = bogieIds[mid].compareTo(searchId);

            if (compare == 0) {
                position = mid;
                break;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // RESULT
        if (position != -1) {
            System.out.println("\nBogie ID " + searchId + " found at position: " + position);
        } else {
            System.out.println("\nBogie ID " + searchId + " not found");
        }

        System.out.println("\nUC19 binary search completed...");
    }
}