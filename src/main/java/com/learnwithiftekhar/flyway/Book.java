package com.learnwithiftekhar.flyway;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Book {

    @Id
    String isbn;

    @Column(name = "title")
    String title;

//    @Column(name = "price")
//            @ColumnDefault("0")
//    double price;
}
