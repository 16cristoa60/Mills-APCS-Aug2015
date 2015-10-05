
/**
 * This code will produce a picture of a house.
 * 
 * @AileenCristo
 * @10/02/15
 */
public class LittleHouseOnThePrairie {
    public static void main(String[] args) {
        System.out.println("                    /");
        System.out.println("                   \\\\");
        System.out.println("                  ///");
        System.out.println("                 ---");
        System.out.println("                |   |");
        System.out.println("          ~~~~~~~~~~~");
        printRoof1();
        printRoof2();
        printChar('~',32);
        System.out.println();
        printBody1();
        printBodyMiddle();
        printBody2();
    }
    
    public static void printRoof1() {
        for(int i=1; i<=4; i++) {
            printChar(' ', -i+10);
            System.out.print(")");
            printChar('V', 2*i+9);
            System.out.println("(");
        }
    }
    
    public static void printChar (char ch, int number) {
        for(int i=1; i<= number; i++) {
            System.out.print(ch);
        }
    }
   
    public static void printRoof2() {
        for(int i=1; i<=6; i++) {
            printChar(' ', -i+6);
            System.out.print(")");
            printChar('V', 9);
            System.out.print("/");
            printChar(' ', 2*i-2);
            System.out.print("\\");
            printChar('V', 9);
            System.out.println("(");
        }
    }
    
    public static void printBody1() {
         for(int i=1; i<=3; i++) {
            printChar(':', 6);
            printChar('#', 4);
            printChar(':', 4);
            printChar('#', 5);
            printChar(':', 4);
            printChar('#', 4);
            printChar(':', 6);
            System.out.println();
        }
    }
    
    public static void printBodyMiddle () {
        printChar(':', 6);
        printChar('#', 4);
        printChar(':', 13);
        printChar('#', 4);
        printChar(':', 6);
        System.out.println();
    }
    
    public static void printBody2() {
        printTop();
        for(int i=1; i<=2; i++) {
             printChar(':', 6);
             printChar('#', 4);
             printChar(':', 4);
             System.out.print("I    I");
             printChar(':', 3);
             printChar('#', 4);
             printChar(':', 6);
             System.out.println();
        }
        printBottom();
    }
    
    public static void printTop() {
        printChar(':', 6);
        printChar('#', 4);
        printChar(':', 4);
        System.out.print("I~~~~I");
        printChar(':', 3);
        printChar('#', 4);
        printChar(':', 6);
        System.out.println();
    }
    
    public static void printBottom() {
        printChar(':', 14);
        System.out.print("I____I");
        printChar(':', 13);
        System.out.println();
    }
}
