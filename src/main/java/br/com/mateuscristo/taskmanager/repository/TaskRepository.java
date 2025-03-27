package br.com.mateuscristo.taskmanager.repository;

import br.com.mateuscristo.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
