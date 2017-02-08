
public class search2Dmatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null||matrix.length==0||matrix[0].length==0)
			return false;

		int m=matrix.length;
		int n=matrix[0].length;

		int start=0;
		int end=m*n-1; //11

		while(start<=end){
			int mid=(start+end)/2;//5
			int x=mid/n; //1
			int y=mid%n;//1
			if(matrix[x][y]==target)
				return true;

			if(matrix[x][y]<target){
				start=mid+1;
			}    
			else {
				end=mid-1;
			}
		}
		return false;
	}
}

