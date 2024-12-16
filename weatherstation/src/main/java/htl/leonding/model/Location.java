package htl.leonding.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Location extends PanacheEntity {
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    public List<Sensor> sensors = new ArrayList<>();

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String description;
}
