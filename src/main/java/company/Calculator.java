package company;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Calculator {
    private boolean isDiameter;
    private int oldValue;
    private int newValue;
    private float ratio;
    @Setter(AccessLevel.NONE)
    private List<Item> items;


    public Calculator() {
        this.items = new ArrayList<>();
    }

    public float calculateRatio(float oldValue, float newValue) {

        return ratio = newValue / oldValue;
    }

    public List<Item> calculateItems(List<Item> items, float ratio) {

        items.stream().forEach(x -> x.setCalculatedQuantity(x.getOldQuantity() * ratio));

        return items;
    }

    public List<Item> addToList(String name, float oldQuantity, String unit) {

        Item item = new Item(name, oldQuantity, unit);

        this.items.add(item);

        return items;
    }

    public List<Item> addToList(Item item) {
        items.add(item);
        return items;
    }
}
