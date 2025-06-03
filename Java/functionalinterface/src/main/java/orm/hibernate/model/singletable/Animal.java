package orm.hibernate.model.singletable;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "animals")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "animal-type", // Column name in database
        discriminatorType = DiscriminatorType.STRING, // Type of the discriminator
        length = 10 // Column length
)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    public Animal(String name) {
        this.name = name;
    }
}

