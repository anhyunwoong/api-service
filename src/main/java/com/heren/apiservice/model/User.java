package com.heren.apiservice.model;

import lombok.*;
import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class User {

    @Id
    @Column(name = "uid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;

    @NonNull
    @Column(length = 20, nullable = false)
    private String id;

    @NonNull
    @Column(length = 100, nullable = false)
    private String password;

}
