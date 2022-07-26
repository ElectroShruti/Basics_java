package basic_java;

public class Three_D_array {
	
	    public static void main(String[] args) {

	        int[][][] test = {       // create  3d array
	            {
	              {1, -2, 3}, 
	              {2, 3, 4}        //matrix
	            }, 
	            { 
	              {-4, -5, 6, 9}, 
	              {1}, 
	              {2, 3}
	            } 
	        };

	        // for..each loop to iterate through elements of 3d array
	        for (int[][] array2D: test) {
	            for (int[] array1D: array2D) {      //nested loop
	                for(int item: array1D) {
	                    System.out.println(item);
	                }
	            }
	        }
	    }

}
