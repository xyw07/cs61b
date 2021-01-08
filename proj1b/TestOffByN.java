import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestOffByN {
    static OffByN offBy5 = new OffByN(5);

    @Test
    public void testEqualChars() {
        assertEquals(offBy5.equalChars('a', 'f'), true);
        assertEquals(offBy5.equalChars('f', 'a'), true);
        assertEquals(offBy5.equalChars('h', 'f'), false);
    }
}
