package kr.ac.kopo.viewfit.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cos_review")
public class CosReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int cosmeticId;

    // TODO: security 연동 시, 변경
    @Column
    private int userId;

    @Column
    private Float rating;

    @Column
    private String comment;

}