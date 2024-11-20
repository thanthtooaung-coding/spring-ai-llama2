package com.vinn.llama2.controller;

import com.vinn.llama2.service.LlamaAiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AIController {

    private final LlamaAiService aiService;

    @GetMapping("/api/v1/generate")
    public String generate(@RequestParam(value = "promptMessage") String promptMessage) {
        return aiService.generateResult(promptMessage);
    }
}