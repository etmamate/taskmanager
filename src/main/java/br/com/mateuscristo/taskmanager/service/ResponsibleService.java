package br.com.mateuscristo.taskmanager.service;

import br.com.mateuscristo.taskmanager.model.Responsible;
import br.com.mateuscristo.taskmanager.repository.ResponsibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsibleService {
    @Autowired
    private ResponsibleRepository responsibleRepository;

    public List<Responsible> findAll() {
        return responsibleRepository.findAll();
    }

    public Responsible save(Responsible responsible) {
        return responsibleRepository.save(responsible);
    }
}

