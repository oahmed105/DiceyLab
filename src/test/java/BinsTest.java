import junit.framework.TestCase;

public class BinsTest extends TestCase {

    public void getBinTest() {
        Bins bin = new Bins(2,12);

        int expected = 0;
        int receivedNum = bin.getBin(10);

        assertEquals(expected, receivedNum);
    }

    public void incrementBinTest() {

    }
}