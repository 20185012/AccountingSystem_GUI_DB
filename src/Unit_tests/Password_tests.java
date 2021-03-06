package Unit_tests;

import Utils.DataValidity;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Password_tests {
    @Test
    public void passwordWithLessThan15symbolShouldBeCorrect()
    {
        String password = "qwertyuiop7894";
        assertTrue(DataValidity.isValidPasswordLength(password));
    }
    @Test
    public void passwordWithMorethan15symbolShouldBeIncorrect()
    {
        String password = "qwertyuiop789412548";
        assertFalse(DataValidity.isValidPasswordLength(password));
    }
    @Test
    public void passwordWithoutSymbolShouldBeCorrect()
    {
        String password ="";
        assertFalse(DataValidity.isValidPasswordLength(password));
    }
}
