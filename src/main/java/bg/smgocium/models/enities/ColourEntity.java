package bg.smgocium.models.enities;

import bg.smgocium.models.enities.base.BaseEntity;
import bg.smgocium.models.enities.enums.Colour;
import jakarta.persistence.*;
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
    @Enumerated(EnumType.STRING)
    private Colour colour;
}
