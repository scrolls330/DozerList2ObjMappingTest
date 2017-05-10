/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms.bean_b;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Pocket<T> {

    private T value;

    public T getValue() {
        return value;
    }
}

public class ListWrapper /* extends Pocket<String> */ extends ArrayList {

    List<ListElement> containedList = new ArrayList<>();

    public ListWrapper() {
        super();
    }

    public List<ListElement> getContainedList() {
        return containedList;
    }

    public void setContainedList(List<ListElement> list) {
        this.containedList = list;
    }
}
