public class segitigafor {
        public static void main(String args[]) {
            int[] a = { 2, 1, 4, 1, 7, 6, 2, 0, 8, 1};
            int x = 0;
            // Advanced for loop
            for (int i : a) {
                x = x + x;
            }
            System.out.println("Jumlah Dari Semua Elemen Array Adalah:" + x);
        }
    }

