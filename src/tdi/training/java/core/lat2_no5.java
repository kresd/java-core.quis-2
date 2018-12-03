package tdi.training.java.core;

public class lat2_no5 {
    public static void main(String[] args) {
        // Nomor 5
        System.out.println("NOMOR 5");
        int count = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= count; j--) {
                System.out.print(j + " ");

            }
            count++;
            System.out.println();
        }
        System.out.println("----------------------------");

    }
}