package numerosprimos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mendozaa
 */
public class CribaEratostenesIT {

    public CribaEratostenesIT() {
    }

    /**
     * Tests del método generarPrimos , de la clase CribaEratostenes.
     */
    @Test
    public void testGenerarPrimos0() {
        System.out.println("generarPrimos(0)");
        int max = 0;
        int[] expResult = {};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testGenerarPrimos2() {
        System.out.println("generarPrimos(2)");
        int max = 2;
        int[] expResult = {2};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testGenerarPrimos3() {
        System.out.println("generarPrimos(3)");
        int max = 3;
        int[] expResult = {2, 3};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testGenerarPrimos100() {
        System.out.println("generarPrimos(100)");
        int max = 100;
        int[] expResult = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
    }
}
