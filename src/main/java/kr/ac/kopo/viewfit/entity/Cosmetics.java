package kr.ac.kopo.viewfit.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "cosmetics")
@Getter
@Setter
public class Cosmetics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @Column
    private String description;

    @Column
    private int viewCount;

    @Column
    private int sellCount;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private CosCategory cosCategory;

}
