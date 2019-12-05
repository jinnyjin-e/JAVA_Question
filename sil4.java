import java.util.Scanner;

class sil4{//1-10합
	public static void main(String [] args){
		int n,a,p=1;
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("n: ");
		n = ms.nextInt();
		
		for(int i=1;i<=n;i++){
			a=p;
			p=p*i;
			if((p/i)!=a){
				System.out.printf("%d!계산불가",n);
				System.out.printf("\n%d!을 계산하는 과정에서overflow 발생",i);
				return;
			}
			
		}
		System.out.printf("%d! = %d",n,p);
	}
}