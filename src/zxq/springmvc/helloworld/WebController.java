package zxq.springmvc.helloworld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class WebController {
    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public String index() {
        return "/index";
    }
    @RequestMapping(value = "/redirect.do", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage.do";
    }
    @RequestMapping(value = "/finalPage.do", method = RequestMethod.GET)
    public String finalPage() {
        return "/user_reg";
    }
}