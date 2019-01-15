package pl.sdacademy.chessboard.classes;

public class Chessboard {

    private String[][] board;


    private Chessboard(String[][] board) {
        this.board = board;
    }

    static Chessboard build(int rows, int columns) {

        String[][] board = new String[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (((i + j) % 2) == 0) {

                    board[i][j] = " X ";

                } else {

                    board[i][j] = "   ";

                }

            }

        }

        return new Chessboard(board);

    }


    @Override

    public String toString() {

        int row = board.length;

        int col = board[0].length;


        String ChessboardPrint = "";

        for (int j = 0; j < col; j++) {

            ChessboardPrint += "----";

        }

        ChessboardPrint += "\n";


        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                String s = board[i][j];

                ChessboardPrint += ("|" + s);

            }

            ChessboardPrint += "|\n";

            for (int j = 0; j < col; j++) {

                ChessboardPrint += "----";

            }

            ChessboardPrint += " \n";

        }

        return ChessboardPrint;

    }
}
