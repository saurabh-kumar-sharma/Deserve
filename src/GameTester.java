import java.util.ArrayList;
import java.util.List;

public class GameTester {


    public static void main(String args[]){

        Leader leader = new Leader();
        leader.start = 10;
        leader.end = 15;

        List<Leader> leaderList = new ArrayList<>();
        leaderList.add(leader);

        Snacks snacks = new Snacks();
        snacks.start = 14;
        snacks.end = 7;

        List<Snacks> snacksList = new ArrayList<Snacks>();
        snacksList.add(snacks);

        Board board = new Board(100,snacksList,leaderList);

        //single player
        List<Player> playerList = new ArrayList<>();
        Player player = new Player(1,"firstPlayer",0);
        playerList.add(player);

//        Player player2 = new Player(1,"secondPlayer");
//        playerList.add(player2);

        Dice dice = new Dice(0,true,false);

        Game game = new Game(1,board,dice,playerList);

        GameService gameService = new GameService();

        Player winner = gameService.startGame(game);




        System.out.println("winner is: "+winner.getName());


    }
}
