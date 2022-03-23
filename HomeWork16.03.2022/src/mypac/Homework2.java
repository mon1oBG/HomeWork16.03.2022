package mypac;

public class Homework2 {
    public static void main(String[] args) {
    int month = 7;
    int day = 2;

    String springSeason = 3 <= month && day >= 20 || day <= 20 && month <= 6 || month <6 && month >3 ? "true" : "false";
    System.out.println(springSeason); //Програмата трябва да отпечатва true ако денят е между 20ти Март (включително) и 20ти Юни (включително) и false в противен случай
    }
}
