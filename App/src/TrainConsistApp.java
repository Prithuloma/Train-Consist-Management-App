public class TrainConsistApp {

    // Custom Exception for unsafe cargo
    static class UnsafeCargoException extends Exception {
        public UnsafeCargoException(String message) {
            super(message);
        }
    }

    // Goods Bogie class
    static class GoodsBogie {
        String type;   // Rectangular / Cylindrical
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        // Assign cargo with safety rule
        void assignCargo(String cargo) throws UnsafeCargoException {
            if (type.equals("Cylindrical") && !cargo.equals("Petroleum")) {
                throw new UnsafeCargoException(
                        "Cylindrical bogie can only carry Petroleum"
                );
            }
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new UnsafeCargoException(
                        "Rectangular bogie cannot carry Petroleum"
                );
            }
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("======================================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ---------- TRY-CATCH-FINALLY ----------
        try {
            b1.assignCargo("Petroleum"); // valid
            System.out.println("Assigned: " + b1);

            b2.assignCargo("Petroleum"); // invalid ❌
            System.out.println("Assigned: " + b2);

        } catch (UnsafeCargoException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            System.out.println("\nCleanup: Logging / closing resources...");
        }

        System.out.println("\nUC15 execution completed...");
    }
}