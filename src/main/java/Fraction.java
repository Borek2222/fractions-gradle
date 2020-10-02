public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int finalNum = (getNumerator() *  other.getDenominator()) + (other.getNumerator() * getDenominator());
        int finalDen = getDenominator() * other.getDenominator();

        return new Fraction(finalNum, finnalDen);

    }

    @Override
    public IFraction minus(IFraction other) {
        int finalNum = (getNumerator() *  other.getDenominator()) - (other.getNumerator() * getDenominator());
        int finalDen = getDenominator() * other.getDenominator();

        return new Fraction(finalNum, finalDen);
    }

    @Override
    public IFraction times(IFraction other) {
        int finalNum = getNumerator() * other.getNumerator();
        int finalDen = getDenominator() * other.getDenominator();

        return new Fraction(finalNum, finalDen);
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int finalNum = getNumerator() * other.getDenominator();
        int finalDen = other.getNumerator() * getDenominator();

        return new Fraction(finalNum, finalDen);
    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {

    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}
