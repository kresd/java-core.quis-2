package tdi.training.java.core;

public class lat2_no4 {
    public static void main(String[] args) {

        // Nomor 4
        System.out.println("NOMOR 4");
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    System.out.print(i * j + "      ");
                } else {
                    System.out.print(((Math.pow(i, j))) + "    ");
                }
            }

            System.out.println();
        }
        System.out.println("----------------------------");

    }
}