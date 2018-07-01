package com.devcolibri.dataexam.service.impl;

import com.devcolibri.dataexam.entity.Client;
import com.devcolibri.dataexam.entity.Worker;
import com.devcolibri.dataexam.repository.ClientRepository;
import com.devcolibri.dataexam.repository.WorkerRepository;
import com.devcolibri.dataexam.service.ClientService;
import com.devcolibri.dataexam.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    WorkerRepository workerRepository;

    @Override
    public Worker getByName(String name) {
        return null;
    }

    @Override
    public Worker editWorker(Worker worker) {
        return null;
    }

    @Override
    public List<Worker> getAll() {
        return null;
    }
}
