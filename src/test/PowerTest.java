package powerpackage;


import org.junit.Test;
import org.junit.Before;

public class PowerTest {
    private PowerFinder powerFinder;

    @Before
    public void setup(){
        powerFinder = new PowerFinder();
    }

    @Test
    public void testOneRaisedToOneIsOne() {
        assert powerFinder.getPower(1,1) == 1;
    }

    @Test
    public void testTwoRaisedToOneIsTwo() {
        assert powerFinder.getPower(2,1) == 2;
    }

    @Test
    public void testTwoRaisedToTwoIsFour() {
        assert powerFinder.getPower(2, 2) == 4;
    }

    @Test
    public void testThreeRaisedToTwoIsNine() {
        assert powerFinder.getPower(3, 2) == 3*3;
    }
}
