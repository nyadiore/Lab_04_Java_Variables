public class Main {
    public static void main(String[] args) {
        int intOperandA= 1;
        int intOperandB= 5;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        intSum = intOperandA + intOperandB;
        intProduct= intOperandA * intOperandB;
        intDifference= intOperandA - intOperandB;
        intQuotient= intOperandA / intOperandB;
        intModulo= intOperandA % intOperandB;

    //Output the results for integer operations
        System.out.println("Integer Operations:");
        System.out.println("The sum using int of" +intOperandA + "and" +intOperandB +"is" +intSum);
        System.out.println("The products using int of" +intOperandA + "and" +intOperandB +"is" +intProduct);
        System.out.println("The difference using int of" +intOperandA + "and" +intOperandB +"is" +intProduct);
        System.out.println("The quotient using int of" +intOperandA +"and" +intOperandB +"is" +intQuotient);
        System.out.println("The modulo using int of" +intOperandA +"and" +intOperandB +"is" +intModulo);

        double doubleOperandA= 3.50;
        double doubleOperandB= 4.75;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        //Output the results for the double operations
        System.out.println("Double Operations");
        System.out.println("The sum using double of" +doubleOperandA +"and" +doubleOperandB +"is" +doubleSum);
        System.out.println("The product using double of" +doubleOperandA +"and" +doubleOperandB +"is" +doubleProduct);
        System.out.println("The difference using double of" +doubleOperandA +"and" +doubleOperandB +"is" +doubleDifference);
        System.out.println("The quotient using double of" +doubleOperandA +"and" +doubleOperandB +"is" +doubleQuotient);

        int numberOfFamilyMembers= 4;
        boolean isItRaining= true;
        double priceOfPerfume= 75;
        double myFavoriteNumber= 4;
        double myShoeSize= 7;
        int birthMonth= 10;
        String fullName= "Nya Diore Robinson";

        //Print the variable values
        System.out.println("The number of people in my family is: " +numberOfFamilyMembers);
        System.out.println("Is it raining?" +isItRaining);
        System.out.println("The price of perfume is: $" +priceOfPerfume);
        System.out.println("My favorite number is: " +myFavoriteNumber);
        System.out.println("My shoe size is: " +myShoeSize);
        System.out.println("My birth month is: " +birthMonth);
        System.out.println("My full name is: " +fullName);






    }
}