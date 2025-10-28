package h3;

public class H3_main {
    static void main(String[] args) {

        //Variables:

        int i = 201;
        int j = 100;
        int k = -10;

        boolean A1 = i > j;
        boolean A2 = i > 200;
        boolean A3 = j > 100;

        //compare based on i > j , i > 200 and j > 100

        if (A1 && A2 && A3){
            k = 3;
            System.out.println(k);
        }
        else if (A1 && A2) {
            k =2;
            System.out.println(k);

        }
        else if (A1) {
            k = 1;
            System.out.println(k);

        }
        else if (!A1 && !A2 && !A3){
            k = 4;
            System.out.println(k);
        }
        else {
            k = -10;
            System.out.println(k);
        }

    }
}
