import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FordF150Test {
    FordF150 Steve;

    @Before
    public void setUp() throws Exception {
        Steve = new FordF150();
    }


    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        Steve.upgradeSpeed();
        assertEquals(135, Steve.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        Steve.downgradeSpeed();
        assertEquals(125, Steve.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(34000, Steve.getPrice());
    }
}
