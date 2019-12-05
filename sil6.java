import java.util.Scanner;

class sil6{//문자열 검색
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int a,c=0;
		String gle, one;
		char o,ch;
		
		System.out.printf("문자열: ");
		gle = ms.nextLine();
		System.out.printf("문자: ");
		one = ms.next();
		
		o = one.charAt(0);
		a = gle.length();
		
		for(int i=1;i<=a;i++){
			ch = gle.charAt(i-1);
			if(ch==o){
				System.out.printf("%d 번째 ",i);
				c+=1;
			}
			
			
		}
		if(c==0){
			System.out.printf("일치하는 문자가 없습니다.");
			return;
		}
		System.out.printf("\n문자열 \"%s\"에서 문자'%c'는 %d번",gle,o,c);
		
		
	}
}
