package com.alibou.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {


    private MyFirstClass myFirstClass;



    @Autowired
    public void setMyFirstClass(@Qualifier("myThirdBean") MyFirstClass myFirstClass){
            this.myFirstClass = myFirstClass;
    }

    public  String tellStory(){
        return "the dependency is saying : " + myFirstClass.hello();
    }

}
