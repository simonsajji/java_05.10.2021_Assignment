package pak;

public class Remove_element {
	
	public static void main(String args[]) {
		
		int[] arr= {1,2,3,4,5,7};
		int k=2;
		remove_e(k,arr);
	}
	
	static void remove_e(int k,int[] arr) {
		int[] arr_new=new int[arr.length-1];
		int j=0;int i=0;
		while(i<arr.length && j<arr_new.length) {
			if(arr[i]==k) {
				i++;
			}
			else {
				arr_new[j]=arr[i];
				i++;
				j++;
			}
			
		}
		
		for(i=0;i<arr_new.length;i++) {
			System.out.println(arr_new[i]);
		}
		
	}

}
