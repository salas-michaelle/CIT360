package MVC;

import java.awt.event.*;

public class ControllerCalc {

    private ViewCalc displayCalc;

    private ModelCalc modelCalc;

    public ControllerCalc(ViewCalc displayCalc, ModelCalc modelCalc) {

        this.displayCalc = displayCalc;

        this.modelCalc = modelCalc;


        this.displayCalc.addCalculateListener(new CalculateListener());

    }

    class CalculateListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;


            try{

                firstNumber = displayCalc.getFirstNumber();

                secondNumber = displayCalc.getSecondNumber();

                modelCalc.multiplyTwoInts(firstNumber, secondNumber);

                displayCalc.setCalcSolution(modelCalc.getCalculationValue());

            }

            catch(NumberFormatException ex){

                System.out.println(ex);

                displayCalc.displayErrorMessage("You MUST enter 2 whole numbers");

            }

        }

    }

}
