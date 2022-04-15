package com.hawkskf.springbootapppractice.domain.jsonModel;

import lombok.Data;

@Data
public class Memo {
    private boolean isDone;
    private String markdownString;
    private String createdDate;

}
