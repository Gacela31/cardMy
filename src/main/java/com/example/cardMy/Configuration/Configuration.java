package com.example.cardMy.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
