import java.util.*;
import java.util.function.Predicate;

public class TrainConsistApp {

    static class GoodsBogie {
        String type;   // Rectangular / Cylindrical
        String cargo;  // Coal / Petroleum etc.

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==============================================\n");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Rectangular", "Coal"));      // valid
        bogies.add(new GoodsBogie("Cylindrical", "Coal"));      // invalid ❌
        bogies.add(new GoodsBogie("Rectangular", "Cement"));    // valid

        // Rule: Cylindrical → only Petroleum allowed
        Predicate<GoodsBogie> safetyRule = b ->
                !(b.type.equals("Cylindrical") && !b.cargo.equals("Petroleum"));

        System.out.println("All Goods Bogies:");
        bogies.forEach(System.out::println);

        // Apply safety filter
        List<GoodsBogie> safeBogies = bogies.stream()
                .filter(safetyRule)
                .toList();

        System.out.println("\nSafe Bogies:");
        safeBogies.forEach(System.out::println);

        // Identify violations
        System.out.println("\nUnsafe Bogies Detected:");
        bogies.stream()
                .filter(safetyRule.negate())
                .forEach(System.out::println);

        System.out.println("\nUC12 safety validation completed...");
    }
}