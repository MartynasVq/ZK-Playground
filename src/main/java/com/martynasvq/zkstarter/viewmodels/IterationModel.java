package com.martynasvq.zkstarter.viewmodels;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import java.util.ArrayList;
import java.util.List;

public class IterationModel {

     public static List<String> wordList = new ArrayList<>(List.of("One", "Two", "Three"));

    public List<String> getWordList() {
        return wordList;
    }

    @Command
    @NotifyChange("wordList")
    public void deleteItem(@BindingParam("item") String word) {
        System.out.println(word);
        wordList.remove(wordList.indexOf(word));
    }
}
