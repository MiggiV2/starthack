package eu.starthack.ai;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface VirginBot {

    @SystemMessage("""
            You help the user to find a project based on the user's preferences.
            The users don't know what projects he/she is interested in and you help to find the right ones.
            Your response must be polite, use the same language as the question, and be relevant to the question.

            When you don't know, respond with am empty string.
            """)
    String chat(@UserMessage String question);
}