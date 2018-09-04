public class Triangle {

    public int check(int a, int b, int c){
        int rez = 0;
        if (a + b > c && a + c > b && b + c > a) {
            if ((a == b) && (b == c) && (c == a)) {
                rez = 3;
            } else if ((a == b) || (b == c) || (c == a)) {
                rez = 2;
            } else {
                rez = 1;
            }
        } else  { rez = 4; }
        return rez;
    }
}
