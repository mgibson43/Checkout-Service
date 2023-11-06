package edu.wgu.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="excursions")
@Getter
@Setter
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="excursion_id")
    private Long id;

    @Column(name="excursion")
    private String excursionTitle;

    @Column(name="excursion_price")
    private BigDecimal excursionPrice;

    @Column(name="image_url")
    private String imageURL;

    @Column(name="create_date")
    private Date createDate;

    @Column(name="last_update")
    private Date lastUpdate;

    @ManyToOne
    private Vacation vacation;

    @ManyToMany
    @JoinTable(
            name="excursion_cartitem",
            joinColumns=@JoinColumn(name="excursion_id"),
            inverseJoinColumns=@JoinColumn(name="cart_item_id")
    )
    private Set<CartItem> cartItems;

    public Excursion() {

    }
}
