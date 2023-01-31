package bg.smgocium.models.enities;

import bg.smgocium.models.enities.base.BaseEntity;
import bg.smgocium.models.enities.ids.TileID;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tiles")
@NoArgsConstructor
@Getter
@Setter
public class TileEntity {

    @EmbeddedId
    private TileID id;

    @ManyToOne(optional = false)
    private ColourEntity colour;

    @ManyToOne(optional = false)
    private UserEntity client;
}
