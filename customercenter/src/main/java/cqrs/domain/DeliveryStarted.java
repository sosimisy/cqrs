package cqrs.domain;

import cqrs.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
    private String deliveryStatus;
}
