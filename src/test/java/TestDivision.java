import org.junit.Assert;
import org.junit.Test;


public class TestDivision {

    @Test
    public void testDivide() {
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
