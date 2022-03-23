package mypac;

public class BodyMassIndex {
    public static void main(String[] args) {
        double yourHeight = 1.86;
        short yourKg = 97;
        double heightForFormula = yourHeight * 2;
        double BMI = yourKg / heightForFormula;
        System.out.println(BMI);
    }
}
