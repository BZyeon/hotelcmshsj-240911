package hotelcmshsj.external;

import java.util.Date;
import lombok.Data;

@Data
public class Housekeeping {

    private Long housekeepingId;
    private Long accomodationId;
    private Long housekeeperId;
    private Boolean cleaned;
}
