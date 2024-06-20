package ms.libro.idat.controller;

import lombok.RequiredArgsConstructor;
import ms.libro.idat.repository.entity.Employe;
import ms.libro.idat.service.EmployeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employe")
public class EmployeController {
    private final EmployeService service;

    @GetMapping("/test")
    public String testPikachu(){
        return "Hello World Raton mickey mouse chapii 2222";
    }

    @GetMapping
    public List<Employe> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employe getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @PostMapping
    public Employe create(@RequestBody Employe employe){
        return service.save(employe);
    }

    @PutMapping
    public Employe update(@RequestBody Employe employe){
        return service.update(employe.getIdEmploye(), employe.getName());
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
