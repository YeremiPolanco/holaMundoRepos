package ms.libro.idat.service;

import lombok.RequiredArgsConstructor;
import ms.libro.idat.repository.dao.EmployeDao;
import ms.libro.idat.repository.entity.Employe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService {
    private final EmployeDao repository;

    public List<Employe> getAll(){
        return repository.findAll();
    }
    public Employe getById(int id){
        return repository.findById(id).get();
    }
    public Employe save(Employe employe){
        return repository.save(employe);
    }
    public void delete(int id){
        repository.deleteById(id);
    }
    public Employe update(Integer id, String name){
        Employe employeNew = repository.findById(id).get();
        employeNew.setName(name);

        return employeNew;
    }
}
