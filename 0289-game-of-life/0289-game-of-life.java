
class Solution {
    public void gameOfLife(int[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        // Step 1: Check every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int live = 0;

                // Check all 8 neighbors
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {

                        // Check matrix boundaries
                        if (x >= 0 && x < rows &&
                            y >= 0 && y < cols) {

                            // Do not count the cell itself
                            if (x == i && y == j) {
                                continue;
                            }

                            // Count originally live cells
                            if (board[x][y] > 0) {
                                live++;
                            }
                        }
                    }
                }

                // Live cell becomes dead
                if (board[i][j] == 1 &&
                    (live < 2 || live > 3)) {
                    board[i][j] = 2;
                }

                // Dead cell becomes live
                if (board[i][j] == 0 && live == 3) {
                    board[i][j] = -1;
                }
            }
        }

        // Step 2: Convert temporary values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (board[i][j] == 2) {
                    board[i][j] = 0;
                } else if (board[i][j] == -1) {
                    board[i][j] = 1;
                }
            }
        }
    }
}
