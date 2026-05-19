public class Main {

    // Zigzag traversal function
    public static void zig_zag(char[][] arr) {

        int n = arr.length;

        // PART 1: Upper triangle
        for (int k = 0; k < n; k++) {

            int row = k;
            int col = 0;

            while (row >= 0 && col < n) {

                System.out.print(arr[row][col] + " ");

                row--;
                col++;
            }
        }

        // PART 2: Lower triangle
        for (int k = 1; k < n; k++) {

            int row = n - 1;
            int col = k;

            while (row >= 0 && col < n) {

                System.out.print(arr[row][col] + " ");

                row--;
                col++;
            }
        }
    }

    public static void main(String[] args) {

        char[][] arr = {
                {'D', 'B', 'G', 'S'},
                {'A', 'G', 'T', 'S'},
                {'W', 'U', 'R', 'N'},
                {'O', 'H', 'R', 'O'}
        };

        System.out.println("Zigzag Traversal:\n");

        zig_zag(arr);
    }
}