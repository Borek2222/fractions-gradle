import org.junit.Assert;
import org.junit.Test;


public class TestAddition {

    @Test
    public void testPlus() {
        var fraction = TestUtils.createFraction(3, 5);
        var result = fraction.plus(new NotImplementedFraction(3, 5));

        Assert.assertEquals((Integer) 6, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }
}
