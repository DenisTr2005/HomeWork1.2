public class Main {
    public static void main(String[] args) {
//Задача 6
        int a = 12, b = 27, c =44, d = 15, e =9, result;
        result = a * ( b + (c - d * e));
        result *= -1;
        System.out.println("Результат: " + result + "\n");

//Задача 7
        a = 5;
        b = 7;
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a =  " + a + " , b = " + b + "\n");

//Задача 8
        a = 389;
        b =  a % 100 / 10;
        System.out.println(b);

    }
}