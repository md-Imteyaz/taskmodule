package com.Tasks.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;

@Entity
@ComponentScan
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int tid;
	private String tname;
	private String tstatus;

	public int gettid() {
		return tid;
	}

	public void settdi(int tid) {
		this.tid = tid;
	}

	public String gettname() {
		return tname;
	}

	public void settname(String tname) {
		this.tname = tname;
	}

	public String gettstatus() {
		return tstatus;
	}

	public void settstatus(String tstatus) {
		this.tstatus = tstatus;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(int tid, String tname, String tstatus) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tstatus = tstatus;
	}

	@Override
	public String toString() {
		return "Task [tid=" + tid + ", tname=" + tname + ", tstatus=" + tstatus + "]";
	}
}
