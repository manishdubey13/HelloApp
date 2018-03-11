package com.mani.helloapp.cucumber.stepdefs;

import com.mani.helloapp.HelloApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HelloApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
