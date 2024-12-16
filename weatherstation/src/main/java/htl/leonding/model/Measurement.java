package htl.leonding.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Measurement extends PanacheEntity {
    @ManyToOne
    @JoinColumn(name = "sensor_id", nullable = false)
    public Sensor sensor;

    @Column(nullable = false)
    public LocalDateTime timestamp;

    @Column(nullable = false)
    public float temperature;

    @Column(nullable = false)
    public float humidity;

    @Column(nullable = false)
    public float pressure;

    @Column(nullable = false)
    public String status;

}
