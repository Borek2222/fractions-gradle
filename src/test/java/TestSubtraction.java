import org.junit.Assert;
import org.junit.Test;


public class TestSubtraction {
    @Test
    public void testMinus() {
        var fraction = TestUtils.createFraction(7, 3);
        var result = fraction.minus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 11, result.getNumerator());
        Assert.assertEquals((Integer) 6, result.getDenominator());
    }


    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(1, 2);
        var result = fraction.plus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }

}
