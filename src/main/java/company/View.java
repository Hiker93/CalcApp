package company;

import lombok.Data;

@Data
public class View {
    Calculator calculator;

    public View(Calculator calc) {
        this.calculator = calc;
    }

    public void getContinuePrintln() {
        System.out.println("To continue, press Enter");
    }

    public void getFinishInputPrintln() {
        System.out.println("To finish input 1, ");
    }

    public void getItemQuantityPrintln() {
        System.out.println("Item quantity :");
    }

    public void getItemUnitPrintln() {
        System.out.println("Item unit :");
    }

    public void getItemNamePrintln() {
        System.out.println("Item name :");
    }

    public void printItem() {

        for(int i = 0; i < calculator.getItems().size(); i++) {
            if(getItem(i).getName() == null) {
                System.out.println("Item name :");
            } else {
                System.out.println("Item name :" + getItem(i).getName());
            }

            if(getItem(i).getOldQuantity() == 0) {
                System.out.println("Item old quantity :");
            } else {
                System.out.println("Item old quantity :" + getItem(i).getOldQuantity());
            }

            if(getItem(i).getUnit() == null) {
                System.out.println("Item unit :");
            } else {
                System.out.println("Item unit :" + getItem(i).getUnit());
            }

            if(getItem(i).getCalculatedQuantity() == 0) {
                System.out.println("Item calculated quantity :");
            } else {
                System.out.println("Item calculated quantity :" + getItem(i)
                        .getCalculatedQuantity());
            }
            System.out.println();
        }
    }

    private Item getItem(int i) {
        return calculator.getItems().get(i);
    }

    public void oldDimensionInfo() {
        System.out.println("Old dimension :");
    }

    public void newDimensionInfo() {
        System.out.println("New dimension :");
    }

}
