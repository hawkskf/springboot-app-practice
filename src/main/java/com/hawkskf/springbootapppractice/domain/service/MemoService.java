package com.hawkskf.springbootapppractice.domain.service;

import com.hawkskf.springbootapppractice.domain.jsonModel.Memo;

import java.util.ArrayList;


public interface MemoService {
    public ArrayList<Memo> getAllMemos(String id);

    public ArrayList<Memo> getMemos(String id);
}
