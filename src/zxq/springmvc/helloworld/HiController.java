package zxq.springmvc.helloworld;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class HiController {


    @RequestMapping("/demo1")
    public ModelAndView demo1(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Say111");
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","HiControlle Mvc-Model!");
        mv.setViewName("/jsp/say.jsp");
        return mv;
        //return "say";
    }



    @RequestMapping("/demo2")
    public ModelAndView demo2(String user) throws   Exception{

        System.out.println("demo2"+user);
        ModelAndView mv=new ModelAndView("/jsp/say1.jsp");
        mv.addObject("msg","HiControlle Mvc-Model!"+user);

        return mv;

    }
}
