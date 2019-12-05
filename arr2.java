import java.util.*;

class arr2{
	public static void main(String [] args){
		int [][] arr = new int [3][2];
		Scanner ms = new Scanner(System.in);
		
		initArr(arr);
		System.out.printf("�迭 ����\n");
		printArr(arr);
		System.out.printf("\n");
		
		System.out.printf("��� ������ ��: %d",sumArr(arr));
		System.out.printf("\n�迭�� �� �� ��: %d  %d",colSumArr(arr)[0],colSumArr(arr)[1]);
		System.out.printf("\n�� �� ���� �ִ�: %d",rowSumMaxArr(arr));
		System.out.printf("\n�迭�� �ִ��� �ε���: (%d, %d)",indexMaxArr(arr)[0],indexMaxArr(arr)[1]);
		
		System.out.printf("\n\n");
		System.out.printf("���� �� �迭 ����: \n");
		shuffleArr(arr);
		printArr(arr);
		
	}
	
	static void initArr(int [][] arr){
		Scanner ms = new Scanner(System.in);
		for(int i=0 ;i<3;i++){
			for(int j =0; j<2;j++ ){
				System.out.printf("%d�� %d�� ����: ",i+1,j+1);
				arr[i][j] = ms.nextInt();
			}
		}
		System.out.printf("\n\n");
		return;
	}
	
	static void printArr(int [][] arr){
		for(int i=0 ;i<3;i++){
			for(int j =0; j<2;j++ ){
				System.out.printf("%d ",arr[i][j]);
				
			}
			System.out.println();
		}
		return;
	}
	
	static int sumArr(int [][] arr){
		int sum =0;
		for(int i=0 ;i<3;i++){
			for(int j =0; j<2;j++ ){
				sum += arr[i][j];
			}
		}
		return sum;
	}
	
	static int [] colSumArr(int [][] arr){
		int [] ar2 = new int [2];
		for(int j=0 ;j<2;j++){
			int sum = 0;
			for(int i =0; i<3;i++ ){
				sum += arr[i][j];
			}
			ar2[j]=sum;
		}
		return ar2;
	}
	
	static int rowSumMaxArr(int [][] arr){
		int [] ar2 = new int [3];
		for(int i=0 ;i<3;i++){
			int sum = 0;
			for(int j = 0; j<2;j++ ){
				sum += arr[i][j];
			}
			ar2[i]=sum;
		}
		int max = ar2[0];
		for(int i = 0; i<3; i++){
			if(max<ar2[i]){
				max = ar2[i];
			}
		}
		return max;
	}
	
	static int [] indexMaxArr(int [][] arr){
		int max=arr[0][0];
		int [] index = {1,1};
		
		for(int i=0 ;i<3;i++){
			for(int j =0; j<2;j++ ){
				if(max<arr[i][j]){
					max =arr[i][j];
					index[0] = i+1;
					index[1] = j+1;
				}
			}
		}
		return index;
	}
	static void shuffleArr(int [][] arr){
		int tmp;
		Random rd = new Random();
		for(int i=0 ;i<3;i++){
			for(int j =0; j<2;j++ ){
				int x = rd.nextInt(3);
				int y = rd.nextInt(2);
				tmp = arr[i][j];
				arr[i][j] = arr[x][y];
				arr[x][y] = tmp;
			}
		}
	}
}