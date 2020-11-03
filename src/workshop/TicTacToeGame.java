
package workshop;
import java.util.Scanner;
import java.util.Arrays;
public class TicTacToeGame {
static char[] game;
static char comp,user;
   public static void main(String[] args) {
		game=new char[10];
		System.out.println("lets play");
		playgame();
		option();
		showBoard();
		move() ;
	}
		
	public static void playgame() {
			for (int i=1;i<10;i++) {
				game[i]=' ';
				
				System.out.print(game [i]);
				
			 }
	}
    public static void option() {
			Scanner sc=new Scanner(System.in);
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
		  sc.close();
	   }
	  public static void showBoard() {
		  for(int i=1;i<game.length;i=i+3) {
			 System.out.println("|"+game[i]+"|"+game[i+1]+"|"+game[i+2]+"|"); 
		  }
	  }
	  public static void move() {
		  Scanner scan=new Scanner(System.in);
		  while(true) {
			System.out.println("Enter the slot to place"+user);  
		    int slot=scan.nextInt();
		    if(game[slot]==' ') {
			  game[slot]=user;
		    }
		    else {
			  System.out.println("invalid choise,Enter the choice");
		   }
	  }
    }
}	

	


