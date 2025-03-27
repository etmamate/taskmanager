package br.com.mateuscristo.taskmanager.controller;

import br.com.mateuscristo.taskmanager.model.Responsible;
import br.com.mateuscristo.taskmanager.service.ResponsibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responsibles")
public class ResponsibleController {
    @Autowired
    private ResponsibleService responsibleService;

    @GetMapping
    public List<Responsible> findAll() {
        return responsibleService.findAll();
    }

    @PostMapping
    public Responsible save(@RequestBody Responsible responsible) {
        return responsibleService.save(responsible);
    }
}

