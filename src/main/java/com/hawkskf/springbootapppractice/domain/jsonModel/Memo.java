package com.hawkskf.springbootapppractice.domain.jsonModel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Memo {
    @NotNull
    private boolean isDone;
    @Size(max=1000)
    private String markdownString;
    @NotNull
    private String createdDate;
}
