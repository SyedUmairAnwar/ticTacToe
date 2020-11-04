
package workshop;
import java.util.*;
public class TicTacToeGame {
static char[] game=new char[10];
static char comp,user;
static Scanner sc;
   public static void main(String[] args) {
		System.out.println("lets play");
		playgame();
	    char p=option();
		showBoard();
		move(p);
	}
		
	public static void playgame() {
			for (int i=1;i<10;i++) {
				game[i]=' ';
				
				System.out.print(game [i]);
				
			 }
	}
    public static char option() {
			 sc=new Scanner(System.in);
			System.out.println("enter the option");
			char user=sc.next().charAt(0);
			int count=0;
			while (count==0) {
			    if(user=='x'||user=='X') {
				comp='o';
				count++;
			    }
			    else if(user=='o'|| user=='O') {
				comp='x';
				count++;
			    }
			    else {System.out.println("enter the correct value");
			    user=sc.next().charAt(0);
			    }
			} 
		return user;
	   }
	  public static void showBoard() {
		  for(int i=1;i<game.length;i=i+3) {
			 System.out.println("|"+game[i]+"|"+game[i+1]+"|"+game[i+2]+"|"); 
		  }
	  }
	  public static void move(char p) {

		  int see=0;
		  while(see==0) {
			   sc=new Scanner(System.in);
			System.out.println("Enter the slot to place" );  
		    int slot=sc.nextInt();
		    if(game[slot]==' ') {
			  game[slot]=p;
			  see++;
			  break;
		    }
		    else {
			  System.out.println("invalid choise,Enter the choice");
		   }
		}
		  showBoard();	  
    }
}	

	


