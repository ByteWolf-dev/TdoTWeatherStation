package htl.leonding.boundary;

import htl.leonding.control.SensorRepository;
import htl.leonding.model.Sensor;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;

public interface SensorResource extends PanacheRepositoryResource<SensorRepository, Sensor, Long> {

}
