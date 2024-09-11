package hotelcmshsj.domain;

import hotelcmshsj.domain.*;
import hotelcmshsj.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CleaningStatusUpdated extends AbstractEvent {

    private Long housekeepingId;
    private Long accomodationId;
    private Long housekeeperId;
    private Boolean cleaned;

    public CleaningStatusUpdated(Housekeeping aggregate) {
        super(aggregate);
    }

    public CleaningStatusUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
