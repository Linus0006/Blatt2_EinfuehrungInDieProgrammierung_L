package h2;

public class H2_main {
    static void main(String[] args) {

        //Variables:
        int i = 528;
        int j = 15;
        int k = 23;
        int min = -1;
        int max = 13;

        if (i >= j && i >= k) {
            max = i;
            System.out.println(max);
        }
        if (j >= k && j >= i) {
            max = j;
            System.out.println(max);
        }
        if (k >= j && k >= i) {
            max = k;
            System.out.println(max);
        }
    }
}