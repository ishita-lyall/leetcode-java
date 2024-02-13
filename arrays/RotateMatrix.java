class RotateMatrix {
    public void rotate(int[][] matrix) {
        // List<List<Integer>> matrix = new ArrayList<>();
        int n = matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                //swap(matrix, matrix[i][j], matrix[j][i])
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    for (int i = 0; i < n; i++) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            //reverse column-wise
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
            start++;
            end--;
        }
    }
    }
}

// class Solution {
//     public int[][] rotate(int[][] matrix) {
        // int n = matrix.length;
        // int[][] temp = new int[n][n];
        // for(int i=0;i<n-1;i++){
        //     for(int j = i+1;j<n-1;j++){
        //         temp[j][n-i-1] = matrix[i][j];
        //     }
        // }
//         return temp;
//     }
// }
