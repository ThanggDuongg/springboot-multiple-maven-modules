package com.ddt.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "task")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {
    @Id
    @SequenceGenerator(
            name = "task_sequence",
            sequenceName = "task_sequence",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "task_sequence"
    )
    @Column(name = "task_id")
    private Long Id;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "is_complete", columnDefinition = "BOOLEAN DEFAULT false")
    private Boolean IsComplete = false;

    @Column(
            name = "date_start",
            nullable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
    )
    private LocalDate DateStart;

    @Column(name = "date_end")
    private LocalDate DateEnd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "Id",
            referencedColumnName = "user_id"
    )
    private UserEntity userEntity;
}
