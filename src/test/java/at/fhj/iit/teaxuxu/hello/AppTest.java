package at.fhj.iit.teaxuxu.hello;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldDetectFirstMax()
    {
        assertTrue( App.myMax(3, 1) == 3);
    }

    @Test
    public void shouldDetectSecondMax()
    {
        assertTrue( App.myMax(1, 3) == 3);
    }

}
