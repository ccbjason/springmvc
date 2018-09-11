package zxq.springmvc.helloworld;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class DemoController {


    @RequestMapping("/demoa1")
    public ModelAndView demoa1(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Say111");
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","HiControlle Mvc-Model!");
        mv.setViewName("/jsp/say.jsp");
        return mv;
        //return "say";
    }



    @RequestMapping("/demoa2")
    public ModelAndView demoa2(String user) throws   Exception{

        System.out.println("demo2"+user);
        ModelAndView mv=new ModelAndView("/jsp/say1.jsp");
        mv.addObject("msg","HiControlle Mvc-Model!"+user);

        return mv;

    }
}
