package com.example.action;

import com.example.service.UserService;
import com.example.model.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Namespace("/user")
@ResultPath("/WEB-INF/content")
@Action("")
@Result(name = "success", location = "index.jsp")
public class UserAction extends ActionSupport {
    private List<User> userList;
    private User user;
    @Autowired
    private UserService userService;

    @Action(value = "list", results = {
            @Result(name = SUCCESS, location = "list.jsp")
    })
    public String listUsersAction() {
        return SUCCESS;
    }

    @Action(value = "create", results = {
            @Result(name = SUCCESS, location = "create.jsp")
    })
    public String createUserAction() {
        if (user != null) {
            userService.saveUser(user);
            user = null;
        }

        return SUCCESS;
    }

    public String getMessage() {
        return userService.getMessage();
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}