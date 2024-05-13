package com.jsp.repository;

import com.jsp.entity.Dancer;

import java.util.List;

// 추상화된 역할: Dancer 데이터를 CRUD 하라!
// 구체적으로 어떻게?? 어디에서? DB 에서? 세이브파일에서?
// 모르겠고 아무튼 CRUD 해
public interface DancerRepository {

    boolean save(Dancer dancer);

    List<Dancer> retrieve();

    void delete(String id);
}
