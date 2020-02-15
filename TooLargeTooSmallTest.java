

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TooLargeTooSmallTest.
 *
 * @author  (Aarti Kansal)
 * @version (2/05/2020)
 */
public class TooLargeTooSmallTest
{
    /**
     * Default constructor for test class TooLargeTooSmallTest
     */
    public TooLargeTooSmallTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestRun1()
    {
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(5);
        assertEquals(Integer.valueOf(0), tooLarge1.guess(5));
    }
    
    @Test
    public void TestRun2()
    {
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(6);
        assertEquals(Integer.valueOf(-1), tooLarge1.guess(4));
    }
    
    @Test
    public void TestRun3()
    {
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(2);
        
        assertEquals(Integer.valueOf(-1), tooLarge1.guess(1));
        assertEquals(Integer.valueOf(0), tooLarge1.guess(2));
        assertEquals(Integer.valueOf(1), tooLarge1.guess(3));
    }
    
   
}

