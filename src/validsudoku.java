import java.util.HashSet;
import java.util.Set;

public class validsudoku {
	 public boolean isValidSudoku(char[][] board) {
		Set Seen=new HashSet();
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				char number=board[i][j];
				if(number!='.'){
					if(!Seen.add(number+"in row"+i)||!Seen.add(number+"in column"+j)||
							!Seen.add(number + " in block " + i/3 + "-" + j/3))
						return false;
				}
			}
		}
		
		 return true;
		 
	 }		 
}
