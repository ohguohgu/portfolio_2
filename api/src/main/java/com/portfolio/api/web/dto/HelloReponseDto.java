package com.portfolio.api.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloReponseDto {

    private final String name;
    private final int amount;
}
