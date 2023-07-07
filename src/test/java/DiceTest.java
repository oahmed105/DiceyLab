import org.apache.maven.plugin.version.PluginVersionNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {


    @org.junit.jupiter.api.Test
    void constructorTest() {
        //Given
        Dice player = new Dice(3);
        //Then
        int expected = 3;
        int numOfDiceThrown = player.getNumOfDiceThrown();
        //Then
        assertEquals(expected, numOfDiceThrown);
    }
    @org.junit.jupiter.api.Test
    public void tossAndSumTest() {
        //Given
        Dice player = new Dice(2);
        //When

        //Then
        assertNotNull(player.tossAndSum());
    }

    @org.junit.jupiter.api.Test
    void setNumOfDiceThrown() {
        //Given
        Dice player = new Dice(2);
        //Then
        int expected = 3;
        player.setNumOfDiceThrown(3);
        int numOfDiceThrown = player.getNumOfDiceThrown();
        //Then
        assertEquals(expected, numOfDiceThrown);
    }

    @org.junit.jupiter.api.Test
    void getNumOfDiceThrown() {
        //Given
        Dice player = new Dice(42);
        //Then
        int expected = 42;
        int numOfDiceThrown = player.getNumOfDiceThrown();
        //Then
        assertEquals(expected, numOfDiceThrown);
    }



}