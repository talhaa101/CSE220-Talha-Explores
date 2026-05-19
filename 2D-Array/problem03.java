public class problem03 {

    // Function to rotate outer border anticlockwise
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        // Store top row temporarily
        int[] temp = new int[n];
        for (int j = 0; j < n; j++) {
            temp[j] = matrix[0][j];
        }
        // STEP 1:
        // Right column -> Top row
        for (int i = 0; i < n; i++) {
            matrix[0][i] = matrix[i][n - 1];
        }
        // STEP 2:
        // Bottom row -> Right column
        for (int i = 0; i < n; i++) {
            matrix[i][n - 1] = matrix[n - 1][n - 1 - i];
        }
        // STEP 3:
        // Left column -> Bottom row
        for (int i = 0; i < n; i++) {
            matrix[n - 1][i] = matrix[i][0];
        }
        // STEP 4:
        // Saved top row -> Left column
        for (int i = 0; i < n; i++) {
            matrix[n - 1 - i][0] = temp[i];
        }
        return matrix;
    }

    // Function to print matrix
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };

        System.out.println("Original Matrix:\n");

        printMatrix(matrix);

        rotate(matrix);

        System.out.println("\nRotated Matrix:\n");

        printMatrix(matrix);
    }
}