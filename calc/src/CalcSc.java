public class CalcSc {
    public static void calcSc(double paramA, double paramB, char operation) {
        double result= 0;
        switch (operation){
            case '+':
            result = paramA + paramB;
            break;
            case '-':
                result = paramA - paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            default:
                System.out.println("Incorrect operation");
        }
        System.out.println("Результат операции " + operation + "="+result);
    }
    public static void main (String[] args) {
        calcSc(1, 8, '-');
        calcSc(1, 8, '+');
        calcSc(10, 8, '*');
        calcSc(10, 8, '/');
    }
}