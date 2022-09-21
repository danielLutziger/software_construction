package lecture1;

import java.util.Arrays;

public class Fraction extends Number implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    public Fraction(int num, int den) {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    public Integer getNumerator() {
        return numerator;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public Fraction add(int other) {
        return add(new Fraction(other));
    }

    public Fraction add(Fraction other) {
        int newNum = other.denominator * this.numerator + this.denominator * other.numerator;
        int newDen = this.denominator * other.denominator;
        int common = gcd(newNum, newDen);
        return new Fraction(newNum / common, newDen / common);
    }

    private static int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;
            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    public double doubleValue() {
        return ((double) numerator) / ((double) denominator);
    }

    public float floatValue() {
        return ((float) numerator) / ((float) denominator);
    }

    public int intValue() {
        return numerator / denominator;
    }

    public long longValue() {
        return ((long) numerator) / ((long) denominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public boolean equals(Object that) {
        if (that == null) return false;
        if (this.getClass() != that.getClass()) return false;
        Fraction other = (Fraction) that;

        int num1 = this.numerator * other.denominator;
        int num2 = this.denominator * other.numerator;
        return num1 == num2;
    }

    public int compareTo(Fraction other) {
        int num1 = this.numerator * other.denominator;
        int num2 = this.denominator * other.numerator;
        return num1 - num2;
    }

    // This is a unit test program to test the class.
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(1, 4);

        System.out.println(f1.add(3));
        System.out.println(f1.intValue());
        System.out.println(f1.doubleValue());

        Fraction[] myFracs = {f1, f2, f3};
        Arrays.sort(myFracs);

        for (Fraction f : myFracs) {
            System.out.println(f);
        }
    }
}
