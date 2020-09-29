import java.util.Scanner;

public class Disease {

	public static void Display(int [][]pop) {
		
		System.out.println("|"+pop[0][0]+"|"+pop[0][1]+"|"+pop[0][2]+"|"+pop[0][3]+"|"+pop[0][4]+"|");
		System.out.println("-----------");
		System.out.println("|"+pop[1][0]+"|"+pop[1][1]+"|"+pop[1][2]+"|"+pop[1][3]+"|"+pop[1][4]+"|");
		System.out.println("-----------");
		System.out.println("|"+pop[2][0]+"|"+pop[2][1]+"|"+pop[2][2]+"|"+pop[2][3]+"|"+pop[2][4]+"|");
		System.out.println("-----------");
		System.out.println("|"+pop[3][0]+"|"+pop[3][1]+"|"+pop[3][2]+"|"+pop[3][3]+"|"+pop[3][4]+"|");
		System.out.println("-----------");
	}
	
	public static void Infection(int [][]pop, int d){
		
		int infected=0;
		int rand=0;
		
		for (int i = 0; i < pop.length; i++) {
			for (int j = 0; j < pop[0].length; j++) {
				rand = (int)(Math.random() *10) + 1;
				if(pop[i][j]==2 &&j+1<pop[0].length&& pop[i][j+1]==0&& rand>5) {
					pop[i][j+1]=1;
				}
				rand = (int)(Math.random() *10) + 1;
				if(pop[i][j]==2 &&i+1<pop.length&& pop[i+1][j]==0&& rand>5) {
					pop[i+1][j]=1;
				}
				rand = (int)(Math.random() *10) + 1;
				if(pop[i][j]==2 && j-1>=0 && pop[i][j-1]==0&& rand>5) {
					pop[i][j-1]=1;
				}
				rand = (int)(Math.random() *10) + 1;
				if(pop[i][j]==2 && i-1>=0&& pop[i-1][j]==0&& rand>5) {
					pop[i-1][j]=1;
				}
			}
			
		}
	for (int i = 0; i < pop.length; i++) {
		for (int j = 0; j < pop[0].length; j++) {
			if(pop[i][j]==1) {
				pop[i][j]=2;
			}
		}
	}
		for (int i = 0; i < pop.length; i++) {
			for (int j = 0; j < pop[0].length; j++) {
				if(pop[i][j]==1 || pop[i][j]==2) {
					infected+=1;
				}
			}
		}
	
		d=d+1;
		Display(pop);
		
		System.out.println("There is "+infected+" infected on day "+d);
		
        Scanner c = new Scanner(System.in);
        System.out.println("Press 1 to continue");
        int a=c.nextInt();
        while(a!=1) {
        	System.out.println("You can continue");
        	a=c.nextInt();
        }
        Infection(pop, d);
	}
	
	public static void main(String[] args) {
	
		boolean[][] Population ={{false,true,true,true,true},
			     				{true,true,true,true,true},
			     				{true,true,true,true,true},
			     				{true,true,true,true,true}};
		
		
		int [][]pop={{2,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0}};
		
		Display(pop);
		int d=0;
		
		Infection(pop, d);
		

	}

}
