package ru.barsegyan.MyFirstTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.barsegyan.MyFirstTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}