package javatpoint.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeWorldController {
    @RequestMapping("/welcome")
    public ModelAndView welcomeWorld() {
        String message = "Welcome Spring MVC";
        return new ModelAndView("welcomepage", "message", message);
    }
}
