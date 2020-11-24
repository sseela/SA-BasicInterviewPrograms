
public class BubbleSort {

	static int[] arr= {36, 19, 29, 12, 5};
	static int temp;
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			int flag=0;
			for(int j=0; j<5-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=1;
				}
			}
			if(flag ==0) {
				break;
			}
		}
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
}
