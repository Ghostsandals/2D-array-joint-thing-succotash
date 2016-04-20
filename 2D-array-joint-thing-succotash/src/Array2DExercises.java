
public class Array2DExercises {



	// return the total of all the values in the array.
	public static int getTotal(int[][] a) {
		return -1;
	}
	
	// return the average of all the values in the array.
	public static double getAverage(int[][] a) {
		return -1;
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
		int n = 1000;
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
		return -1;
	}
	
	// return the highest value in the specified column of the array
	public static int getLowestInColumn(int[][] a, int column) {
		return -1;
	}
	
	// return the diagonal sum, bottom left to top right
	public static int getBottomLeftToTopRightDiagonalSum(int[][] a) {
		return -1;
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
		return false;
	}
	
	// return true if array is sorted high to low
	public static boolean isArrayReversed(int[][] a) {
		return false;
	}
	
	// return true if array is jagged
	public static boolean isJaggedArray(int[][] a) {
		return false;
	}
	
	// return true if array is square (n x n)
	public static boolean isSquareArray(int[][] a) {
		return false;
	}
	
	// return true if array is rectangular (n x m)
	public static boolean isRectangularArray(int[][] a) {
		return false;
	}
}

