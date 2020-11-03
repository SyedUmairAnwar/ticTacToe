
package workshop;
import java.util.Scanner;
public class TicTacToeGame {
 static char[] game;
 static char comp,user;
	public static void main(String[] args) {
		game=new char[10];
		System.out.println("lets play");
		playgame();
		option();
		showBoard();
	}
		
	public static void playgame() {
			for (int i=0;i<10;i++) {
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
		  for(int i=0;i<game.length;i++) {
			 System.out.println("|"+game[i]+"|"+game[i+1]+"|"+game[i+2]+"|"); 
		  }
	  }
}	

	


