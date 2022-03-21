package com.Tasks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Tasks.Entity.Task;

@Repository
@Component
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
