import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerTester {

    @Test
    public void AdditionTest() {
        IntegerNumber testInteger = new IntegerNumber(3);
        testInteger.addition(4);
        assertEquals(7, testInteger.integer);
    }
        
}
