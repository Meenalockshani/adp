    import java.io.*;
public class SumOfNumbers
{
    public static void main(String arg[])
    {
        int input = 6;
        int sum = 0;
        
        for(int i = 1; i <= input; i++)
        {
            sum = sum + i;   
            
        }
        
       
        System.out.println("Sum of numbers " + input + " is " + sum); 
    
    }
}
