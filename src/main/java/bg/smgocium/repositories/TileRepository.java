package bg.smgocium.repositories;

import bg.smgocium.models.enities.TileEntity;
import bg.smgocium.models.enities.ids.TileID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TileRepository extends JpaRepository<TileEntity, TileID> {
}
