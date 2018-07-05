/*Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island. For example, the below matrix contains 5 islands

Input : mat[][] = {{1, 1, 0, 0, 0},
                   {0, 1, 0, 0, 1},
                   {1, 0, 0, 1, 1},
                   {0, 0, 0, 0, 0},
                   {1, 0, 1, 0, 1} 
Output : 5
 */

public class FindNumberOfIsland {

	
	public static boolean isSafe(int[][] input, int row, int col, boolean[][] visited)
	{
		return (row >= 0 && row < input.length && col >= 0 && col < input[0].length && input[row][col] == 1 && !visited[row][col]);  
	}
	
	public static void DFS(int[][] input, int row, int col, boolean[][] visited)
	{
		int[] visitRowOffset = {-1,-1,-1,0,0,1,1,1};
		int[] visitColOffset = {-1,0,1,-1,1,-1,0,1};
		visited[row][col] = true;
		
		for(int visitRowOffsetIndex = 0 ; visitRowOffsetIndex < visitRowOffset.length; visitRowOffsetIndex++)
		{
			for(int visitColOffsetIndex = 0 ; visitColOffsetIndex < visitColOffset.length; visitColOffsetIndex++)
			{
				if(isSafe(input, row + visitRowOffset[visitRowOffsetIndex], col + visitColOffset[visitColOffsetIndex], visited))
				{
					DFS(input, row + visitRowOffset[visitRowOffsetIndex], col + visitColOffset[visitColOffsetIndex], visited);
				}
			}
		}
		
	}
	
	public static int FindNumOfIsland(int[][] input,int row, int col)
	{
		int numberOfIsland=0;
		boolean[][] visited = new boolean[row][col];
		
		for(int rowIndex = 0; rowIndex < row; rowIndex++)
		{
			for(int colIndex = 0; colIndex< col; colIndex++)
			{
				if(input[rowIndex][colIndex] == 1 && !(visited[rowIndex][colIndex]))
				{
					DFS(input, rowIndex, colIndex, visited);
					numberOfIsland++;
				}
			}
		}
		
		return numberOfIsland;
	}
	
	public static void main(String[] args) {
		int input[][]=  new int[][] {{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
           };
           
        System.out.println(FindNumOfIsland(input, input.length, input[0].length));
	}

}
