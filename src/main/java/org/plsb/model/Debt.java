package org.plsb.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "debt", schema = "public")
public class Debt extends PanacheEntityBase {
    @Id
    @GeneratedValue()
    private UUID id;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "person_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_person_id"))
    private Person person;
    @Column
    private BigDecimal debtValue;
    @Column
    private BigDecimal valueRemaining;
    @Column
    private LocalDateTime creationDate;
    @Column
    private LocalDateTime lastPaymentDate;

}
