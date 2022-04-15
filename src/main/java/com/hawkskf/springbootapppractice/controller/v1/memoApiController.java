package com.hawkskf.springbootapppractice.controller.v1;

import java.util.ArrayList;

import com.hawkskf.springbootapppractice.domain.jsonModel.Memo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class memoApiController {

    public ArrayList<Memo> getListMemo() {

        return new ArrayList<>();
    }

}
