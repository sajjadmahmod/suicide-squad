package homeworkpart3;

public class duplicatevalueinteger {

	public static void main(String[] args) {
		int[] my_array = new int[] {1,2,3,4,5,6,6,7,8};
		
		for(int i=0; i<my_array.length; i++) {
			for(int j=0; j<my_array.length; j++) {
			if(my_array[i] == my_array[j]);
			System.out.println(my_array[j]);
		}
		
	}


}
}