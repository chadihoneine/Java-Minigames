import java.util.Scanner;

public class Puissance {

	public static void main(String[] args) {

Puissance4();

	}
	
	public static void print(int[]a) {
		System.out.print("|"+a[0]+" "+"|"+"|"+a[1]+" "+"|"+"|"+a[2]+" "+"|"+"|"+a[3]+" "+"|"+"|"+a[4]);
		System.out.println();
		System.out.print(" -----------------");
		System.out.println();
		System.out.print("|"+a[5]+" "+"|"+"|"+a[6]+" "+"|"+"|"+a[7]+" "+"|"+"|"+a[8]+"| "+"|"+a[9]);
		System.out.println();
		System.out.print(" -----------------");
		System.out.println();
		System.out.print("|"+a[10]+"|"+"|"+a[11]+"|"+"|"+a[12]+"|"+"|"+a[13]+"|"+"|"+a[14]);
		System.out.println();
		System.out.print(" -----------------");
		System.out.println();
		System.out.print("|"+a[15]+"|"+"|"+a[16]+"|"+"|"+a[17]+"|"+"|"+a[18]+"|"+"|"+a[19]);
		System.out.println();
	}
	
	public static void check(int[]a,boolean win) {
		if(a[0]==a[5]&&a[5]==a[10]&&a[10]==a[15]||a[1]==a[6]&&a[6]==a[11]&&a[11]==a[16]||a[2]==a[7]&&a[7]==a[12]&&a[12]==a[17]||a[3]==a[8]&&a[8]==a[13]&&a[13]==a[18]||a[4]==a[9]&&a[9]==a[14]&&a[14]==a[19]
				||a[0]==a[1]&&a[1]==a[2]&&a[2]==a[3]||a[5]==a[6]&&a[6]==a[7]&&a[7]==a[8]||a[10]==a[11]&&a[11]==a[12]&&a[12]==a[13]||a[15]==a[16]&&a[16]==a[17]&&a[17]==a[18]
						||a[1]==a[2]&&a[2]==a[3]&&a[3]==a[4]||a[6]==a[7]&&a[7]==a[8]&&a[8]==a[9]||a[11]==a[12]&&a[12]==a[13]&&a[13]==a[14]||a[16]==a[17]&&a[17]==a[18]&&a[18]==a[19]
								||a[0]==a[6]&&a[6]==a[12]&&a[12]==a[18]||a[1]==a[7]&&a[7]==a[13]&&a[13]==a[19]||a[15]==a[11]&&a[11]==a[7]&&a[7]==a[3]||a[16]==a[12]&&a[12]==a[8]&&a[8]==a[4]);
	}
public static void Puissance4() {
	Scanner c=new Scanner(System.in);
	
	int[]a= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	boolean b[]= {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
	boolean win=false;
	int x=0;
	
	print(a);
	
	while (win=false) {
		
		System.out.println("Choose a number: between 0 to 19; x=100, O=99");
		x=c.nextInt();
		while(b[x]==false) {
			System.out.println("Choose another place");
			 x=c.nextInt();
		}
		b[x]=false;
		a[x]=100;
		print(a);
		check(a,win);
		
		System.out.println("Choose a number: between 0 to 41; x=100, O=99");
		x=c.nextInt();
		while(b[x]==false) {
			System.out.println("Choose another place");
			 x=c.nextInt();
		}
		b[x]=false;
		a[x]=99;
		print(a);
		check(a,win);
		
		
		
		
	}

	
	
	
	
	
}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
