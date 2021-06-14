public class Dice {


    private int number;
    private  boolean isCrooked;
    private  boolean isAvailable;

    public Dice(int number, boolean isAvailable,boolean isCrooked) {
        this.number = number;
        this.isAvailable = isAvailable;
        this.isCrooked =isCrooked;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isCrooked() {
        return isCrooked;
    }

    public void setCrooked(boolean crooked) {
        isCrooked = crooked;
    }
}
