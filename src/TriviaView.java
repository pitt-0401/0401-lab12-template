/*
 * Created on 2026-11-12
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionListener;

// We define a custom View that extends the functionality from JFrame
public class TriviaView extends JFrame {
    // Define UI elements
    private JLabel questionLabel;
    private JRadioButton[] radioButtons;
    private JButton checkAnswerButton;
    private JButton nextButton;
    private ButtonGroup group;
    private JLabel resultLabel;

    // Hint: you can make use of and adapt these constants!
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 250;
    private static final String APP_NAME = "Trivia!";

    public TriviaView() {
        // Set up the frame
        setTitle(APP_NAME);
        // Default operation that will happen when the user closes this frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Define the size of the content area (the title bar is added on top)
        getContentPane().setPreferredSize(new Dimension(0, 0));
        setLayout(null);

        generateLayout();
        pack();
        // Center the window on the screen
        setLocationRelativeTo(null);
    }

    // Getters and setters
    public char getSelectedAnswer() {
        for (int i = 0; i < radioButtons.length; i++) {
            if (radioButtons[i].isSelected()) {
                return (char) ('A' + i);
            }
        }
        return ' ';
    }

    public void setQuestion(String question) {
        // TODO: set the question label's text
    }

    public void setOptions(String[] options) {
        // TODO: set the text for the radio buttons to display the answer options
    }

    // Set up the view's layout: adds labels and buttons
    private void generateLayout() {
        // Add question label
        questionLabel = new JLabel();
        questionLabel.setBounds(50, 20, 600, 20);
        add(questionLabel);

        // Add radio buttons for answer options as a button group
        radioButtons = new JRadioButton[3];
        group = new ButtonGroup();
        for (int i = 0; i < 3; i++) {
            radioButtons[i] = new JRadioButton();
            radioButtons[i].setBounds(50, 50 + (i * 30), 600, 20);
            group.add(radioButtons[i]);
            add(radioButtons[i]);
        }

        // Add check answer button
        checkAnswerButton = new JButton("Check answer");
        checkAnswerButton.setBounds(50, 140, 150, 30);
        add(checkAnswerButton);

        // Add next button
        nextButton = new JButton("Next");
        nextButton.setBounds(200, 140, 150, 30);
        add(nextButton);

        // Add the result label
        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 190, 300, 20);
        add(resultLabel);
    }

    // Button listeners (no need to change any code here!)
    public void addCheckAnswerListener(ActionListener listenForCheckAnswerButton) {
        checkAnswerButton.addActionListener(listenForCheckAnswerButton);
    }

    public void addNextButtonListener(ActionListener listenForNextButton) {
        nextButton.addActionListener(listenForNextButton);
    }

    public void clearSelection() {
        group.clearSelection();
    }

    public void showResult(String result) {
        resultLabel.setText(result);
    }

    public void clearResultText() {
        resultLabel.setText("");
    }
}
