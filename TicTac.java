import java.util.Scanner;

public class TicTac {

	public static void main(String[] args) {

		Function();
	}
	
	static void print(int[]a) {
		System.out.println(a[0]+"|"+a[1]+"|"+a[2]+"|");
		System.out.println("------");
		System.out.println(a[3]+"|"+a[4]+"|"+a[5]+"|");
		System.out.println("------");
		System.out.println(a[6]+"|"+a[7]+"|"+a[8]+"|");
		System.out.println("------");
	}
	
	static void check(int[]a,boolean win) {
		if(a[0]==a[1]&&a[1]==a[2]||a[3]==a[4]&&a[4]==a[5]||a[6]==a[7]&&a[7]==a[8]||a[0]==a[3]&&a[3]==a[6]||a[1]==a[4]&&a[4]==a[7]||a[2]==a[5]&&a[5]==a[8]) {
			System.out.println("There is a win!");
			win=true;}
	}
	static void Function() {
		Scanner c=new Scanner(System.in);
		int a[]= {0,1,2,3,4,5,6,7,8};
		int x=0;
		int turn=0;
		boolean win=false;
		boolean b[]= {true,true,true,true,true,true,true,true,true};
		print(a);

		while(win==false || turn!=9) {
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=9");
			x=c.nextInt();
			while(b[x]==false) {
				System.out.println("Choose another place");
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=10;
			print(a);
			check(a,win);
			turn+=1;
			
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=9");
			x=c.nextInt();
			while(b[x]==false) {
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=9;
			print(a);
			check(a,win);
			turn+=1;
			
			
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=99");
			x=c.nextInt();
			while(b[x]==false) {
				System.out.println("Choose another place");
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=10;
			print(a);
			check(a,win);
			turn+=1;
			
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=9");
			x=c.nextInt();
			while(b[x]==false) {
				System.out.println("Choose another place");
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=9;
			print(a);
			check(a,win);
			turn+=1;
			
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=99");
			x=c.nextInt();
			while(b[x]==false) {
				System.out.println("Choose another place");
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=10;
			print(a);
			check(a,win);
			turn+=1;
			
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=9");
			x=c.nextInt();
			while(b[x]==false) {
				System.out.println("Choose another place");
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=9;
			print(a);
			check(a,win);
			turn+=1;
				
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=99");
			x=c.nextInt();
			while(b[x]==false) {
				System.out.println("Choose another place");
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=10;
			print(a);
			check(a,win);
			turn+=1;
			
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=9");
			x=c.nextInt();
			while(b[x]==false) {
				System.out.println("Choose another place");
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=9;
			print(a);
			check(a,win);
			turn+=1;
			
			System.out.println("Choose a number: 0,1,2,3,4,5,6,7,8; x=10, O=99");
			x=c.nextInt();
			while(b[x]==false) {
				System.out.println("Choose another place");
				 x=c.nextInt();
			}
			
			b[x]=false;
			a[x]=10;
			print(a);
			check(a,win);
			turn+=1;
			
			}
		}
		
}
