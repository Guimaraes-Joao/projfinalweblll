package gabriel.joao.Projfinal.controller;

import gabriel.joao.Projfinal.model.EmployeeEntity;
import gabriel.joao.Projfinal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *@Author: Gabriel y João Pedro
 * @version: 0.4
 * @data: 2/5/2020.
 */
//Spring
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/funcionario")
public class EmployeeContoller {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public ResponseEntity<List<EmployeeEntity>> findAll(){
        return new ResponseEntity<List<EmployeeEntity>>(
                (List<EmployeeEntity>) this.employeeRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    // Consult existing data by id (Consulta os dados existentes por id)
    @GetMapping(path = "/{id}")
    public ResponseEntity<EmployeeEntity> findById(@PathVariable("id") long id) {
        if (this.employeeRepository.findById(id).isPresent()) {
            return new ResponseEntity<EmployeeEntity>(
                    this.employeeRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<EmployeeEntity>(HttpStatus.NOT_FOUND);
    }

    // Consult existing data(Consulta os dados existentes)
    @PostMapping
    public ResponseEntity<EmployeeEntity> store(@RequestBody EmployeeEntity employeeEntity) {
        return new ResponseEntity<EmployeeEntity>(
                this.employeeRepository.save(employeeEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    // Modify data by id(Modifica os dados por id)
    @PutMapping(value ="/{id}")
    public ResponseEntity<EmployeeEntity>update(@PathVariable("id") long id,
                                                @RequestBody EmployeeEntity employeeEntity) throws Exception {

        if(id == 0 || !this.employeeRepository.existsById(id)) {
            throw new Exception("Código Inexistente!");
        }

        return new ResponseEntity<EmployeeEntity>(
                this.employeeRepository.save(employeeEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    // Delete data by id(Deleta dados pelo id)
    @DeleteMapping(value ="/{id}")
    public ResponseEntity<EmployeeEntity>delete(@PathVariable("id") long id) {
        this.employeeRepository.deleteById(id);
        return new ResponseEntity<EmployeeEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
