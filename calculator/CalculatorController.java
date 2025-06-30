package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorGUI gui;
    private CalculatorLogic logic;

    public CalculatorController(CalculatorGUI gui, CalculatorLogic logic) {
        this.gui = gui;
        this.logic = logic;
        gui.addButtonListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" -> gui.setTextFieldText(gui.getTextFieldText() + command);
                case "+", "-", "*", "/" -> {
                    logic.setPreviousNumber(Double.parseDouble(gui.getTextFieldText()));
                    logic.setOperation(command);
                    gui.setTextFieldText("");
                }
                case "=" -> {
                    logic.setCurrentNumber(Double.parseDouble(gui.getTextFieldText()));
                    gui.setTextFieldText(String.valueOf(logic.performOperation()));
                }
                case "C" -> gui.setTextFieldText("");
            }
        }
    }
}
