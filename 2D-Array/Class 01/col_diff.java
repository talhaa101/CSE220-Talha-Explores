public class col_diff {

    // Function to calculate sum differences
    public static int[] sum_diff(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // Store column sums
        int[] colSum = new int[col];
        // Calculate column-wise sums
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += matrix[i][j];
            }
            colSum[j] = sum;
        }
        // Difference array
        int[] diff = new int[col - 1];
        // Calculate differences
        for (int i = 0; i < col - 1; i++) {
            diff[i] = colSum[i + 1] - colSum[i];
        }
        return diff;
    }

    // Function to print 1D array
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 1},
                {6, 4, 2},
                {5, 1, 7},
                {9, 3, 3},
                {8, 5, 4}
        };

        System.out.println("Result Array:");

        int[] result = sum_diff(matrix);

        printArray(result);
    }
}