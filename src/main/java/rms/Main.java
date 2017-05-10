/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms;

import java.util.ArrayList;
import java.util.List;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import rms.bean_a.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Starting...");
        ListElement elem1 = new ListElement();
        ListElement elem2 = new ListElement();
        elem1.setElement("elem1");
        elem2.setElement("elem2");       
        RootNode rootNode = new RootNode();
        rootNode.setName("rootName");
        rootNode.setListOfElements(new ArrayList<ListElement>() {{ add(elem1); add(elem2); }} );
        
        try {
            DozerBeanMapper mapper = new DozerBeanMapper();
            List<String> myMappingFiles = new ArrayList<String>();
            myMappingFiles.add("rms/dozerBeanMapping.xml");            
            mapper.setMappingFiles(myMappingFiles);
            rms.bean_b.RootNode destObject = 
                mapper.map(rootNode, rms.bean_b.RootNode.class);
            
            System.out.println("Output: " + destObject.getListWrapper().getContainedList().toString());
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }    
}
