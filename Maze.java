import java.util.Stack;

public class Maze {

	public static void main(String[] args) {

		//Mazerunning();
	//	Mazerunnin2g();
		// the maze represented as 2d array
				boolean[][] maze ={{true,false,false,false,false,false},
					     {true,true,true,true,false,false},
					     {false,false,false,true,false,false},
					     {false,false,false,true,true,false},
					     {false,false,false,false,false,false}};
				// 2 stacks of type int to represent the x-axis and y-axis
				// of the path walked by the program
				Stack<Integer> sx = new Stack<Integer>();
				Stack<Integer> sy = new Stack<Integer>();
				// pushing -1 so we wont get and error when using peek at first
				sx.push(-1);
				sy.push(-1);
				int x = 0;
				int y = 0;

				int bound = maze.length;

				while (true) {
					System.out.println("("+y+", "+x+")");
					if (y - 1 >= 0) {
						if (maze[x][y - 1] && sy.peek()!=y - 1) {
							sx.push(x);
							sy.push(y);
							y--;
							continue;
						}
					}
					if (y + 1 < bound && sy.peek()!=y + 1) {
						if (maze[x][y + 1]) {
							sx.push(x);
							sy.push(y);
							y++;
							continue;
						}
					}
					if (x + 1 < bound) {
						if (maze[x + 1][y] && sx.peek()!=x + 1) {
							sx.push(x);
							sy.push(y);
							x++;
							continue;
						}
					}
					//if x = 3 and y = 3 you reached the end
					if(x == 3   && y == 3) {
						System.out.println("finish");
						break;
					}
					
					//if you can't go to any direction you should go back and change maze[x][y] to false so you wont come back to the dead end again
					maze[x][y] = false;
					x = sx.pop();
					y = sy.pop();
				}
	}
public static void Mazerunning() {
	boolean[][]a= {{true,false,false,false},
			     {true,true,false,false},
			     {false,true,false,false},
			     {true,true,true,true}};
	
	int x=0;
	int y=0;
	int b=0;
	
	while(x!=3||y!=3) {
		System.out.println("Y="+x+"X="+y);
		/*for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
		}*/
		if(b!=2) {
			if(x+1<=3&&a[x+1][y]==true) {
				x=x+1;
				b=1;
				continue;
			}
		}
		if(b!=1) { 
			if(x-1>=0&&a[x-1][y]==true) {
				x=x-1;
				b=2;
				continue;
			}
		}
		if(b!=4) {
			if(y+1<=3&&a[x][y+1]==true) {
				y=y+1;
				b=3;
				continue;
			}
		}
		if(b!=3) { 
			if(y-1>=0&&a[x][y-1]==true) {
				y=y-1;
				b=4;
				continue;
			}
		}
		
		
		if(b==1) {
			a[x][y]=false;
			x=x-1;
			continue;
		}
		if(b==2) {
			a[x][y]=false;
			x=x+1;
			continue;
		}
		if(b==3) {
			a[x][y]=false;
			y=y-1;
			continue;
		}
		if(b==4) {
			a[x][y]=false;
			y=y+1;
			continue;
		}
		
			
		}
	System.out.println("Y="+x+"X="+y);
	System.out.println("Congratulations!");
	}
		     
			
public static void Mazerunnin2g() {
	boolean[][]a= {{true,false,false,false,false,false},
			     {true,true,true,true,false,false},
			     {false,false,false,true,false,false},
			     {false,false,false,true,true,false},
			     {false,false,false,false,false,false}};
	
	int x=0;
	int y=0;
	int b=0;
	
	while(x!=4||y!=3) {
		System.out.println("Y="+x+"X="+y);
		/*for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
		}*/
		if(b!=2) {
			if(x+1<=4&&a[x+1][y]==true) {
				x=x+1;
				b=1;
				continue;
			}
		}
		if(b!=1) { 
			if(x-1>=0&&a[x-1][y]==true) {
				x=x-1;
				b=2;
				continue;
			}
		}
		if(b!=4) {
			if(y+1<=3&&a[x][y+1]==true) {
				y=y+1;
				b=3;
				continue;
			}
		}
		if(b!=3) { 
			if(y-1>=0&&a[x][y-1]==true) {
				y=y-1;
				b=4;
				continue;
			}
		}
		
		
		if(b==1) {
			a[x][y]=false;
			x=x-1;
			continue;
		}
		if(b==2) {
			a[x][y]=false;
			x=x+1;
			continue;
		}
		if(b==3) {
			a[x][y]=false;
			y=y-1;
			continue;
		}
		if(b==4) {
			a[x][y]=false;
			y=y+1;
			continue;
		}
		
			
		}
	System.out.println("Y="+x+"X="+y);
	System.out.println("Congratulations!");
	}
		     
	
	
}

