/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san.beer.model;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sdeshapriya
 */
public class BeerExpert {
    public List<String> getBandList(String color){
        List<String> brand = null;
        if("red".equalsIgnoreCase(color)){
            brand = Arrays.asList("Coca Cola", "Red bull");
        }else{
            brand = Arrays.asList("Sprite", "Elipent house");
        }
        return brand;
    }
}
