package org.africalib.gallery.backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="carts")
@Getter
@Setter
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column
    private int memberId;

    @Column
    private int itemId;
}
