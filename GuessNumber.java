import java.util.*;
class GuessNumber
{
    public static void main (String[] args) 
     {
        Scanner sc=new Scanner(System.in);
         int c=1,num,n,i;
         System.out.println("Input the max value to get guessed");
        int max=sc.nextInt();
         System.out.println("Input the min value to get guessed");
        int min=sc.nextInt();
         num=(int)(Math.random()*(max-min+1))+min;
         System.out.println("Input your value");
         n=sc.nextInt();
         while(num!=n)
        {
            
             if(num>n)
             {
                 System.out.println("Your guess is slightly low");
                 c++;
                 System.out.println("Guess other number");
                 n=sc.nextInt();
             }
             else if(num<n)
             {
                 System.out.println("Your guess is slightly high");
                 c++;
                 System.out.println("Guess other number");
                 n=sc.nextInt();
             }
         
        }
        System.out.println("Congratulations you cracked it");
              System.out.println("Attempt:"+c);
              System.out.println("Try again if you enjoyed");
              
     }

    
}
