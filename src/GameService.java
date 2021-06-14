import java.util.Random;

public class GameService {





    public Player startGame(Game game){


        System.out.println("Start Game method");

        Player winner = null;

        while (!game.isCompleted()) {

            for(int i=0;i<game.getPlayerList().size();i++) {

                Player player = game.getPlayerList().get(i);
                int number =0;
                if(game.getDice().isAvailable()) {
                    game.getDice().setAvailable(false);
                    number = this.rollDice(game.getDice());
                }

                System.out.println(number);
                if(player.getPosition()+number >100){
                    continue;
                }
                player.setPosition(player.getPosition()+number);

                checkForLeaderOrSnake(game,player);

                game.getDice().setAvailable(true);
                if(player.getPosition() ==100){
                    game.setCompleted(true);
                    winner = player;
                }
            }


        }
        return  winner;
    }


    public int rollDice(Dice dice){

        Random rand = new Random(); //instance of random class
        int upperbound = 7;
        //generate random values from 0-7

        int int_random = rand.nextInt(upperbound);
        // making the even number in case of crooked dice
        if(int_random%2!=0 && dice.isCrooked()){

            int_random =int_random+1;
        }

        return int_random;

    }


    private void checkForLeaderOrSnake(Game game,Player player) {

        for(int i =-0; i <game.getBoard().getLeaderList().size();i++){

            if(game.getBoard().getLeaderList().get(i).start==player.position){
                player.setPosition(game.getBoard().getLeaderList().get(i).end);
            }
        }

        for(int i =-0; i <game.getBoard().getSnacksList().size();i++){

            if(game.getBoard().getSnacksList().get(i).start==player.position){
                player.setPosition(game.getBoard().getSnacksList().get(i).end);
            }
        }

    }


}
