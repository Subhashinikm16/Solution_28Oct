package zohotest;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class NumberofAragrammaticPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subString("abba");
    	Scanner ob=new Scanner(System.in);
    	int n=ob.nextInt();
    	String s[]=new String[n];
    	for(int i=0;i<n;i++) {
    		s[i]=ob.next();
    	}
      //  String s="abba";
 //       LinkedHashMap<String, Integer> map= new LinkedHashMap<>();
        for(int i = 0; i <n; i++){
	        LinkedHashMap<String, Integer> map= new LinkedHashMap<>();
            for(int j = i; j < n; j++){
            	String tempString= s[i].substring(i, j+1);
                char[] tempchar= tempString.toCharArray();
                Arrays.sort(tempchar);
                String val = new String(tempchar);
                if (map.containsKey(val))
                    map.put(val, map.get(val)+1);
                else
                    map.put(val, 1);
            }
            int count = 0;
            int count1=0;
			for(String key: map.keySet()){
	            int no= map.get(key);
	            count1=(n-1);
	            count +=( (n * (count1))/2)+1;
	        }
	        System.out.println(count);
        }
	}

}
