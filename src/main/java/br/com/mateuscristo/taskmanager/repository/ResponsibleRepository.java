package br.com.mateuscristo.taskmanager.repository;

import br.com.mateuscristo.taskmanager.model.Responsible;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsibleRepository extends JpaRepository<Responsible, Long> {
}
