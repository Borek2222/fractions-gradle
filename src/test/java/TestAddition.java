import org.junit.Assert;
import org.junit.Test;


public class TestAddition {

    @Test
    public void testSimple() {
        var fraction = TestUtils.createFraction(3, 5);
        var result = fraction.plus(new NotImplementedFraction(3, 5));

        Assert.assertEquals((Integer) 6, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }

    @Test
    public void testMinus() {
        var fraction = TestUtils.createFraction(7, 3);
        var result = fraction.minus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 11, result.getNumerator());
        Assert.assertEquals((Integer) 6, result.getDenominator());
    }

    @Test
    public void testTimes() {
        var fraction = TestUtils.createFraction(8, 1);
        var result = fraction.times(new NotImplementedFraction(7, 5));

        Assert.assertEquals((Integer) 56, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }

    @Test
    public void testDivision() {
        var fraction = TestUtils.createFraction(7, 5);
        var result = fraction.dividedBy(new NotImplementedFraction(1, 7));

        Assert.assertEquals((Integer) 49, result.getNumerator());
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
