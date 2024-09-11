package hotelcmshsj.domain;

import hotelcmshsj.domain.*;
import hotelcmshsj.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CleaningStatusUpdated extends AbstractEvent {

    private Long housekeepingId;
    private Long accomodationId;
    private Long housekeeperId;
    private Boolean cleaned;
}
