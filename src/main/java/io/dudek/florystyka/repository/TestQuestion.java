package io.dudek.florystyka.repository;

import io.dudek.florystyka.domain.Question;

import java.util.List;
import java.util.Set;

public interface TestQuestion {
    List<Question> findTestQuestions(Set<Integer> ids);
}