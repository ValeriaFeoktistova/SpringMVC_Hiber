package CRUD_MVC.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 11, message = "Name should be between 2 to 11")
    private String name;

    @Column(name = "age")
    private long age;

    @Column(name = "pet")
    private String pet;

    @Column(name = "hobby")
    @NotEmpty(message = "hobby should be empty")
    private String hobby;

    public User(String name, int age, String pet, String hobby) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.hobby = hobby;
    }
}
