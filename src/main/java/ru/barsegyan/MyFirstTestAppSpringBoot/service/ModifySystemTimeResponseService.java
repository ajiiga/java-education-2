package ru.barsegyan.MyFirstTestAppSpringBoot.service;

import ru.barsegyan.MyFirstTestAppSpringBoot.model.Response;
import ru.barsegyan.MyFirstTestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        return response;
    }
}