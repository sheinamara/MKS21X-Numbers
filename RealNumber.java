public class RealNumber{
  private double value;

  public RealNumber(){
    value = 0;
  }

  public RealNumber(double given){
    value = given;
  }

  public double getNumber(){
    return value;
  }

  public String toString(){
    return "" + getNumber();
  }
}
