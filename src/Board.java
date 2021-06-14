import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Board {

    int size;
    List<Snacks> snacksList = new ArrayList<>();
    List<Leader> leaderList = new ArrayList<>();

    public Board(int size, List<Snacks> snacksList, List<Leader> leaderList) {
        this.size = size;
        this.snacksList = snacksList;
        this.leaderList = leaderList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Snacks> getSnacksList() {
        return snacksList;
    }

    public void setSnacksList(List<Snacks> snacksList) {
        this.snacksList = snacksList;
    }

    public List<Leader> getLeaderList() {
        return leaderList;
    }

    public void setLeaderList(List<Leader> leaderList) {
        this.leaderList = leaderList;
    }
}

class Snacks{
    int start;
    int end;
}

class Leader{
    int start;
    int end;
}