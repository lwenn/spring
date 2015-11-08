package com.lwenn.web.controller;

import com.lwenn.web.dao.UserDao;
import com.lwenn.web.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by lwenn on 15/11/1.
 */
public class LoginController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView view;
        Map<String, String[]> map = request.getParameterMap();
        String name = map.get("name")[0];
        String password = map.get("password")[0];
        UserDao dao = new UserDao();
        List<User> list = dao.getUsersByName(name);
        if (list != null && list.get(0) != null) {
            User user = list.get(0);
            if (user.getUserPassword() == password) {
                view = new ModelAndView("oldUser");
                view.addObject("user", user);
                return view;
            }
        }
        view = new ModelAndView("oldUser");
        view.addObject("message", "WRONG NAME OR PASSWORD!");
        return view;
    }
}
