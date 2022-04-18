package com.hawkskf.springbootapppractice.domain.service;

import com.hawkskf.springbootapppractice.domain.jsonModel.Memo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MemoServiceImpl implements MemoService {

    @Override
    public ArrayList<Memo> getAllMemos(String id) {
        var list = new ArrayList<Memo>();
        var memo = new Memo();
        memo.setDone(false);
        memo.setCreatedDate("2022/04/18");
        memo.setMarkdownString("# TITLE\n## h2\ngetAllMemos");

        list.add(memo);
        return list;
    }

    @Override
    public ArrayList<Memo> getMemos(String id) {
        var list = new ArrayList<Memo>();
        var memo = new Memo();
        memo.setDone(false);
        memo.setCreatedDate("2022/04/18");
        memo.setMarkdownString("# TITLE\n## h2\nnaiyou");

        list.add(memo);
        return list;
    }
}
