import java.util.Arrays;

public class Main {

    public static void main(String[] args){
            Game game = new Game();
            Board board = game.getBoard();
            System.out.println(board.toString());
            board.updateSquare(2);

    }
}
