package cqrs.domain;

import cqrs.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;
}
