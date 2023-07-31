import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinsTest {

    @org.junit.jupiter.api.Test
    public void binsTest() {
        Bins bin = new Bins(2,12);

        int[][] expected = {{2,3,4,5,6,7,8,9,10,11,12},
                {0,0,0,0,0,0,0,0,0,0,0}};

        int[][] actual = bin.getBin();

        Assert.assertArrayEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void getBinTest() {
        Bins bin = new Bins(2,12);

        int expected = 0;
        int receivedNum = bin.numberOfRolls(10);

        Assert.assertEquals(expected, receivedNum);
    }

    @org.junit.jupiter.api.Test
    public void incrementBinTest() {
        Bins bin = new Bins(2,12);

        int expected = 0;
        int receivedNum = bin.numberOfRolls(10);

        Assert.assertEquals(expected, receivedNum);

    }
}