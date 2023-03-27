package com.company.customer;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequance")
    @SequenceGenerator(
            name = "customer_id_sequance",
            sequenceName = "customer_id_sequance")
    Integer id;

    String firstName;
    String lastName;
    String email;

}
