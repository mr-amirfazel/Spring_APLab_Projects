package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

import javax.swing.*;


public class Controller {
    @FXML

    private TextField textField;
    private Operands operand;
    public void one(ActionEvent e){
      textField.setText(textField.getText()+"1");
        System.out.println("1");
    }
 public void two(ActionEvent e){
      textField.setText(textField.getText()+"2");
        System.out.println("2");
    }
 public void three(ActionEvent e){
      textField.setText(textField.getText()+"3");
        System.out.println("3");
    }
 public void four(ActionEvent e){
      textField.setText(textField.getText()+"4");
        System.out.println("4");
    }
 public void five(ActionEvent e){
      textField.setText(textField.getText()+"5");
        System.out.println("5");
    }
 public void six(ActionEvent e){
      textField.setText(textField.getText()+"6");
        System.out.println("6");
    }
 public void seven(ActionEvent e){
      textField.setText(textField.getText()+"7");
        System.out.println("7");
    } 
    public void eight(ActionEvent e){
      textField.setText(textField.getText()+"8");
        System.out.println("8");
    } 
    public void nine(ActionEvent e){
      textField.setText(textField.getText()+"9");
        System.out.println("9");
    } 
    public void zero(ActionEvent e){
        if (!((textField.getText().equals(""))||(textField.getText() == null))) {
            textField.setText(textField.getText() + "0");
            System.out.println("0");
        }
    }
    public void allClear(ActionEvent e){
            textField.setText("");
            System.out.println("  ");
    }
    public void subtract(ActionEvent e){
        textField.setText(textField.getText() + " - ");
        operand = Operands.SUBTRACT;
    }
    public void add(ActionEvent e){
        textField.setText(textField.getText() + " + ");
        operand = Operands.ADD;
    }
    public void multiply(ActionEvent e){
        textField.setText(textField.getText() + " × ");
        operand = Operands.MULTIPLY;
    }
    public void divide(ActionEvent e){
        textField.setText(textField.getText() + " ÷ ");
        operand = Operands.DIVIDE;
    }
    public void displayResult(ActionEvent e){
        double result=0;
        String[] parts;
        switch (operand){
            case ADD:parts = textField.getText().split(" + ");
            result = Integer.parseInt(parts[0]) +Integer.parseInt(parts[1]);
            break;
            case DIVIDE:parts = textField.getText().split(" ÷ ");
                result = Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
                break;
            case SUBTRACT:parts = textField.getText().split(" - ");
                result = Integer.parseInt(parts[0]) -Integer.parseInt(parts[1]);
                break;
            case MULTIPLY:parts = textField.getText().split(" × ");
                result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
                break;
        }

        JOptionPane.showMessageDialog(null,"Result is  ⇛⇛⇛⇛ "+result);
        allClear(e);
    }

}
