
package workshop;
import java.util.Scanner;
public class TicTacToeGame {
 static char[] game;
 static char comp,user;
	public static void main(String[] args) {
		game=new char[10];
		System.out.println("lets play");
		playgame();
	}
		
		public static void playgame() {
			for (int i=0;i<10;i++) {
				game[i]=' ';
				
				System.out.print(game [i]);
				
			}}
		public static void option() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the option");
			char user=sc.next().charAt(0);
			if(user=='x') {
				comp='o';
			}
			else if(user=='o') {
				comp='x';
			}
			else {System.out.println("enter the correct value");}
		}
		
		}

	


