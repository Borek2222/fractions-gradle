import org.junit.Assert;
import org.junit.Test;


public class TestSubtraction {
    @Test
    public void testMinus() {
        var fraction = TestUtils.createFraction(7, 2);
        var result = fraction.minus(new NotImplementedFraction(8, 4));

        Assert.assertEquals((Integer) 3, result.getNumerator());
        Assert.assertEquals((Integer) 2, result.getDenominator());
    }
}
