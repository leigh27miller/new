import com.revature.math.Calculator;

public class Main{
    public static void main(String[] args){
        try {
            int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[2]);

        Calculator c = new Calculator(a, b, args[1].charAt(0)); 
        //new keywords looks through the class
        c.calculate();

        } catch(Exception ex){
            System.out.println("Caught an exception");
        } finally {
            System.out.println("Always runs");
        }}}
       
        /*

        switch(args[1].toChar()) {
            case '+':System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case 'X': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
            default: System.out.println("Error");
    }
    */