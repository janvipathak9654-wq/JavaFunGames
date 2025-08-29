

import java.util.*;
class LetterGuessing
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("You just have 5 attempts to guess");
        int c=1;
        char comp=(char)((int)(Math.random()*26)+'a');

        System.out.println("Guess the letter from a to z");
        char s=sc.next().charAt(0);
        while(comp!=s)
        {

            if(c>=5)
            {
                System.out.println("You exceeded the attempt");
                System.exit(0);
            }
            else if(s>comp)
            {
                System.out.println("You should guess lesser");
                System.out.println("Guess the letter again");
                s=sc.next().charAt(0);
                c++;
            }
            else if(s<comp)
            {
                System.out.println("You should guess higher");
                System.out.println("Guess the letter again");
                s=sc.next().charAt(0);
                c++;
            }

        }
        System.out.println("Congratulations You guessed it ");
        System.out.println("Attempts:"+c);
        System.out.println("Try again if u enjoyed");
    }
}