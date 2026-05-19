// public int[][] compress_matrix(int[][] mat) {

//     int row = mat.length;
//     int col = mat[0].length;

//     int[][] ans = new int[row/2][col/2];

//     for(int i = 0; i < row; i += 2) {

//         for(int j = 0; j < col; j += 2) {

//             int sum =
//                     mat[i][j]
//                   + mat[i][j+1]
//                   + mat[i+1][j]
//                   + mat[i+1][j+1];

//             ans[i/2][j/2] = sum;
//         }
//     }

//     return ans;
// }