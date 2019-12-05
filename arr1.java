import java.util.*;

class arr1{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int len;
		double [] arr; 
		
		System.out.printf("�迭�� ���� ����: ");
		len = ms.nextInt();
		arr = new double [len];
		System.out.printf("\n");
		
		System.out.printf("�迭 ����\n");
		initArr(arr);
		printArr(arr);
		
		System.out.printf("��: %.2f",sumArr(arr));
		System.out.printf("\n");
		System.out.printf("�迭�� �ִ�: %.2f",maxArr(arr));
		System.out.printf("\n");
		System.out.printf("�迭�� �ִ� �ε���: %d",indexMaxArr(arr));
		System.out.printf("\n\n");
		
		
		shuffleArr(arr);
		System.out.printf("���� �� ����: \n");
		printArr(arr);
		
		rotateR1Arr(arr);
		System.out.printf("�� 1ĭ\n");
		printArr(arr);
		rotateL1Arr(arr);
		System.out.printf("�� 1ĭ\n");
		printArr(arr);
		System.out.printf("\n");
		
		int rNum;
		System.out.printf("�� ����Ʈ Ƚ��: ");
		rNum = ms.nextInt();
		rotateRArr(arr,rNum);
		System.out.printf("�� ����Ʈ\n");
		printArr(arr);
		System.out.printf("\n");
		
		System.out.printf("�� ����Ʈ Ƚ��: ");
		rNum = ms.nextInt();
		rotateLArr(arr,rNum);
		System.out.printf("�� ����Ʈ\n");
		printArr(arr);
		System.out.printf("\n");
		
		
	}
	
	static void initArr(double [] arr){
		Random ran = new Random();
		
		for(int i = 0; i<arr.length;i++){
			arr[i] = ran.nextDouble()*10;
		}
		return;
	}
	
	static void printArr(double [] arr){
		for(double x:arr) {
			System.out.printf("%.1f   ",x);
		}
		System.out.printf("\n");
	}
	
	static double sumArr(double [] arr){
		double sum=0;
		for(double x:arr){
			sum += x;
		}
		return sum;
	}
	
	static double maxArr(double [] arr){
		double max = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(max<arr[i]) max=arr[i];
		}
		return max;
	}
	
	static int indexMaxArr(double [] arr){
		double max = arr[0];
		int indx=1;
		for(int i = 1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				indx = i+1;
				}
		}
		return indx;
	}
	
	static void shuffleArr(double [] arr){
		Random ran = new Random();
		double tmp;
		int rn;
		
		for(int i =0;i<arr.length;i++){
			rn = ran.nextInt(arr.length);
			tmp = arr[i];
			arr[i] = arr[rn];
			arr[rn] = tmp;
			}
		return;
	}
	static void rotateR1Arr(double [] arr){
		double tmp=arr[arr.length-1];
		for(int i = arr.length-1; i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = tmp;
		return;
	}
	
	static void rotateL1Arr(double [] arr){
		double tmp = arr[0];
		for(int i = 0; i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = tmp;
		return;
	}
	
	static void rotateRArr(double [] arr, int k){
		for(int i = 1;i<=k;i++){
			rotateR1Arr(arr);
		}
		return;
	}
	static void rotateLArr(double [] arr, int k){
		for(int i = 1;i<=k;i++){
			rotateL1Arr(arr);
		}
		return;
	}
}



