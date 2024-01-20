package com.kn.voting.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.kn.voting.repo.CandidateRepository;

@Service
public class CandidateService {

	private final CandidateRepository candidateRepository;

	public CandidateService(CandidateRepository candidateRepository) {
		this.candidateRepository = candidateRepository;

	}

	public void enterCandidate(String name) {
		// candidateRepository.enterCandidate(name);
		return;
	}

	public int castVote(String name) {
		// return candidateRepository.castVote(name);
		return 5;
	}

	public int countVote(String name) {
		// return candidateRepository.countVote(name);
		return 10;
	}

	public String listVote() {
		// return candidateRepository.listVote();
		return null;
	}

	public String getWinner() {
		// return candidateRepository.getWinner();
		return null;
	}

}
