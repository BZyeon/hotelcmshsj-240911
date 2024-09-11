package hotelcmshsj.infra;

import hotelcmshsj.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class HousekeepingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Housekeeping>> {

    @Override
    public EntityModel<Housekeeping> process(EntityModel<Housekeeping> model) {
        return model;
    }
}
