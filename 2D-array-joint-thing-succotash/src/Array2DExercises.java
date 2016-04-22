
public class Array2DExercises {



	// return the total of all the values in the array.
	public static int getTotal(int[][] a) {

		int sum =0;
		for (int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		return sum;

	}
	
	// return the average of all the values in the array.
	public static double getAverage(int[][] a) {
		int t = 0;
		int b = 0;
		int counter_c = 0;
		int counter_r = 0;
		do{
			for(counter_c = 0;counter_c < a[counter_r].length;counter_c++){
				t += a[counter_r][counter_c];
				b++;
			}
			
			counter_r++;
		}while(counter_r < a.length);
		double x = (double)t/(double)b;
		return x;
	}
	
	// return the total of the values in the specified row.
	public static int getRowTotal(int[][] a, int row) {
		int n = 0;
		for (int i = 0; i < a.length; i++){
			n = n + a[row][i];
		}
		return n;
	}
	
	// return the total of the values in the specified column.
	public static int getColumnTotal(int[][] a, int column) {
		int n = 0;
		for (int i = 0; i < a.length; i++){
			n = n + a[i][column];
		}
		return n;
	}
	
	// return the highest value in the specified row of the array.
	public static int getHighestInRow(int[][] a, int row) {
		int n = 0;
		int i = 0;
		do{
			if (a[row][i] > n){
				n = a[row][i];
			}
			else{
				n=n;
			}
			i++;
		}while( i < a[row].length);
		return n;
	}
	
	// return the lowest value in the specified row of the array.
	public static int getLowestInRow(int[][] a, int row) {
		int n = (int) (Math.pow(2, 32) - 1);
		int i = 0;
		do{
			if (a[row][i] < n){
				n = a[row][i];
			}
			else{
				n=n;
			}
			i++;
		}while( i < a[row].length);
		return n;
	}
	
	// return the lowest value in the specified column of the array
	public static int getHighestInColumn(int[][] a, int column) {
		int n = 0;
		int i = 0;
		do{
			if (a[i][column] > n){
				n = a[i][column];
			}
			else{
				n = n;
			}
			
			i ++;
		}while( i < a.length);
		
		return n;
	}
	
	// return the highest value in the specified column of the array
	public static int getLowestInColumn(int[][] a, int column) {
		int n = (int) (Math.pow(2, 32) - 1);
		int i = 0;
		do{
			if (a[i][column] < n){
				n = a[i][column];
			}
			else{
				n = n;
			}
			
			i ++;
		}while( i < a.length);

		return n;
	}
	
	// return the diagonal sum, bottom left to top right
	public static int getBottomLeftToTopRightDiagonalSum(int[][] a) {
		int r = a.length - 1;
		int c = 0;
		int s = 0;
		do{
			s += a[r][c]; 
			r--;
			c++;
		}while(r >= 0 && c < a[0].length);
		
		
		return s;
	}
	
	// return the diagonal sum, top left to bottom right
	public static int getTopLeftToBottomRightDiagonalSum(int[][] a) {
		int r = 0;
		int c = 0;
		int s = 0;
		do{
			s += a[r][c]; 
			r++;
			c++;
		}while(r < a.length && c < a[0].length);
		
		
		return s;
	}
	
	// return true if the array is sorted low to high
	public static boolean isArraySorted(int[][] a) {
		int comp = a[0][0];
		boolean answer = true;
		int r = 0;
		int c = 1;
		while(answer && r < a.length){
			for(c=1;c < a[r].length - 1;c++){
				if (a[r][c] > comp){
					answer = true;
					comp = a[r][c];
				}
				else{
					answer = false;
				}
			}
			r++;
		}

		return answer;
	}
	
	// return true if array is sorted high to low
	public static boolean isArrayReversed(int[][] a) {
		int comp = a[0][0];
		boolean answer = true;
		int r = 0;
		int c = 1;
		while(answer && r < a.length - 1){
			for(c=1;c < a[r].length - 1;c++){
				if (a[r][c] < comp){
					answer = true;
				}
				else{
					answer = false;
				}
			}
			r++;
		}

		return answer;
				
	}
	
	
	// return true if array is jagged
	public static boolean isJaggedArray(int[][] a) {
		int rlength = a[0].length;
		boolean answer = false;
		for (int i = 1;i < a.length;i++){
			if(a[i].length == rlength){
				answer = false;
			}
		else{
			answer = true;
		}
		}
		
		
		return answer;
		
	}
	
	
	// return true if array is square (n x n)
	public static boolean isSquareArray(int[][] a) {
		if(a.length == a[0].length){
			return true;
		}

	else{
		return false;
	}
	}
	
	// return true if array is rectangular (n x m)
	public static boolean isRectangularArray(int[][] a) {
		int rlength = a[0].length;
		boolean answer = false;
		for (int i = 1;i < a.length;i++){
			if(a[i].length == rlength){
				answer = true;
			}
		else{
			answer = false;
		}
		}
		
		
		return answer;
		
	}
}

