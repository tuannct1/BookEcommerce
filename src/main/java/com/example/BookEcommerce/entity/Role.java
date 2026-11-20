package com.example.BookEcommerce.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "role_name", unique = true, nullable = false, length = 50)
    private String roleName;
<<<<<<< HEAD

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
=======
    
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
>>>>>>> 776945f592f9c355801824d92f090976f066ac1d
