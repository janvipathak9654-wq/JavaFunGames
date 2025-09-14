import java.util.*;
 class RockPaperScissors
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("You have 3 chances to play");
	System.out.println("Choose 'a' for scissors");
        System.out.println("Choose 'b' for paper");
        System.out.println("Choose 'c' for rock");
		int c=0,k=3,cp=0,up=0;
		while(c<3)
		{
		    char co=(char)((int)(Math.random()*3)+'a');
		    System.out.println("Computer has chosen its side now its your turn");
		    char u=sc.next().charAt(0);
		    if(u!='a'&& u!='b' && u!='c')
		    {
		        System.out.println("Invalid input ");
		        System.out.println("Exit");
		        System.exit(0);
		    }
		    if((co=='a'&& u=='a')||(co=='b'&& u=='b')||(co=='c'&& u=='c'))
		    {
		        cp++;
		        up++;
		    }
		    else if(co=='a'&& u=='b')
		    cp++;
		    else if(co=='a'&& u=='c')
		    up++;
            else if(co=='b'&& u=='a')
		    up++;
            else if(co=='b'&& u=='c')
		    cp++;
            else if(co=='c'&& u=='a')
		    cp++;
            else if(co=='c'&& u=='b')
		    up++;
		    System.out.println("Computer had chosen : "+co);
            System.out.println("You had chosen : "+u);
            System.out.println("Computer score : " +cp);
            System.out.println("Your score : " +up);
            c++;
		    System.out.println("You are left with "+(k-c)+" more attempts");
		}
		if(up>cp)
	   System.out.println("Congratulations you are the winner with total score : "+up);
	   else if(up<cp)
	System.out.println("Computer is the winner with total score : "+cp);
	   else
	   System.out.println("It was a tie ");
      System.out.println("Give it a try again if you enjoyed");
	}
}