public class Main{
    public static void main (String[] args) {
        //String literal
        String str1 = "Hello World";
        String str2 = "Hello World"; /* these are two different references
        pointing to the same object. This means that all strings in java are immutable. 
        You cannot change a string*/

        //comparing strings
        //System.out.println(str1.compareTo(str2));

        //char array
        char[] helloArray = {'h','e','l','l','o'};
        String helloString = new String(helloArray);

        str1 = "hello";
        //str2 = "hello";
        str2 = new String("hello");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        //StringBuilder - mutable string, not threadsafe
        //StringBuffer - is threadsafe(must slower)
        //use one of the two above if you think you'll change a string 

        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        sb.toString(); //toString converts it into a string 
    }
}