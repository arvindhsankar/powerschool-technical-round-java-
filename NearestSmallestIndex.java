package powerschooltech;

import java.util.*;

public class NearestSmallestIndex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int [] inputarray= {4,5,12,78,53,10};
		int numberToSearch=s.nextInt();
		int min=Integer.MIN_VALUE;
		int length=inputarray.length;
		int searchindex=0;
		for(int i=0;i<length;i++) {
			if(numberToSearch==inputarray[i]) {
				searchindex=i;
			}
		}
		int minimum=0;
		if(searchindex!=length-1) {
			minimum=Math.min(inputarray[searchindex-1],inputarray[searchindex+1]);

		}else {
			minimum=inputarray[searchindex-1];
		}
		
		int minimumindex=0;
		for(int i=0;i<length;i++) {
			if(minimum==inputarray[i]) {
				minimumindex=i;
			}
		}
		System.out.println(minimumindex);


	}

}
