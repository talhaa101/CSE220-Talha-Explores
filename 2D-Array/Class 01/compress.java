public class compress {

    // Function to compress the matrix
    public static int[][] compress_matrix(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;

        // New compressed matrix
        int[][] ans = new int[row / 2][col / 2];

        // Traverse 2x2 blocks
        for (int i = 0; i < row; i += 2) {

            for (int j = 0; j < col; j += 2) {

                int sum =
                        mat[i][j]
                      + mat[i][j + 1]
                      + mat[i + 1][j]
                      + mat[i + 1][j + 1];

                ans[i / 2][j / 2] = sum;
            }
        }

        return ans;
    }

    // Function to print 2D array
    public static void printMatrix(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {

                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Sample input matrix
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 3, 5, 2},
                {-2, 0, 6, -3}
        };

        System.out.println("Original Matrix:");
        printMatrix(mat);

        // Compress matrix
        int[][] compressed = compress_matrix(mat);

        System.out.println("\nCompressed Matrix:");
        printMatrix(compressed);
    }
}