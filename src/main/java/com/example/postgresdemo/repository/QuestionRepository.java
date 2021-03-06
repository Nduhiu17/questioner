package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByForumId(Long forumId);
}

