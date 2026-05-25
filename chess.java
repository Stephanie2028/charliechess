
import java.util.Scanner;

public class chess {
// account edge case
// finish main - wturn, bturn, update display 
// en passant + promoting pawn + castle 
    space[][] board = new space[8][8];
    private boolean whiteWin = false;
    private boolean blackWin = false;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        chess game = new chess();
        space[][] board = game.display(game.board);
        game.printBoard(board);
        
// if (piece instanceof pawn)
        while(!game.whiteWin && !game.blackWin) {
            System.out.println("WHITE TURN");
            System.out.println("piece to move:");
            String wMovingPiece = game.sc.nextLine();
            System.out.println("(letter(space)number) Space to move " + wMovingPiece + " to:");
            String wMovingSpot = game.sc.nextLine();
            if(pieceChose(wMovingPiece).canMove(translateX(wMovingSpot),translateY(wMovingSpot))){
                
                if(board[translateX(wMovingSpot)][translateY(wMovingSpot)].containsPiece()){
                    System.out.println(board[translateX(wMovingSpot)][translateY(wMovingSpot)] + "taken");
                }
                piece.updatePos();

            }
 
            

        }
    }

    public space[][] display(space[][] board) {

        String[] back = {"r", "n", "b", "q", "k", "b", "n", "r"};

        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                int squareColor = ((x + y) % 2 == 0) ? 0 : 1;
                board[y][x] = new space(x, y, squareColor, false);
            }
        }

        for (int x = 0; x < 8; x++) {
            int squareColor0 = ((x + 0) % 2 == 0) ? 0 : 1;
            int squareColor1 = ((x + 1) % 2 == 0) ? 0 : 1;
            int squareColor6 = ((x + 6) % 2 == 0) ? 0 : 1;
            int squareColor7 = ((x + 7) % 2 == 0) ? 0 : 1;

            board[0][x] = new space(x, 0, squareColor0, true, back[x], 1);
            board[1][x] = new space(x, 1, squareColor1, true, "p", 1);
            board[6][x] = new space(x, 6, squareColor6, true, "p", 0);
            board[7][x] = new space(x, 7, squareColor7, true, back[x], 0);
        }

        return board;
    }

    public void printBoard(space[][] board) {
        System.out.print("   ");
        for (char c = 'a'; c <= 'h'; c++) {
            System.out.print(c + "  ");
        }
        System.out.println();

        for (int y = 7; y >= 0; y--) {
            System.out.print((y + 1) + "  ");
            for (int x = 0; x < 8; x++) {
                System.out.print(board[y][x] + " ");
            }
                System.out.println();
                
        }
    }
// use char at -a -1 
    public static int translateX(String s){
        s = s.toLowerCase();
        return s.charAt(0) - 'a'; 

    }
    public static int translateY(String s){
        return s.charAt(2) - '1';
        
    }

    


    
}
