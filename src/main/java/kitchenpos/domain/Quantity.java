package kitchenpos.domain;

import kitchenpos.exception.domain.quantity.InvalideQuantityValueException;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Quantity {
    @Column(name = "quantity", nullable = false)
    private Long quantity;

    public Quantity() {
    }

    private Quantity(Long quantity) {
        this.quantity = quantity;
    }

    private static void validate(Long quantity) {
        if (Objects.isNull(quantity) || quantity < 0L) {
            throw new InvalideQuantityValueException();
        }
    }

    public static Quantity from(Long quantity) {
        validate(quantity);
        return new Quantity(quantity);
    }
}
