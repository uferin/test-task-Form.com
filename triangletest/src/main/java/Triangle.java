public class Triangle {

    public int check(int a, int b, int c){
        int rez = 0;
        if (a + b > c && a + c > b && b + c > a) {
            if ((a == b) && (b == c) && (c == a)) {
                rez = 3; //equilateral triangle
            } else if ((a == b) || (b == c) || (c == a)) {
                rez = 2; //isoscele triangle
            } else {
                rez = 1; //scalene triangle
            }
        } else  { rez = 4; //error
                }
        return rez;
    }
}
