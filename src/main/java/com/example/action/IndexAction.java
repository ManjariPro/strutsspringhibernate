package com.example.action;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action("/")
@Result(name = "success", location = "/WEB-INF/content/index.jsp")
public class IndexAction {
    private String firstName;

    public String execute() {
        Logger logger = Logger.getLogger(getClass());
        logger.debug("CUSTOM **** Debug message");
        logger.info("CUSTOM **** Info message");
        return "success";
    }

    public String getFirstName() {
        return " WELCOME TO STRUTS, HIBERNATE AND SPRING PROJECT DEMO!";
    }
    public void setFirstName(String fn) {
        this.firstName = fn;
    }
}