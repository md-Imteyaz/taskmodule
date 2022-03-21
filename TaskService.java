package com.Tasks.Service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Tasks.Entity.Task;

@Service
@Component
public interface TaskService {
	public List<Task> getAllTasks();

	public Task getTaskById(int tid);

	public Task addorUpdateTask(Task task);

	public Task deleteId(int tId) throws Exception;

}
