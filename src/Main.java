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



    }
}