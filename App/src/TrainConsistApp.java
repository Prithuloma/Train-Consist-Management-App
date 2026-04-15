public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("======================================\n");

        // Unsorted bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG150",
                "BG310",
                "BG220"
        };

        String searchId = "BG150"; // change to test

        // DISPLAY all IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // -------- LINEAR SEARCH --------
        boolean found = false;
        int position = -1;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchId)) {
                found = true;
                position = i;
                break;
            }
        }

        // RESULT
        if (found) {
            System.out.println("\nBogie ID " + searchId + " found at position: " + position);
        } else {
            System.out.println("\nBogie ID " + searchId + " not found");
        }

        System.out.println("\nUC18 linear search completed...");
    }
}