package _力扣;

/**
 * @Author:Tod
 * @Description: 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。
 * 它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、
 * 到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 * 返回车能够在一次移动中捕获到的卒的数量。
 * 输入：[
 * [".",".",".",".",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * [".",".",".","R",".",".",".","p"],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".",".",".",".",".","."]
 * ]
 * 输出：3
 * 解释：
 * 在本例中，车能够捕获所有的卒。
 * 输入：[
 * [".",".",".",".",".",".",".","."],
 * [".","p","p","p","p","p",".","."],
 * [".","p","p","B","p","p",".","."],
 * [".","p","B","R","B","p",".","."],
 * [".","p","p","B","p","p",".","."],
 * [".","p","p","p","p","p",".","."],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".",".",".",".",".","."]
 * ]
 * 输出：0
 * 解释：
 * 象阻止了车捕获任何卒。
 * <p>
 * 输入：[
 * [".",".",".",".",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * ["p","p",".","R",".","p","B","."],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".","B",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * [".",".",".",".",".",".",".","."]
 * ]
 * 输出：3
 * 解释：
 * 车可以捕获位置 b5，d6 和 f5 的卒。
 * <p>
 * 提示：
 * board.length == board[i].length == 8
 * board[i][j] 可以是 'R'，'.'，'B' 或 'p'
 * 只有一个格子上存在 board[i][j] == 'R'
 * @Date: Create in 16:31 2019/10/26
 * @ModifiedBy:
 */
public class _60车的可用捕获量 {
    public static void main(String[] args) {

    }

    public static int numRookCaptures(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'R') {
                    int row = i, col = j;
                    //  上   下   左   右
                    return capture(board, row, col, 0, -1) + capture(board, row, col, 0, 1) +
                            capture(board, row, col, -1, 0) + capture(board, row, col, 1, 0);
                }
            }
        }
        return 0;
    }

    private static int capture(char[][] board, int row, int col, int x, int y) {
        while (row <= 7 && row >= 0 && col <= 7 && col >= 0) {
            if (board[row][col] == 'B')
                return 0;
            if (board[row][col] == 'p') {
                return 1;
            }
            row += x;
            col += y;
        }
        return 0;
    }
}
