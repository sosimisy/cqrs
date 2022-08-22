package cqrs.domain;

import cqrs.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
    private String deliveryStatus;
}
