package zohotest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuresKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N");
        int n=scanner.nextInt();
        int array[]=new int[n];
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++) {
        	array[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++) {
        	if(map.containsKey(array[i])) {
        		map.put(array[i], 2);
        	}
        	else {
        		map.put(array[i], 1);
        	}
        	for(Map.Entry<Integer,Integer> m:map.entrySet()) {
        		if(m.getValue()==2) {
        			System.out.println(m.getKey());
        			System.exit(0);
        		}
        	}
        }
        System.out.println("Non of these are repeated");
	}

}
