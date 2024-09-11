package hotelcmshsj.domain;

import hotelcmshsj.domain.*;
import hotelcmshsj.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CheckInInfoRegistered extends AbstractEvent {

    private Long accomodationId;
    private Object checkInTime;
    private Long roomId;
}
