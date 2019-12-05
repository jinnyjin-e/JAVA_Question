import java.util.Scanner;

class sil2{//99´Ü
	public static void main(String [] args){
		int a;
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("¸î ´Ü: ");
		a = ms.nextInt();
		
		for(int i=1;i<10;i++){
			System.out.printf("%d X %d = %d \n",a,i,a*i);
		}
		
	}
}