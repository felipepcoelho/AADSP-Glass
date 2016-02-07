
package AADSP.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/menuPrincipal")
public class MenuPrincipalController {
    
    @RequestMapping("/controller")
    public ModelAndView hello() {
            String message = "Welcome to Spring MVC 4.0!";

            return new ModelAndView("/menuPricipal/MenuView", "message", message);
    }
}
