public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0);
    numerator = nume;
    denominator = deno;
    reduce();
    if (denominator == 0) {
      denominator = 1;
      numerator = 0;
    }
  }

  public double getValue(){
    return (double)this.getNumerator() / this.getDenominator();
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber flipped = new RationalNumber(denominator, numerator);
    return flipped;
  }

  public boolean equals(RationalNumber other){
    return (other.getNumerator() == this.getNumerator()) && (other.getDenominator() == this.getDenominator());
  }

  public String toString(){
    if (denominator == 1){
      return "" + numerator;
    }
    if (numerator == 0){ // we don't need to say if denominator is zero bc of the constructor
      return "0";
    }
    /* MOVED TO THE REDUCE BECAUSE WE ALWAYS NEED THIS???
    if (denominator < 0){ // if denominator is negative then you will make it positive (multiply by negative) and negate numerator
                          // if denominator is negative and numerator is also this should just make it positive overall
      return "" + (getNumerator() * -1) + "/" + (getDenominator() * -1);
    }
    */
    return "" + numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    a = Math.abs(a);
    b = Math.abs(b);

    if (a > b){
      while(a!=0 && b!=0){ // until either one of them is 0
        int c = b;
        b = a%b;
        a = c;
      }
      return a+b;
    }

    if (a < b){
      while(a!=0 && b!=0){ // until either one of them is 0
        int c = a;
        a = b%a;
        b = c;
      }
      return a+b;
    }

    return 1;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    if (denominator < 0){ // if denominator is negative then you will make it positive (multiply by negative) and negate numerator
                          // if denominator is negative and numerator is also this should just make it positive overall
      denominator = denominator * -1;
      numerator = numerator * -1;
    }

    int magicNumber = gcd(numerator, denominator);
    if (magicNumber != 0){
      numerator = numerator / magicNumber;
      denominator = denominator / magicNumber;
    }
  }

  /******************Operations!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber brandNew = new RationalNumber((this.getNumerator() * other.getNumerator()),(this.getDenominator() * other.getDenominator()));
    return brandNew;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber thisFlipped = this.reciprocal(); // just get reciprocal of this and multiply with the other
    return thisFlipped.multiply(other);
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int top = (this.getNumerator() * other.getDenominator()) + (other.getNumerator() * this.getDenominator());
    int bottom = this.getDenominator() * other.getDenominator();
    RationalNumber finale = new RationalNumber(top, bottom);
    finale.reduce();
    return finale;
  }

  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int top = (this.getNumerator() * other.getDenominator()) - (other.getNumerator() * this.getDenominator());
    int bottom = this.getDenominator() * other.getDenominator();
    RationalNumber finale = new RationalNumber(top, bottom);
    finale.reduce();
    return finale;
  }
}
