package com.example.BookEcommerce.entity;

<<<<<<< HEAD

=======
>>>>>>> 776945f592f9c355801824d92f090976f066ac1d
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
<<<<<<< HEAD

=======
    
>>>>>>> 776945f592f9c355801824d92f090976f066ac1d
    private Long id;
    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "is_active")
    private boolean isActive = false;

    @ManyToMany
    @JoinTable(
<<<<<<< HEAD
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
=======
        name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
>>>>>>> 776945f592f9c355801824d92f090976f066ac1d
    )
    private Set<Role> roles;

    @OneToMany(mappedBy = "user")
    private Set<CartItem> cartItems;

    @OneToMany(mappedBy = "user")
    private Set<Order> orders;
<<<<<<< HEAD

    @OneToMany(mappedBy = "user")
    private Set<Review> reviews;
}
=======
    
    @OneToMany(mappedBy = "user")
    private Set<Review> reviews;
}
>>>>>>> 776945f592f9c355801824d92f090976f066ac1d
