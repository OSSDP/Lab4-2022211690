package org.example;

public class Solution19 {
    public Solution19() {
    }

    public void gameOfLife(int[][] board) {
        int[] neighbors = new int[]{0, 1, -1};
        int rows = board.length;
        int cols = board[0].length;
        int[][] copyBoard = new int[rows][cols];

        int row;
        int col;
        for(row = 0; row < rows; ++row) {
            for(col = 0; col < cols; ++col) {
                copyBoard[row][col] = board[row][col];
            }
        }

        for(row = 0; row < rows; ++row) {
            for(col = 0; col < cols; ++col) {
                int liveNeighbors = 0;

                for(int i = 0; i < 3; ++i) {
                    for(int j = 0; j < 3; ++j) {
                        if (neighbors[i] != 0 || neighbors[j] != 0) {
                            int r = row + neighbors[i];
                            int c = col + neighbors[j];
                            if (r < rows && r >= 0 && c < cols && c >= 0 && copyBoard[r][c] == 1) {
                                ++liveNeighbors;
                            }
                        }
                    }
                }

                if (copyBoard[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = 0;
                }

                if (copyBoard[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 1;
                }
            }
        }

    }
}
