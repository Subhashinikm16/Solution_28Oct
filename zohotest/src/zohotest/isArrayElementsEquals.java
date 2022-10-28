package zohotest;

import java.util.Arrays;
import java.util.Scanner;

public class isArrayElementsEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
        int n=scanner.nextInt();
        int array1[]=new int[n];
        int array2[]=new int[n];
        for(int i=0;i<n;i++) {
        	array1[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++) {
         	array2[i]=scanner.nextInt();
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i=0;i<n;i++) {
        	for(int j=i;j<=i;j++) {
        		if(array1[i]!=array2[j]) {
        			System.out.println("Not Equals");
        			System.exit(0);
        		}
        	}
        }
        System.out.println("Equals");
	}

}
