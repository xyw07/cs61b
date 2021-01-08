import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {

    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    @Test
    public void testEqualChars() {
        assertFalse(offByOne.equalChars('a', 'e'));
        assertTrue(offByOne.equalChars('a', 'b'));
        assertEquals(offByOne.equalChars('a', 'b'), true);
        assertEquals(offByOne.equalChars('A', 'B'), true);
        assertEquals(offByOne.equalChars('&', '%'), true);
        assertEquals(offByOne.equalChars('r', 'q'), true);
        assertEquals(offByOne.equalChars('a', 'e'), false);
        assertEquals(offByOne.equalChars('z', 'a'), false);
        assertEquals(offByOne.equalChars('a', 'a'), false);
        assertEquals(offByOne.equalChars('a', 'A'), false);
    }
    // Your tests go here.
}
