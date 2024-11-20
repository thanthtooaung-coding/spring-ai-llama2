package com.vinn.llama2.service.impl;

import com.vinn.llama2.service.LlamaAiService;
import lombok.AllArgsConstructor;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.api.OllamaOptions;

@Service
@AllArgsConstructor
public class LlamaAiServiceImpl implements LlamaAiService {

    private final OllamaChatModel chatModel;

    @Override
    public String generateResult(String prompt){
        ChatResponse response = chatModel.call(
                new Prompt(
                        prompt,
                        OllamaOptions.create()
                                .withModel("llama2")
                ));
        return response.getResult().getOutput().getContent();
    }
}