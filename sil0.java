import java.util.Scanner;
class sil0{

	public static void main(String [] args){
		int li;
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("¶óÀÎ ¼ö: ");
		li = ms.nextInt();
		
		for(int i =1;i<(li+1);i++){
			for(int k=5;k>i;k--){
				System.out.printf(" ");
			}
			for(int j=0;j<i;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");

		}
			
	}
}