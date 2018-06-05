package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/auth")
public class AuthorizationController {

    @GetMapping("/login")
    public String demo() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String demo(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);

        if (username.equals("ala") && password.equals("kot")){
            HttpSession session = request.getSession();

            session.setAttribute("username", username);
            session.setAttribute("authorized", true);
            session.setAttribute("role", "customer");
            session.setMaxInactiveInterval(30*60);

            return "user authorized";
        }
        else
        {
            return "user not authorized";
        }
    }

}