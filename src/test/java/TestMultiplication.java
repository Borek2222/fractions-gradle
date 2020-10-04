import org.junit.Assert;
import org.junit.Test;


public class TestMultiplication {

    @Test
    public void testTimes() {
        var fraction = TestUtils.createFraction(2, 25 );
        var result = fraction.times(new NotImplementedFraction(7, 5));

        Assert.assertEquals((Integer) 14, result.getNumerator());
        Assert.assertEquals((Integer) 125, result.getDenominator());
    }
}
