package homeworkpart3;

public class duplicatevalue {

	public static void main(String[] args) {
		String[] my_array = {"bcd","abd","jude","bcd","oiu","gzw","oiu"};
		
		 for (int i = 0; i < my_array.length; i++) {
			 for(int j =0; i< my_array.length; i++) {
				 
				 if(my_array[i]==my_array[j]);
				 System.out.println(my_array[j]);
			 }
		 }

	}
	
}
