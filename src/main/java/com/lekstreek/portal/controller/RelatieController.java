package com.lekstreek.portal.controller;

import com.lekstreek.portal.domain.*;
import com.lekstreek.portal.exception.*;
import com.lekstreek.portal.repository.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 15-11-21.
 */
@RestController
public class RelatieController {

    private final RelatieRepository repository;

    RelatieController(RelatieRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/relaties")
    List<Relatie> all() {
        return repository.findAll();
    }

    @PostMapping("/relaties")
    Relatie newRelatie(@RequestBody Relatie newRelatie) {
        return repository.save(newRelatie);
    }

    @GetMapping("/relaties/{id}")
    Relatie one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RelatieNotFoundException(id));
    }

    @DeleteMapping("/relaties/{id}")
    void deleteRelatie(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
