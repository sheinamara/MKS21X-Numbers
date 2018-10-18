public class TestDriver {
    public static void main(String[] args) {
        System.out.println("Testing RealNumber");
        System.out.println("The test case passes if the statement is true\n\n1.");
        //1
        RealNumber R1 = new RealNumber(227.5);
        RealNumber R2 = new RealNumber(32.5);

        System.out.println(R1 + " ?= 227.5");
        System.out.println(R2 + " ?= 32.5");
        System.out.println(R1.getValue() + " ?= 227.5");
        System.out.println(R2.getValue() + " ?= 32.5\n\n2.");
        //2
        System.out.println(R1.add(R2) + " ?= 260.0");
        System.out.println(R1.subtract(R2) + " ?= 195.0");
        System.out.println(R1.multiply(R2) + " ?= 7393.75");
        System.out.println(R1.divide(R2) + " ?= 7.0\n\n3.");
        //3
        RealNumber R3 = new RealNumber(-62.1);
        RealNumber R4 = new RealNumber(155.25);

        System.out.println(R3 + " ?= -62.1");
        System.out.println(R4 + " ?= 155.25");
        System.out.println(R3.getValue() + " ?= -62.1");
        System.out.println(R4.getValue() + " ?= 155.25");
        //4
        System.out.println(R3.add(R4) + " ?= 93.15\n\n4");
        System.out.println(R3.subtract(R4) + " ?= -217.35");
        System.out.println(R3.multiply(R4) + " ?= -9641.025");
        System.out.println(R3.divide(R4) + " ?= -0.4");

        System.out.println("\nTesting RationalNumber\n5.");
        //5 Basically is testing if your gcd works
        System.out.println(new RationalNumber(3, 9) + " ?= 1/3");
        System.out.println(new RationalNumber(0, 6) + " ?= 0");
        System.out.println(new RationalNumber(-9, 57) + " ?= -3/19");
        System.out.println(new RationalNumber(-30, -75) + " ?= 2/5\n\n6.");

        //6
        RationalNumber Q1 = new RationalNumber(5, 3);
        RationalNumber Q2 = new RationalNumber(6, 75);

        System.out.println("" + Q1.getNumerator() + "/" + Q1.getDenominator() + " ?= 5/3");
        System.out.println("" + Q2.getNumerator() + "/" + Q2.getDenominator() + " ?= 2/25");
        System.out.println(Q1.getValue() + " ?= 1.6666(LotsOf6s)6667");
        System.out.println(Q2.getValue() + " ?= 0.08\n\n7.");
        //7
        Q1 = Q1.reciprocal();
        Q2 = Q2.reciprocal();
        RationalNumber Q3 = new RationalNumber(-3, -2);
        RationalNumber Q4 = new RationalNumber(8, -6);

        System.out.println(Q1 + " ?= 3/5");
        System.out.println(Q2 + " ?= 25/2");
        System.out.println(Q3 + " ?= 3/2");
        System.out.println(Q4 + " ?= -4/3");
        System.out.println(new RationalNumber(35, 0) + " ?= 0\n\n8.");
        //8
        System.out.println(Q1.add(Q3) + " ?= 21/10");
        System.out.println(Q2.add(Q4) + " ?= 67/6");
        System.out.println(Q1.multiply(Q2) + " ?= 15/2");
        System.out.println(Q3.multiply(Q4) + " ?= -2");
        System.out.println(Q1.divide(Q4) + " ?= -9/20");
        System.out.println(Q4.subtract(Q1) + " ?= -29/15\n\n9.");
        //9
        RationalNumber Qwow = new RationalNumber(75, 50);
        RationalNumber Quwu = new RationalNumber(69, 115);
        RationalNumber Qlmao = new RationalNumber((9 + 10), 0);

        System.out.println(Q1.equals(Q2) + " ?= false");
        System.out.println(Q3.equals(Q2) + " ?= false");
        System.out.println(Qwow.equals(Q3) + " ?= true");
        System.out.println(Qwow.equals(Qwow) + " ?= true");
        System.out.println(Quwu.equals(Qwow) + " ?= false");
        System.out.println(Quwu.equals(Q1) + " ?= true");
        System.out.println(Qlmao.equals(new RationalNumber(0, 0)) + " ?= true\n\n10.");
        //10
        System.out.println(R1.add(Q1) + " ?= 228.1");
        System.out.println(R2.subtract(Q4) + " ?= 33.83333(LotsOf3s)");
        System.out.println(Q3.multiply(R1) + " ?= 341.25");
        System.out.println(Q2.add(R1) + " ?= 240");
    }
}
