package com.example.schedulemanagement.dto;

import lombok.Getter;

@Getter
public class GetOneScheduleResponse {
    private final Long id; //제목
    private final String title; //제목
    private final String content; //내용
    private final String writer; //작성자
    private final String password; //비번

    public GetOneScheduleResponse(Long id, String title, String content, String writer, String password) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.password = password;
    }
}
