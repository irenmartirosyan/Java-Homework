public class StatmentsUtil {
    //This class contains methods for practicing Java statements
    public static void main(String[] args) {
       System.out.println(IsEven(8));
       System.out.println(IsPositive(-4));
       System.out.println(IsChecking(7));
       System.out.println(IsDivisible(35));
       System.out.println(IsSeven(175));
       System.out.println(isInsideCircle(5 , 7));
       System.out.println(CheckYear(2026));
       printNum();
       printFirstDigit(348);
       printSum();
       printSquare(5);
       DivisionOnFive(15);
       ProductEvenNumbers(22);
        SumOfDigits(10707);
 }
    public static boolean IsEven(int x){
        if(x % 2 == 0){
            return true;
        }
        return false;
    }
    public static String IsPositive(int x){
        if(x < 0){
            return "Negative";
        }else if(x > 0){
            return "Positive";
        }
        return "X is Zero";
    }
    public static Boolean IsChecking(int x){
        return (x > 5 && x < 8) || (x < 20 && x > 15);

    }
    public static Boolean IsDivisible(int x){

        return(x % 5 == 0) && (x % 7 == 0);
    }
    public static Boolean IsSeven(int x){
        if((x / 10) % 10 == 7){
            return true;
        }
        return false;
    }
    public static boolean isInsideCircle(double x, double y) {
        return x * x + y * y <= 25;
    }
    public static boolean CheckYear(int y){
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
    public static void printNum(){
        for(int i = 1; i <= 200; i++){
            System.out.println(i);
        }
    }
    public static void printFirstDigit(int x){
        while(x >= 10){
            x /= 10;
        }
        System.out.println(x);
    }
    public static void printSum(){

        for(int x = 1, y = 0; x < 5 && y <10; x++, y++){
            System.out.println(x+y);
        }
    }
    public static void printSquare(int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void DivisionOnFive(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void ProductEvenNumbers(int n) {
        int product = 1;

        for (int i = 10; i <= n && i <= 99; i++) {
            if (i % 2 == 0) {
                product *= i;
            }
        }

        System.out.println(product);
    }
    public static void SumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }

    }
