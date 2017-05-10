/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms.bean_a;

import java.util.List;


public class RootNode {
    private String name;
    
    private List<ListElement> listOfElements;

    public List<ListElement> getListOfElements() {
        return listOfElements;
    }

    public void setListOfElements(List<ListElement> listOfElements) {
        this.listOfElements = listOfElements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
