package ru.barsegyan.MyFirstTestAppSpringBoot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private String id;
    private String operationUid;
    private String systemTime;
    private String code;
    private String errorCode;
    private String errorMessage;
}
