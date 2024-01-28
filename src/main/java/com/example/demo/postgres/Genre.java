package com.example.demo.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "genres")
public class Genre {
    @Id
    public Long id;
    @Column(name = "value")
    public String value;

    public Genre() {}
}
