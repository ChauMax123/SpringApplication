package com.example.demo.consumingRest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote(){
    }
    public String getType(String type){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public Value getValue(Value value){
        return value;
    }
    public void setValue (Value value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
