package com.tribukaldero.model.fuel;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name = "fuel_type")
public class Fuel {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "date_updated")
    private LocalDateTime dateUpdated;

    protected Fuel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}