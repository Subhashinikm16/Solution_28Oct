package zohotest;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=scanner.nextInt();
		}
		//int nums[]= {-3,-4,1,3,-1,4};
		int l=0;
        int r=nums.length-1;
        while(l<=r) {
        	for(int in=r;in>=l;in--) {
            	int sum=0;
            	int[] arraytemp=new int[nums.length];
            	ArrayList<Integer> list=new ArrayList<>();
            	int count=0;
        	    for(int index=l;index<=in;index++) {
        		  sum+=nums[index];
        		  arraytemp[count++]=nums[index];
        		  list.add(nums[index]);
        	    }
        	    if(sum==0) {
        	    	System.out.println(list);
        	    	System.out.println("ArraySize is "+list.size());
        		    System.out.println("sum 0");
        		    System.exit(0);
        		}
        	}
        	l++;
        	}
	}

}
