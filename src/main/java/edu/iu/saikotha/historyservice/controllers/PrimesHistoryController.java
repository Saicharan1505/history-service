package edu.iu.saikotha.historyservice.controllers;


import edu.iu.saikotha.historyservice.model.PrimesRecord;
import edu.iu.saikotha.historyservice.repository.PrimesHistoryRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/Primes")
public class PrimesHistoryController {
    private final PrimesHistoryRepository primesHistoryRepository;

    public PrimesHistoryController(
            PrimesHistoryRepository primesHistoryRepository){
        this.primesHistoryRepository = primesHistoryRepository;
    }

    @GetMapping("/{customer}")
    public List<PrimesRecord> findAll(@PathVariable String customer){
        return primesHistoryRepository.findAllByCustomer(customer);
    }


}
