import java.util.Scanner;

class sil7{//�ִ�����
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int x,y,r,tmp;
		
		System.out.printf("�� 1: ");
		x = ms.nextInt();
		System.out.printf("�� 2: ");
		y = ms.nextInt();
		
		if(x>y){
			tmp=x;
			x=y;
			y=tmp;
		}
		
		System.out.printf("%d�� %d�� �ִ������� ",x,y);
		while(y>0){
		r=x%y;
		x=y;
		y=r;
		}
		System.out.printf("%d�̴�.",x);
		
	}
}