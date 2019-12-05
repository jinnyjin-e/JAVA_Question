import java.util.Scanner;

class sil7{//최대공약수
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int x,y,r,tmp;
		
		System.out.printf("수 1: ");
		x = ms.nextInt();
		System.out.printf("수 2: ");
		y = ms.nextInt();
		
		if(x>y){
			tmp=x;
			x=y;
			y=tmp;
		}
		
		System.out.printf("%d와 %d의 최대공약수는 ",x,y);
		while(y>0){
		r=x%y;
		x=y;
		y=r;
		}
		System.out.printf("%d이다.",x);
		
	}
}