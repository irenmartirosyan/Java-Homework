public class Operators {
    public static void main(String[] args) {

        //1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․

        int a = 8;
        int b = 6;

        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a % b = " + (a % b));

        //2․ Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.

        double c = 6.4;
        double d = 0.03;
        System.out.println("c + d = " + (c + d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c % d = " + (c % d));

        //3․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println("x = " + (x));
        System.out.println("y = " + (y));

        //4. Unary Operators

        int e = 10;
        int f = -88;
        boolean n1 = true;

        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        int k = 3;
        int t = ++k * 5 / k-- + --k;
        System.out.println("k is " + k);
        System.out.println("t is " + t);

        assignmentOperator();
        relationalOperators();
        popox1p();
        popox2p();
        additionalTasks();
        bitLogOp();
        shiftOp();
    }

    public static void assignmentOperator() {
        int x = (int) 1.0;
        short y = (short) 1921222;

        System.out.println(x);
        System.out.println(y);

        System.out.println(2147483647 + 1);


        boolean a = false;
        boolean b = (a = true);

        System.out.println(a);
        System.out.println(b);
    }

    public static void relationalOperators() {
        int x = 10;
        int y = 20;

        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
    }

    public static void additionalTasks() {
    //   1)  float y = 2.1
        float y = 2.1f; // chicht tarberak
      /*  2)  byte x = 5;
        byte y = 10;
        byte z = x + y;*/
        byte x = 5;
        byte k = 10;
        byte z = (byte) (x + k);
//  3)   short x = 10;
//       short y = 3;
//       short z = x * y;
        short a = 10;
        short b = 3;
        short res = (short)(a*b);


// 4)    long x = 10;
//       int y = 5;
//       y = y * x;
     long f = 10;
     int i = 5;
     i = (int)(f*i);





    }
    public static void popox1p(){
        int x = 7;
        int y = 1;
        int j = x;
        x = y;
        y = 7;
    }
    public static void popox2p(){
        int x = 7;
        int y = 1;
        x = x + y;
        y = x - y;
        x = x - y;
    }
    public static void bitLogOp(){
        int a = 8;
        int b = 3;
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(true || (a<4));
        System.out.println((b>=6)||(++a<=7));
        System.out.println((a<b)?a:b);
        System.out.println(b^b);


    }
    public static void shiftOp(){
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

    int a = 2;
    //* 8
         System.out.println(a<<3);
    //*16
         System.out.println(a<<4);

    }
}
