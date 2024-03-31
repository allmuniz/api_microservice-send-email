package com.ms.user.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class EmailDto {

    private UUID userId;

    private String emailTo;

    private String subject;

    private String text;
}
