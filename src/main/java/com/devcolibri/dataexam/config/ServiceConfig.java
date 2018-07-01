package com.devcolibri.dataexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan({"com.devcolibri.dataexam.config", "com.devcolibri.dataexam.controller"})
public class ServiceConfig {

}
