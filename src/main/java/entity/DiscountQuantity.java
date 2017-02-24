package entity;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class DiscountQuantity extends DiscountType implements Serializable {

    private static final long serialVersionUID = 1L;

    int quantityForDiscount = 3;
    double discount = 0.2; //20% on all if quantity is 3 or more

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return quantity >= quantityForDiscount ? priceItem * quantity * discount : 0;
    }

}
