package xyz;

public class two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	public class Ques2 {
	//		public static void main(String[] args) {
				//Instantiation 2-Dimensional char array of 8 * 8 using data.
//				char [][] board = {
//						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
//						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
//						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
//						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
//						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
//						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
//						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
//						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
//				};
//				System.out.println("Printing of 2x2 array :");
//				for(int i=0;i<board.length;i++){
//					for(int j=0;j<board[i].length;j++){	
//						System.out.print(board[i][j]+" ");
//					}
//					System.out.println("");
//				}
		int [][] numbers = {
				{90, 10, 231},
				{-20, 80, 100, 23, 54},
				{45, 22},
				{87, 98, -100, 49, 73, 35, 19}
		};
		int min=numbers[0][0];
		for(int row=0;row<numbers.length;row++){
			for(int col=0;col<numbers[row].length;col++){
				if (min>numbers[row][col]){
				min=numbers[row][col];	
				}
			}
		}System.out.println("Maximum number is:"+min);
			
				}
}
