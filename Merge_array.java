package pak;

public class Merge_array {
	
//	1.     Merge two sorted arrays
//    array1 - 4,5,6,7,8
//    array2 - 1,2,3,4
//    o/p- 1,2,3,4,4,5,6,7,8
	
	public static void main(String args[]) {
		int[] arr1= {4,5,6,7,8};
		int[] arr2= {1,2,3,4};
		int h=arr1.length-1;
		int g=-1;
		int[] arr=new int[9];
		
		for(int i=0;i<arr1.length;i++) {
			g++;
			arr[g]=arr1[i];
		}
		
		for(int j=0;j<arr2.length;j++) {
			h++;
			arr[h]=arr2[j];
			
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.format(arr[k]+" ");
		}
	}

}
