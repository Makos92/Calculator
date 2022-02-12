package sample.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class calculatorController {

    @FXML
    private TextField textField;

    private String firstNumber = "";

    private String currentNumber = "";

    private String calculationSymbol = "";

    private int calculatedNumber;

    @FXML
    void divideAction(ActionEvent event){
        calculationSetup("/");
    }

    @FXML
    void multiplicationAction (ActionEvent event){
        calculationSetup("*");
    }

    @FXML
    void minusAction (ActionEvent event){
        calculationSetup("-");
    }

    @FXML
    void plusAction (ActionEvent event){
        calculationSetup("+");
    }

    @FXML
    void calculateAction(ActionEvent event) {
        calculate();
    }

    public void calculationSetup (String calculation){
        if(firstNumber.equals("")) {
            this.calculationSymbol = calculation;
            firstNumber = currentNumber;
            currentNumber = "";
        }
        else{
            calculate();
            firstNumber = String.valueOf(calculatedNumber);
            currentNumber = "";
            this.calculationSymbol = calculation;
        }
    }

    public void calculate()
    {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationSymbol){
            case "/" -> {
                calculatedNumber = firstNumberInt / secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
                currentNumber = String.valueOf(calculatedNumber);
                firstNumber = "";
            }
            case "*" -> {
                calculatedNumber = firstNumberInt * secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
                currentNumber = String.valueOf(calculatedNumber);
                firstNumber = "";
            }
            case "-" -> {
                calculatedNumber = firstNumberInt - secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
                currentNumber = String.valueOf(calculatedNumber);
                firstNumber = "";
            }
            case "+" -> {
                calculatedNumber = firstNumberInt + secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
                currentNumber = String.valueOf(calculatedNumber);
                firstNumber = "";
            }



        }
    }

    @FXML
    void clearAction(ActionEvent event){
        currentNumber = "";
        firstNumber = "";
        textField.setText("");
    }

    @FXML
    void button1Clicked(ActionEvent event){
        addNumber("1");
    }

    @FXML
    void button2Clicked(ActionEvent event){
        addNumber("2");
    }

    @FXML
    void button3Clicked(ActionEvent event){
        addNumber("3");
    }

    @FXML
    void button4Clicked(ActionEvent event){
        addNumber("4");
    }

    @FXML
    void button5Clicked(ActionEvent event){
        addNumber("5");
    }

    @FXML
    void button6Clicked(ActionEvent event){
        addNumber("6");
    }

    @FXML
    void button7Clicked(ActionEvent event){
        addNumber("7");
    }

    @FXML
    void button8Clicked(ActionEvent event){
        addNumber("8");
    }

    @FXML
    void button9Clicked(ActionEvent event){
        addNumber("9");
    }

    @FXML
    void button0Clicked(ActionEvent event){
        if(!currentNumber.equals(""))
        addNumber("0");
    }
    public void updateTextField(){
        textField.setText(currentNumber);
    }

    public void addNumber (String number){
        currentNumber += number;
        updateTextField();
    }

}
