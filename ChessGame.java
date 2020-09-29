
public class ChessGame {

	public static void main(String[] args) {

Chess();

	}

	public static void display() {
		String[][]bp= {{"|"+"♜"+"|","|"+"♞"+"|","|"+"♝"+"|","|"+"♛"+"|","|"+"♚"+"|","|"+"♝"+"|","|"+"♞"+"|","|"+"♜"+"|"},
								{"|"+"♟"+"|","|"+"♟"+"|","|"+"♟"+"|","|"+"♟"+"|","|"+"♟"+"|","|"+"♟"+"|","|"+"♟"+"|","|"+"♟"+"|",},
								{"|   ","|   ","|   ","|   ","|   ","|   ","|   ","|   ",},
								{"|   ","|   ","|   ","|   ","|   ","|   ","|   ","|   ",},
								{"|   ","|   ","|   ","|   ","|   ","|   ","|   ","|   ",},
								{"|   ","|   ","|   ","|   ","|   ","|   ","|   ","|   ",},
								{"|"+"♙"+"|","|"+"♙"+"|","|"+"♙"+"|","|"+"♙"+"|","|"+"♙"+"|","|"+"♙"+"|","|"+"♙"+"|","|"+"♙"+"|"},
								{"|"+"♖"+"|","|"+"♘"+"|","|"+"♗"+"|","|"+"♕"+"|","|"+"♔"+"|","|"+"♗"+"|","|"+"♘"+"|","|"+"♖"+"|"}};
		
		 
		System.out.println(" "+"  A "+"  B "+" C "+"  D "+"   E "+" F "+"  G "+"  H ");
		for (int i = 0; i < bp.length; i++) {
			System.out.println();
			System.out.println("----------------------------------");
			System.out.print(i+1);
			for (int j = 0; j < bp.length; j++) {
				System.out.print(bp[i][j]);
			}
		}
		
	}
	
	public static void Chess() {
		
		boolean[][] board= {{false,false,false,false,false,false,false,false},
						{false,false,false,false,false,false,false,false},
						{true,true,true,true,true,true,true,true},
						{true,true,true,true,true,true,true,true},
						{true,true,true,true,true,true,true,true},
						{true,true,true,true,true,true,true,true},
						{false,false,false,false,false,false,false,false},
						{false,false,false,false,false,false,false,false}};
		
		
		display();
		
		
	}
	
	
}
