package com.martynasvq.zkstarter.composers;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Listbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Labels extends SelectorComposer<Listbox> {

    public static ArrayList<String> array = new ArrayList<>(List.of("One", "Two", "Three"));
    public static HashMap<String, String> map = new HashMap<>(Map.of("one", "two", "three", "four"));

    public ArrayList<String> getArray() {
        return array;
    }

    public HashMap<String, String> getMap() {
        return map;
    }
}
