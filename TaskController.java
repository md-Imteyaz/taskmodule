package com.Tasks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tasks.Entity.Task;
import com.Tasks.Service.TaskService;

@RestController
@RequestMapping("/task")

public class TaskController {
	@Autowired
	private TaskService taskService;

	@GetMapping("/alltask")
	public ResponseEntity<List<Task>> getAllTasks() {
		List<Task> task = null;
		try {
			task = taskService.getAllTasks();

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Task>>(task, HttpStatus.OK);
	}

	@GetMapping("/getTaskById/{tId}")
	public ResponseEntity<Task> getTaskById(@PathVariable("tId") int tId) {
		Task task = null;
		try {
			task = taskService.getTaskById(tId);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Task>(task, HttpStatus.OK);
	}

	@PostMapping("/taskaddorUpdate")
	public ResponseEntity<Task> addorUpadateTask(@RequestBody Task task) {
		Task tasks = null;
		try {
			task = taskService.addorUpdateTask(task);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Task>(task, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{tId}")
	public ResponseEntity<Task> deleteId(@PathVariable("id") int tId) {
		Task task = null;
		try {
			task = taskService.deleteId(tId);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Task>(task, HttpStatus.OK);
	}

}
