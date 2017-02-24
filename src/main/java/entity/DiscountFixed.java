package entity;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class DiscountFixed extends DiscountType implements Serializable {

    private static final long serialVersionUID = 1L;

    double discount = 0.1; //10% on all

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return priceItem * discount * quantity;
    }

}
