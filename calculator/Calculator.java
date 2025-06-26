package calculator;

public class Calculator {
    public static void main(String[] args) {
        CalculatorGUI gui = new CalculatorGUI();
        CalculatorLogic logic = new CalculatorLogic();
        CalculatorController controller = new CalculatorController(gui, logic);
    }
}