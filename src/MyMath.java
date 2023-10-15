public class MyMath {
    public static void main(String args[])
    {
        int a;
        System.out.println(isEven(2));


        System.out.println(isEven(-2));
        System.out.println(isOdd(-7));
        System.out.println(isOdd(-5));
        System.out.println(isOdd(4));
        System.out.println(add(8,-6));
        System.out.println(minus(8,-6));
        System.out.println(division(8,-6));
        System.out.println(multiply(8,-6));
        System.out.println(mod(8,-6));
        System.out.println(autoIncr(8));
        System.out.println(autoIncr(-6));
        System.out.println(autoDecr(8));
        System.out.println(autoDecr(-6));


    }

    public static boolean isEven(int a){
        int reminder=a%2;
        return reminder == 0;
    }

    /**
     *  This method is used to check if the given number is odd or not
     *
     */
    public static boolean isOdd(int a){
        int reminder=a%2;
        return reminder != 0;
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }

    public static int mod(int a,int b){
        return a%b;
    }

    public static int autoIncr(int a){
        return ++a;
    }
    public static int autoDecr(int a){
        return --a;
    }



}
