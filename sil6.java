import java.util.Scanner;

class sil6{//���ڿ� �˻�
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int a,c=0;
		String gle, one;
		char o,ch;
		
		System.out.printf("���ڿ�: ");
		gle = ms.nextLine();
		System.out.printf("����: ");
		one = ms.next();
		
		o = one.charAt(0);
		a = gle.length();
		
		for(int i=1;i<=a;i++){
			ch = gle.charAt(i-1);
			if(ch==o){
				System.out.printf("%d ��° ",i);
				c+=1;
			}
			
			
		}
		if(c==0){
			System.out.printf("��ġ�ϴ� ���ڰ� �����ϴ�.");
			return;
		}
		System.out.printf("\n���ڿ� \"%s\"���� ����'%c'�� %d��",gle,o,c);
		
		
	}
}
