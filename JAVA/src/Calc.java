// comment example

/**
 * example comment
 */
// TODO: что-то сделать когда-то


public class Calc {
    /**
     * 1.int -целое число: 1, 10, 100
     * 2. double - десятичное число, например 10.5 , 100.39
     * 3. boolean - логические числа, например true, false
     */
    public static void calc(double paramA, double paramB, char operation) {
        if (operation == '+') {
            System.out.println(paramA + paramB);
        } else if (operation == '-') {
            System.out.println(paramA - paramB);
        } else if (operation == '*') {
            System.out.println(paramA * paramB);
        } else if (operation == '/') {
            System.out.println(paramA / paramB);
        } else {
            System.out.println("Incorrect type of operation");
        }

    }
    public static void main (String[] args){
        calc(1 , 8, '+');
        calc(1 , 8, '-');
        calc(10 , 8, '*');
        calc(10 , 8, '/');

    }
}

