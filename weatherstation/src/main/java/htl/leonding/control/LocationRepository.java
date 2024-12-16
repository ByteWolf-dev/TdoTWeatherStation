package htl.leonding.control;

import htl.leonding.model.Location;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LocationRepository implements PanacheRepository<Location> {
    public Location findByName(String name) {
        return find("name", name).firstResult();
    }
}
