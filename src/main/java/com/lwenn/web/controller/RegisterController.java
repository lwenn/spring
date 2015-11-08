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

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView view;
        Map<String, String[]> map = request.getParameterMap();
        String name = map.get("name")[0];
        String password = map.get("password")[0];
        User user = new User();
        user.setUserName(name);
        user.setUserPassword(password);
        UserDao dao = new UserDao();
        if (dao.addUser(user) != null) {
            view = new ModelAndView("newUser");
            view.addObject("user", user);
            return view;
        }
        view = new ModelAndView();
        view.addObject("message", "REGISTER FAILED.");
        return view;
    }
}
