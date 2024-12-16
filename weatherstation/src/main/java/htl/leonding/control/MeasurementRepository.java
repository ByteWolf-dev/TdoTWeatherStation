package htl.leonding.control;

import htl.leonding.model.Measurement;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDateTime;

@ApplicationScoped
public class MeasurementRepository implements PanacheRepository<Measurement> {
    public Measurement findBySensorAndTimestamp(Long sensorId, LocalDateTime timestamp) {
        return find("sensor.id = ?1 and timestamp = ?2", sensorId, timestamp).firstResult();
    }
}
