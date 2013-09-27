package secure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Secure controller
 *
 * @author Paul Kulitski
 */
@Controller
public class SecureController {

    @RequestMapping("/secure/secured")
    public String secured(Model model) {
        return "secured";
    }

    @RequestMapping("/unsecured")
    public String unsecured(Model model) {
        return "unsecured";
    }

    @RequestMapping("/admin/manager")
    public String admin(Model model) {
        return "admin/admin";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }
    
    @RequestMapping("/login")
    public String login(
            @RequestParam(value = "login_error",required = false) String error,
            Model model) {
        
        return "login";        
    }
            
}
