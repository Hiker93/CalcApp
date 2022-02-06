package company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller implements Runnable {
    View view;
    Calculator calculator = new Calculator();
    Item item;

    public Controller() {
        this.view = new View(calculator);
    }

    private static float getDimensionFromUser() {
        boolean inputIsNotFloat = true;
        Scanner scanner = new Scanner(System.in);
        float value = 0;
        while(inputIsNotFloat) {
            try {
                value = scanner.nextFloat();
                inputIsNotFloat = false;
            } catch(InputMismatchException e) {
                System.out.println("Dear user, i need a number <3");
                scanner.next();
            }
        }
        return value;
    }

    public Calculator addItem() {
        while(continueAddingItems()) {
            Scanner scanner = new Scanner(System.in);
            view.getItemNamePrintln();
            String name = scanner.nextLine();
            view.getItemUnitPrintln();
            String unit = scanner.nextLine();
            float quantity = 0;
            boolean inputIsNotFloat = true;
            view.getItemQuantityPrintln();
            while(inputIsNotFloat) {
                try {
                    quantity = scanner.nextFloat();
                    inputIsNotFloat = false;
                } catch(InputMismatchException e) {
                    System.out.println("Dude, quantity has to be a number!");
                    scanner.nextLine();
                }
            }
            calculator.addToList(name, quantity, unit);
        }

        return calculator;
    }

    private boolean continueAddingItems() {
        String answer;
        Scanner scanner = new Scanner(System.in);
        view.getFinishInputPrintln();
        view.getContinuePrintln();
        answer = scanner.nextLine();
        return !answer.equalsIgnoreCase("1");
    }

    public Calculator calculatedItem() {
        calculator.calculateItems(calculator.getItems(), calculator.getRatio());
        return calculator;
    }

    public Calculator setRatio() {
        view.oldDimensionInfo();
        float oldDimension = getDimensionFromUser();
        view.newDimensionInfo();
        float newDimension = getDimensionFromUser();
        calculator.calculateRatio(oldDimension, newDimension);
        return calculator;
    }

    @Override
    public void run() {
        System.out.println("$");
        addItem();
        view.printItem();
        setRatio();
        System.out.println(calculator.getRatio());
        calculatedItem();
        view.printItem();

    }
}
