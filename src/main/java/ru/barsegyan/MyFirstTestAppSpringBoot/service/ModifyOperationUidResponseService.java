package ru.barsegyan.MyFirstTestAppSpringBoot.service;

import ru.barsegyan.MyFirstTestAppSpringBoot.model.Response;

import java.util.UUID;

public class ModifyOperationUidResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        UUID uuid = UUID.randomUUID();

        response.setOperationUid(uuid.toString());

        return response;
    }
}