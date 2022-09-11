package com.example.fzibz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class fizbuzmwController {
    @FXML
    private Button checkbutton;

    @FXML
    private TextField input;

    @FXML
    private Label labelinfo;

    @FXML
    private Label resultLabel;

    public void oncheckButtonClick(ActionEvent event){
        int i = Integer.parseInt(String.valueOf(input.getText()));
        resultLabel.setText(fizzBuzz(i));
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number+" neither fizz nor buzz");
    }
}
