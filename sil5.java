import java.util.Scanner;

class sil5{//약수
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int a,b,tmp;
		
		System.out.printf("a: ");
		a=ms.nextInt();
		System.out.printf("b: ");
		b=ms.nextInt();
		
		if(a>b){
			tmp=a;
			a=b;
			b=tmp;
		}
		
		for(int i=a;i<=b;i++){
			System.out.printf("%d의 약수: 1",i);
			for(int j=2;j<=i;j++){
				if(i%j==0) System.out.printf(", %d",j);
			}
			System.out.printf("\n");
		}
		
	}
}