package com.example.schedulemanagement.dto;

import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class CreateScheduleRequestDto {
    private String title; //제목
    private String content; //내용
    private String writer; //작성자
    private String password; //비번

}
