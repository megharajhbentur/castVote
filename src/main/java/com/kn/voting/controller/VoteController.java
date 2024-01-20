package com.kn.voting.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kn.voting.service.CandidateService;

@RestController
@RequestMapping("/vote")
class CandidateController {
    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping("/entercandidate")
    public void enterCandidate(@RequestParam String name) {
        candidateService.enterCandidate(name);
    }

    @PostMapping("/castvote")
    public int castVote(@RequestParam String name) {
        return candidateService.castVote(name);
    }

    @GetMapping("/countvote")
    public int countVote(@RequestParam String name) {
        return candidateService.countVote(name);
    }

    @GetMapping("/listvote")
    public String listVote() {
        return candidateService.listVote();
    }

    @GetMapping("/getwinner")
    public String getWinner() {
        return candidateService.getWinner();
    }
}
