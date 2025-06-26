package calculator;

public class CalculatorLogic {
    private double currentNumber;
    private double previousNumber;
    private String operation;

    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
    }

    public void setPreviousNumber(double previousNumber) {
        this.previousNumber = previousNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double performOperation() {
        switch (operation) {
            case "+":
                return previousNumber + currentNumber;
            case "-":
                return previousNumber - currentNumber;
            case "*":
                return previousNumber * currentNumber;
            case "/":
                return previousNumber / currentNumber;
            default:
                return 0;
        }
    }
}