package hotelcmshsj.domain;

import hotelcmshsj.domain.*;
import hotelcmshsj.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HousekeeperAssigned extends AbstractEvent {

    private Long housekeepingId;
    private Long accomodationId;
    private Long housekeeperId;

    public HousekeeperAssigned(Housekeeping aggregate) {
        super(aggregate);
    }

    public HousekeeperAssigned() {
        super();
    }
}
//>>> DDD / Domain Event
