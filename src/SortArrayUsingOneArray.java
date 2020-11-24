
public class SortArrayUsingOneArray {

		public static void main(String[] args) {

		int [] arr= {10,12,15,1,16,18,19,31,52,6};
							  				
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				arr[i+1] = arr[i] + arr[i+1];
				arr[i] = arr[i+1] - arr[i];
				arr[i+1] = arr[i+1] - arr[i];
				i=-1;
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		
		}
}
