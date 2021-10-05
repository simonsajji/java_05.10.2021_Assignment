package pak;

public class Repetitive_elements {
	
	// find two repetitive elements using XOR
	
	public static void main(String args[]) {
		
		int[] arr= {1,5,6,4,5,7,1,3};
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
			if(flag==1) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
