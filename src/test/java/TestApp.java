import static  org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestApp {

    String input ="racecar";
    App app = new App();
    boolean expected = true;

    @Test
    public void isPalindrome(){
        assertEquals(expected,app.isPalindrome(input));
    }

    @Test
    public void isNotPalindrome(){
        assertFalse(app.isPalindrome(""));
    }

    @Test
    public void testForNull(){
        assertFalse(app.isPalindrome(null));
    }
}
