import org.junit.Assert;
import org.junit.Test;


public class TestMultiplication {

    @Test
    public void testTimes() {
        var fraction = TestUtils.createFraction(8, 1);
        var result = fraction.times(new NotImplementedFraction(7, 5));

        Assert.assertEquals((Integer) 56, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(1, 2);
        var result = fraction.plus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }
}
