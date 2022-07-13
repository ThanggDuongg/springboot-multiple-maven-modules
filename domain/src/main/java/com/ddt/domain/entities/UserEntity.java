package com.ddt.domain.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.*;

@Schema(hidden = true) /*If use swagger => use this annotation to hide properly model properties*/
@Entity
@Table(
        name = "\"user\"",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_email_unique", columnNames = "email")
        }
    )
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserEntity {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1,
            initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @Column(name = "user_id")
    private Long Id;

    @Column(name = "email")
    private String Email;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "password", nullable = false)
    private String Password;
}
