package htl.leonding.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Sensor extends PanacheEntity {
    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    public Location location;

    @Column(nullable = false)
    public String type;

    @Column(nullable = false)
    public String model;

    @Column(nullable = false)
    public LocalDate installationDate;

    @Column(nullable = false)
    public boolean status;
}
