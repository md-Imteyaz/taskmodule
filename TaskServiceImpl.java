package com.Tasks.ServiceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Tasks.Entity.Task;
import com.Tasks.Repository.TaskRepository;
import com.Tasks.Service.TaskService;
@Component
public class TaskServiceImpl implements TaskService {

	Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public List<Task> getAllTasks() {
		return (List<Task>) taskRepository.findAll();

	}

	@Override
	public Task getTaskById(int tid) {
		return taskRepository.findById(tid).orElse(null);

	}

	@Override
	public Task addorUpdateTask(Task task) {
		logger.info("task on progress");
		return taskRepository.save(task);

	}

	@Override
	public Task deleteId(int id) throws Exception {
		Task deletedUser = null;
		try {
			deletedUser = taskRepository.findById(id).orElse(null);
			if (deletedUser == null) {
				throw new Exception("user not availaible");
			} else {
				taskRepository.deleteById(id);
			}

		} catch (Exception ex) {
			throw ex;
		}
		logger.info("task deleted succesfully");

		return deletedUser;
	}

}
