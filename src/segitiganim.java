public class segitiganim {
    public static void main(String args[]) {

        int[] nim = {2, 1, 4, 1, 7, 6, 2, 0, 8,1 };
        int a = 0, b = 5, c = 1;
        while (c <= b) {
        int j = b, k = 1;
        while (j > c) {
        System.out.print(" ");
        j--;
        }
        while (k <= c) {
            if (a > 9) {
                System.out.print(" ");
                    } else {
                        System.out.print(nim[a] + " ");
                        a = a + 1;
                    }
        k++;
        }
        System.out.println();
        c++;
        }
}
}
