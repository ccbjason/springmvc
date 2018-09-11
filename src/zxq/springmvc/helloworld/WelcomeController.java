package zxq.springmvc.helloworld;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
public class WelcomeController
{
    private static Logger logger = Logger.getLogger(WelcomeController.class);

    @RequestMapping("/welcome")
    @ResponseBody
    public String getAppName(){
        logger.info("访问首页");
        return "<h1>SpringMVC integrate  log4j - a demo</h1>";
    }
}
