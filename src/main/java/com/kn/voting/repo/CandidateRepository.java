package com.kn.voting.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kn.voting.entity.Student;

public interface CandidateRepository extends JpaRepository<Student, Integer> {

}
