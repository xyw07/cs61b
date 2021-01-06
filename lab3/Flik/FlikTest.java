import static org.junit.Assert.*;
import org.junit.Test;

public class FlikTest {
    @Test
    public void testIsSameNumber() {
        for (int j = 0, i = 0; i < 500; ++i, ++j) {
            assertTrue("Flik Lib wrong", Flik.isSameNumber(i, j));
            // the cause of bug may 2^7 = 128 overflow.
        }
    }
}
