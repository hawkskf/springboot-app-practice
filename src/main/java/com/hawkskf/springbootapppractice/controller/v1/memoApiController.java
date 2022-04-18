package com.hawkskf.springbootapppractice.controller.v1;

import java.util.ArrayList;

import com.hawkskf.springbootapppractice.domain.jsonModel.Memo;

import com.hawkskf.springbootapppractice.domain.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoApiController {

    @Autowired
    private MemoService memoService;

    @GetMapping("/v1/memos")
    public ArrayList<Memo> getListMemo() {
        return memoService.getMemos("1");
    }

}
