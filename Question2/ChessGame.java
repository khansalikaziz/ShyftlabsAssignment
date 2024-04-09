// Enum representing the colors of the chess pieces
enum Color {
    WHITE, BLACK
}

// Enum representing the types of chess pieces
enum PieceType {
    KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN
}

// Class representing a chess piece
class Piece {
    private Color color;
    private PieceType type;

    public Piece(Color color, PieceType type) {
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return type;
    }
}

// Class representing a chess board
class Board {
    private Piece[][] squares;

    public Board() {
        squares = new Piece[8][8];
    }

    public void placePiece(int row, int col, Piece piece) {
        squares[row][col] = piece;
    }

    public Piece getPiece(int row, int col) {
        return squares[row][col];
    }

    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (squares[i][j] != null) {
                    Color color = squares[i][j].getColor();
                    PieceType type = squares[i][j].getType();
                    String pieceSymbol = type.toString().substring(0, 1);
                    String colorSymbol = (color == Color.WHITE) ? "w" : "b";
                    System.out.print(colorSymbol + pieceSymbol + " ");
                } else {
                    System.out.print("-- ");
                }
            }
            System.out.println();
        }
    }
}

public class ChessGame {
    public static void main(String[] args) {
        // Create a new chess board
        Board board = new Board();

        // Place some pieces on the board
        board.placePiece(0, 0, new Piece(Color.WHITE, PieceType.ROOK));
        board.placePiece(0, 1, new Piece(Color.WHITE, PieceType.KNIGHT));
        board.placePiece(7, 7, new Piece(Color.BLACK, PieceType.ROOK));

        // Display the board
        board.displayBoard();
    }
}
