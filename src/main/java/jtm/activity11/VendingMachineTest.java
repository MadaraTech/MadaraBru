package jtm.activity11;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class VendingMachineTest {
    VendingMachine machine;

    @Before
    public void setUp() {
        machine = new VendingMachine();
    }

    @Test
    public void testInitialBalance(){
       String result = machine.balance();
       assertEquals("Balance expected to be 0.00$", "0.00$", result);
    }
    @Test
    public void testDepositAndBalance(){
        machine.depositCoins(7.45);

        String result = machine.balance();
        assertEquals("Balance expected to be 7.45$", "7.45$", result);

    }
    @Test
    public void testEjectCoinsBack(){
        machine.addProducts("bounty", 0.45);
        machine.depositCoins(7.45);
        machine.chooseProduct("bounty");
        double result = machine.ejectCoinsBack();
        assertEquals(7.00, result, 0.01);

    }
    @Test
    public void testNotEnoughBalance(){
        machine.addProducts("bounty", 0.70);
        String result = machine.chooseProduct("bounty");
        assertEquals("Balance not enough", result);

    }
    @Test
    public void testNonExistingProduct(){
        machine.addProducts("bounty", 0.70);
        machine.depositCoins(1000.0);
        String result = machine.chooseProduct("twix");

        assertNull(result);
    }
    @Test
    public void testCaseSensitive(){
        machine.addProducts("bounty", 0.70);
        machine.depositCoins(1000.0);
        String result = machine.chooseProduct("BOUNTY");
        assertEquals("BOUNTY", result);
    }
}