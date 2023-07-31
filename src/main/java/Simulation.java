public class Simulation {

    private int numberOfDies;
    private int numberOfTosses;
    private static Dice dice;
    private Bins bin;



    public static void main(String[] args) {
        play();

    }

    public void Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        dice = new Dice(numberOfDies);
        bin = new Bins(numberOfDies,numberOfDies * 6);
    }

    public static void play() {
        dice.setNumOfDiceThrown(3);
        dice.getNumOfDiceThrown();
        dice.tossAndSum();

    }

}
