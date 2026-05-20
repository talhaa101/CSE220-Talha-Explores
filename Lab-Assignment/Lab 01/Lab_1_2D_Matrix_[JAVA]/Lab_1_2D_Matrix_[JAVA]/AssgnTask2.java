//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        //For this task you'll need to create new 2D array
        
        //TO DO

        
        int row = matrix.length;
        int col = matrix[0].length;

        // New compressed matrix
        Integer[][] ans = new Integer[row / 2][col / 2];

        // Traverse 2x2 blocks
        for (int i = 0; i < row; i += 2) {

            for (int j = 0; j < col; j += 2) {

                int sum =
                        matrix[i][j]
                      + matrix[i][j + 1]
                      + matrix[i + 1][j]
                      + matrix[i + 1][j + 1];

                ans[i / 2][j / 2] = sum;
            }
        }

        return ans;

        //remove the line below and return the newly created Compressed 2D matrix
        //return null;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
