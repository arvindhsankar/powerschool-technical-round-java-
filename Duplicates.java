package powerschooltech;

public class Duplicates {

	public static void main(String[] args) {
		int inputarray[]= {1, 2, 3, 4, 4, 4, 7, 9, 9};
		int n=inputarray.length;
		int j=0;
		int currentarray[]=new int[n];
		
		for(int i=0;i<n-1;i++) {
			if(inputarray[i]!=inputarray[i+1]) {
				currentarray[j]=inputarray[i];
				j++;
				
			}
			
		}
		currentarray[j++]=inputarray[n-1];
		for(int i=0;i<j;i++) {
			inputarray[i]=currentarray[i];
		}
		
		n=j;
		
		for(int i=0;i<n;i++) {
			System.out.print(inputarray[i]+" ");
		}
		
	}

}
