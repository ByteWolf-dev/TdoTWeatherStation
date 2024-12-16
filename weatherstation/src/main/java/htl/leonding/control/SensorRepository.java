package htl.leonding.control;

import htl.leonding.model.Sensor;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SensorRepository implements PanacheRepository<Sensor> {
    public Sensor findByType(String type) {
        return find("type", type).firstResult();
    }
}
