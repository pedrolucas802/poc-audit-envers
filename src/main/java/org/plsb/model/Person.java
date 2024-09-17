package org.plsb.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "debt", schema = "public")
public class Person extends PanacheEntityBase {
    @Id
    @GeneratedValue()
    private UUID id;
    @Column
    private String first_name;
    @Column
    private String last_name;

}
