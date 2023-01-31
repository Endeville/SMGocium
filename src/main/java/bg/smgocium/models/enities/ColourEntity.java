package bg.smgocium.models.enities;

import bg.smgocium.models.enities.base.BaseEntity;
import bg.smgocium.models.enities.enums.Colour;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "colours")
@NoArgsConstructor
@Getter
@Setter
public class ColourEntity extends BaseEntity {

    @Column(nullable = false, unique = true)
    private Colour colour;
}
