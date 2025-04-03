/*
 * Created on 2026-11-12
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// No need to change this file!
public interface Question {
    int score(String answer);

    void display(TriviaView view);

    void showResult(String answer, TriviaView view);

    void clearResultText(TriviaView view);
}
