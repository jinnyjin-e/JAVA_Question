import java.util.Scanner;

class sil8{//
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int line;
		
		System.out.printf("¶óÀÎ ¼ö: ");
		line = ms.nextInt();
		
		for(int i=1;i<=line;i++){
			for(j=1;j<=i)
		}
		
		
		
		
		for(int i=line;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.printf("----------------\n");
		
		for(int i=1;i<=line;i++){
			for(int j=1;j<=(i-1);j++){
				System.out.printf(" ");
			}
			for(int k=line;k>=i;k--){
				System.out.printf("*");
			}
			System.out.printf("\n");
			
		}
		System.out.printf("----------------\n");
		
		for(int i=1;i<=line;i++){
			for(int j1=line;j1>=(i+1);j1--){
				System.out.printf(" ");
			}
			
			for(int k=1;k<=(2*i-1);k++){
				System.out.printf("*");
			}
			System.out.printf("\n");
			
		}
		
		
	}
}






