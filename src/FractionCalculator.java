import java.util.Scanner;

public class FractionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a fraction operation:");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");
        if (tokens.length != 3) {
            System.out.println("Incorrect operation format");
            return;
        }

        String operand1 = tokens[0];
        String operator = tokens[1];
        String operand2 = tokens[2];

        Fraction fraction1 = parseFraction(operand1);
        Fraction fraction2 = parseFraction(operand2);

        if (fraction1 == null || fraction2 == null) {
            System.out.println("Invalid operands");
            return;
        }

        Fraction result = null;
        switch (operator) {
            case "+":
                result = fraction1.add(fraction2);
                break;
            case "-":
                result = fraction1.subtract(fraction2);
                break;
            case "*":
                result = fraction1.multiply(fraction2);
                break;
            case "/":
                result = fraction1.divide(fraction2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result.toString());
    }

    private static Fraction parseFraction(String input) {
        try {
            if (input.contains("_")) {
                String[] parts = input.split("_");
                int wholeNumber = Integer.parseInt(parts[0]);
                String fractionPart = parts[1];

                String[] fractionParts = fractionPart.split("/");
                int numerator = Integer.parseInt(fractionParts[0]);
                int denominator = Integer.parseInt(fractionParts[1]);

                return new Fraction(wholeNumber, numerator, denominator);
            } else if (input.contains("/")) {
                String[] parts = input.split("/");
                int numerator = Integer.parseInt(parts[0]);
                int denominator = Integer.parseInt(parts[1]);

                return new Fraction(numerator, denominator);
            } else {
                int wholeNumber = Integer.parseInt(input);
                return new Fraction(wholeNumber);
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    public Fraction(int wholeNumber, int numerator, int denominator) {
        this.numerator = wholeNumber * denominator + numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        if (numerator == 0 || denominator == 1) {
            return Integer.toString(numerator);
        } else if (Math.abs(numerator) > Math.abs(denominator)) {
            int wholeNumber = numerator / denominator;
            int remainder = Math.abs(numerator) % Math.abs(denominator);
            return wholeNumber + "_" + remainder + "/" + Math.abs(denominator);
        } else {
            return numerator + "/" + denominator;
        }
    }

}
