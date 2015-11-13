package com.lwenn.web.controller;

import com.lwenn.web.dao.UserDao;
import com.lwenn.web.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by lwenn on 15/11/1.
 */
public class RegisterController extends AbstractController {

    private UserDao dao;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView view;
        Map<String, String[]> map = request.getParameterMap();
        String name = map.get("name")[0];
        String password = map.get("password")[0];
        User user = new User();
        user.setUserName(name);
        user.setUserPassword(password);
        if (dao.addUser(user) > 0) {
            view = new ModelAndView("newUser");
            view.addObject("user", user);
            return view;
        }
        view = new ModelAndView("message");
        view.addObject("message", "REGISTER FAILED.");
        return view;
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
