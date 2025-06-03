package orm.hibernate.model.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("cat") // Value stored in discriminator column
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Cat extends Animal {
    private Boolean likesMilk;

    public Cat(String name, Boolean likesMilk) {
        super(name);
        this.likesMilk = likesMilk;
    }
}


