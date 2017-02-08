
public class Search2Dmatrix2 {

	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
			return false;
		}
		int j= matrix[0].length-1;
		int i = 0;
		while(j >= 0 && i<= matrix.length-1) {
			if(target == matrix[i][j]) {
				return true;
			} else if(target < matrix[i][j]) {
				j--;
			} else if(target > matrix[i][j]) {
				i++;
			}
		}
		return false;
	}
}

