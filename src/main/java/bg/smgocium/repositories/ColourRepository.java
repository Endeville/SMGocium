package bg.smgocium.repositories;

import bg.smgocium.models.enities.ColourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColourRepository extends JpaRepository<ColourEntity, Long> {
}
