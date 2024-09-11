package hotelcmshsj.domain;

import hotelcmshsj.HousekeepingApplication;
import hotelcmshsj.domain.CleaningStatusUpdated;
import hotelcmshsj.domain.HousekeeperAssigned;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Housekeeping_table")
@Data
//<<< DDD / Aggregate Root
public class Housekeeping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long housekeepingId;

    private Long accomodationId;

    private Long housekeeperId;

    private Boolean cleaned;

    @PostPersist
    public void onPostPersist() {
        HousekeeperAssigned housekeeperAssigned = new HousekeeperAssigned(this);
        housekeeperAssigned.publishAfterCommit();

        CleaningStatusUpdated cleaningStatusUpdated = new CleaningStatusUpdated(
            this
        );
        cleaningStatusUpdated.publishAfterCommit();
    }

    public static HousekeepingRepository repository() {
        HousekeepingRepository housekeepingRepository = HousekeepingApplication.applicationContext.getBean(
            HousekeepingRepository.class
        );
        return housekeepingRepository;
    }
}
//>>> DDD / Aggregate Root
