/** 
Java 1. HomeWork 2
 @author Ramil'
 @version 18.01.2022
*/

class  HomeWork2 {
    public static void main(String[] args) {
        System.out.println(isBetween10And20(10, -2));
        System.out.println(isBetween10And20(12, 5));
        System.out.println(isBetween10And20(20, 1));
        
        isPositiveOrNegative(5);
        isPositiveOrNegative(0);
        isPositiveOrNegative(-5);
        
        System.out.println(isNegative(-5));
        System.out.println(isNegative(0));
        System.out.println(isNegative(5));
        
        repeatString("Hello, Java!", 3);
    }
    static boolean isBetween10And20(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }
    static void isPositiveOrNegative(int a) {
        System.out.println(a >=0? "Positive" : "Negative");
    }
    static boolean isNegative(int a) {
        return a < 0;
    }
    static void repeatString(String s, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(s);
    }
    }
    
}
