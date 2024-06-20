package ms.libro.idat.repository.dao;

import ms.libro.idat.repository.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeDao extends JpaRepository<Employe, Integer> {
}
