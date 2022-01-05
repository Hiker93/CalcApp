package company;

import lombok.Data;

@Data
public class View {

    Calculator calculator;


    public View() {
        this.calculator = new Calculator();
    }

    public void printItem() {

        for (int i = 0; i < calculator.getItems().size(); i++) {
            if (calculator.getItems().get(i).getName() == null) {
                System.out.println("Item name :");
            } else {
                System.out.println("Item name :" + calculator.getItems().get(i).getName());
            }

            if (calculator.getItems().get(i).getOldQuantity() == 0) {
                System.out.println("Item old quantity :");
            } else {
                System.out.println("Item old quantity :" + calculator.getItems().get(i).getOldQuantity());
            }

            if (calculator.getItems().get(i).getUnit() == null) {
                System.out.println("Item unit :");
            } else {
                System.out.println("Item unit :" + calculator.getItems().get(i).getUnit());
            }

            if (calculator.getItems().get(i).getCalculatedQuantity() == 0) {
                System.out.println("Item calculated quantity :");
            } else {
                System.out.println("Item calculated quantity :" + calculator.getItems().get(i).getCalculatedQuantity());
            }
            System.out.println();
        }
    }

}
