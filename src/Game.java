import java.util.ArrayList;
import java.util.List;

public class Game {


    private  int gameId;
    private Board board;
    private  Dice dice;
    private  List<Player> playerList = new ArrayList<>();
    private boolean isCompleted;

    public Game(int gameId, Board board, Dice dice, List<Player> playerList) {
        this.gameId = gameId;
        this.board = board;
        this.dice = dice;
        this.playerList = playerList;
        this.isCompleted = false;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
