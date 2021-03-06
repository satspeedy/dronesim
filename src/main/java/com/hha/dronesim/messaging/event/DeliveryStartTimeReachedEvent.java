package com.hha.dronesim.messaging.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonDeserialize(builder = DeliveryStartTimeReachedEvent.DeliveryStartTimeReachedEventBuilder.class)
@Builder(builderClassName = "DeliveryStartTimeReachedEventBuilder", toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryStartTimeReachedEvent {

    private String eventId;

    private LocalDateTime eventDateTime;

    private String deliveryId;

    private String startAddress;

    private String endAddress;

    private Double startLatitude;

    private Double startLongitude;

    private Double endLatitude;

    private Double endLongitude;

    private LocalDateTime pickupLocalDateTime;

    private LocalDateTime estimatedTimeOfArrival;

    private String deliveryStatus;

    private String droneId;

    private String droneNickName;

    private String userId;

    private String userName;

    private String trackingNumber;

    @JsonPOJOBuilder(withPrefix = "")
    public static class DeliveryStartTimeReachedEventBuilder {
    }
}
