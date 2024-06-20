package ms.libro.idat.service;

import lombok.RequiredArgsConstructor;
import ms.libro.idat.repository.dao.EmployeDao;
import ms.libro.idat.repository.entity.Employe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeService {

    private final EmployeDao repository;

    public List<Employe> getAll() {
        return repository.findAll();
    }

    public Employe getById(int id) {
        Optional<Employe> employe = repository.findById(id);
        return employe.orElse(null); // Manejar el caso cuando no se encuentra el empleado
    }

    public Employe save(Employe employe) {
        return repository.save(employe);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public Employe update(Integer id, String name) {
        Optional<Employe> optionalEmploye = repository.findById(id);
        if (optionalEmploye.isPresent()) {
            Employe employe = optionalEmploye.get();
            employe.setName(name);
            return repository.save(employe); // Guardar y devolver el empleado actualizado
        }
        return null; // Manejar el caso cuando no se encuentra el empleado
    }
}
