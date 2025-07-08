📟 Java Swing Calculator
A simple calculator application built using Java Swing. This project demonstrates the use of Model-View-Controller (MVC) architecture to create a clear and modular desktop GUI application.


🚀 Features
Basic arithmetic operations: Addition, Subtraction, Multiplication, Division

Clear and responsive graphical user interface (GUI)

MVC architecture separation: logic, view, and controller are cleanly separated

Keyboard and mouse input supported through Swing JButton and JTextField


🧱 Project Structurecalculator/
│
├── Calculator.java             # Main class to launch the app
├── CalculatorGUI.java          # Handles all GUI components (View)
├── CalculatorController.java   # Manages user interaction and event handling (Controller)
└── CalculatorLogic.java        # Implements arithmetic operations (Model)


🧠 Design Pattern: MVC
Model (CalculatorLogic): Handles the core arithmetic operations.

View (CalculatorGUI): Builds and displays the graphical interface using JFrame, JPanel, and JButton.

Controller (CalculatorController): Connects user actions with business logic using ActionListener.


📚 Future Enhancements
Implement keyboard input handling
Error handling (e.g., divide by zero)
