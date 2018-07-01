package com.devcolibri.dataexam.service;

import com.devcolibri.dataexam.entity.Worker;

import java.util.List;

public interface WorkerService {

    Worker getByName(String name);
    Worker editWorker(Worker worker);
    List<Worker> getAll();

}
