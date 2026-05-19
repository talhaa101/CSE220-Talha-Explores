//Assignment Task 04: Rotate Secret
class AssgnTask4{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    //If needed you can create extra helper static methods
    //if extra helper methods are used then you must submit those as well
    public static void rotateSecret( Character[][] board ){

        //Print the message inside of this method
        //TO DO
        int n = board.length;

        // number of layers
        int layers = n / 2;

        // rotate each layer the required number of times
        for(int l = layers - 1; l >= 0; l--){
            int rotations = layers - l;
            for(int r = 0; r < rotations; r++){
                rotateLayerOnce(board, l);
            }
        }
    }

    // rotate single layer one step clockwise
    private static void rotateLayerOnce(Character[][] board, int layer){
        int n = board.length;
        int top = layer;
        int bottom = n - 1 - layer;
        int left = layer;
        int right = n - 1 - layer;

        // Save top-left
        Character temp = board[top][left];

        // LEFT COLUMN UP
        for(int i = top; i < bottom; i++){
            board[i][left] = board[i + 1][left];
        }

        // BOTTOM ROW LEFT
        for(int j = left; j < right; j++){
            board[bottom][j] = board[bottom][j + 1];
        }

        // RIGHT COLUMN DOWN
        for(int i = bottom; i > top; i--){
            board[i][right] = board[i - 1][right];
        }

        // TOP ROW RIGHT
        for(int j = right; j > left + 1; j--){
            board[top][j] = board[top][j - 1];
        }

        // Put temp
        board[top][left + 1] = temp;
    }

    public static void rotateLayer( Character[][] board, int layer ){

        int n = board.length;

        int layers = n / 2;

        // Rotate each layer
        for(int l = layers - 1; l >= 0; l--){

            int rotations = layers - l;

            for(int r = 0; r < rotations; r++){

                rotateSecret(board);
            }
        }

        // Print recovered message
        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                System.out.print(board[i][j]);
            }
        }

        System.out.println();
    }


    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
          {'T','A','U','S'},
          {'A','R','I','.'},
          {'D','T','T','N'},
          {'S','C','F','U'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
            {'D','A','T','A'},
            {'S','T','R','U'},
            {'C','T','I','S'},
            {'F','U','N','.'}
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 1 Success");
        else System.out.println("Test 1 FAILED");
        
        System.out.print("\n===========Test#2===========\n");

        board = new Character[][]{
          {'O','R','I','R','N','P'},
          {'G','S','A','A','L','R'},
          {'L','M','N','O','N','Y'},
          {'A','H','U','O','O','P'},
          {'T','F','C','T','H','S'},
          {'E','D','Y','O','C','K'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][]{
            {'A','L','G','O','R','I'},
            {'T','H','M','S','A','R'},
            {'E','F','U','N','A','N'},
            {'D','C','O','O','L','P'},
            {'Y','T','H','O','N','R'},
            {'O','C','K','S','P','Y'}
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 2 Success");
        else System.out.println("Test 2 FAILED");
    }
}
