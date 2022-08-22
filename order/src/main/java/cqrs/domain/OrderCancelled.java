package cqrs.domain;

import cqrs.domain.*;
import cqrs.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
    // keep

}
