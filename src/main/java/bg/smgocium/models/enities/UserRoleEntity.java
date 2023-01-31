package bg.smgocium.models.enities;

import bg.smgocium.models.enities.base.BaseEntity;
import bg.smgocium.models.enities.enums.UserRole;
import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_roles")
@Getter
@Setter
@NoArgsConstructor
public class UserRoleEntity extends BaseEntity {

    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
}
