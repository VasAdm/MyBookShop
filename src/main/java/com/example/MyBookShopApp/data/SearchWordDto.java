package com.example.MyBookShopApp.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SearchWordDto {
    private String example;

    public SearchWordDto(String example) {
        this.example = example;
    }
}
