import java.util.Scanner;

class sil4{//1-10��
	public static void main(String [] args){
		int n,a,p=1;
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("n: ");
		n = ms.nextInt();
		
		for(int i=1;i<=n;i++){
			a=p;
			p=p*i;
			if((p/i)!=a){
				System.out.printf("%d!���Ұ�",n);
				System.out.printf("\n%d!�� ����ϴ� ��������overflow �߻�",i);
				return;
			}
			
		}
		System.out.printf("%d! = %d",n,p);
	}
}