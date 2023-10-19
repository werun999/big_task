package by.itclass;

import by.itclass.exception.CompetitionException;
import by.itclass.model.Cat;
import by.itclass.model.Dog;
import by.itclass.utils.CompetitionUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats=new ArrayList<>();
        List<Dog> dogs=new ArrayList<>();
        Map<String,String> errors=new HashMap<>();


        CompetitionUtil.parseFile(cats,dogs,errors);



    }



}
