package MVC;

public class MyCalculator
{

    public static void main(String[] args)
    {

        ViewCalc displayCalc = new ViewCalc();

        ModelCalc modelCalc = new ModelCalc();

        ControllerCalc theController = new ControllerCalc(displayCalc,modelCalc);

        displayCalc.setVisible(true);

    }

}
