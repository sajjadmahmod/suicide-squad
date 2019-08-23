package homeworkpart3;

import java.util.Arrays;

public class maximumandminimum {

	public static void main(String[] args) {
		int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
		           1458, 2458, 1254, 1472, 2365,
		           1456, 2265, 1457, 2456};
		
		Arrays.sort(my_array1);
		
		System.out.println("minimum = " + my_array1[0]);
		System.out.println("maximun = " + my_array1[my_array1.length-1]);
		
	}

}
