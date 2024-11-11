import org.example.Solution19;
import org.junit.Assert;
import org.junit.Test;

public class L2022211690_19_Test {
    public L2022211690_19_Test() {
    }

    @Test
    public void testAllDeadCells() {
        Solution19 solution = new Solution19();
        int[][] board = new int[][]{{0, 0}, {0, 0}};
        int[][] expected = new int[][]{{0, 0}, {0, 0}};
        solution.gameOfLife(board);
        Assert.assertArrayEquals(expected, board);
    }

    @Test
    public void testAllLiveCells() {
        Solution19 solution = new Solution19();
        int[][] board = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] expected = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        solution.gameOfLife(board);
        Assert.assertArrayEquals(expected, board);
    }

    @Test
    public void testComplexGrid() {
        Solution19 solution = new Solution19();
        int[][] board = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        solution.gameOfLife(board);
        Assert.assertArrayEquals(expected, board);
    }
}