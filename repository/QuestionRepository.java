package com.test.crud.repository;

import com.test.crud.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    //아래는 findBySubject를 추상 메서드로 선언한 것이다.
    Question findBySubject(String subject);
}
