package company;

import lombok.Data;

@Data
public class Item {
    private String name;
    private float oldQuantity;
    private String unit;
    private float calculatedQuantity;


    public Item(String name, float oldQuantity, String unit) {
        this.name = name;
        this.oldQuantity = oldQuantity;
        this.unit = unit;

    }
}

