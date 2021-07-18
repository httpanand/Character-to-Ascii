import java.util.*;

public class unicode
{
    public static void main()
{   Scanner sc = new Scanner (System.in);
   
    System.out.println("Input a character to convert");
    char ch = sc.next().charAt(0);   
    
    int asciivalue = ch;

    System.out.println("Ascii value of " + ch  + " is " + asciivalue );


}}