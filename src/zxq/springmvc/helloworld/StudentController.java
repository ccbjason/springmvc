package zxq.springmvc.helloworld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
    @RequestMapping(value = "/student.do", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("/student.jsp", "command", new Student());
    }

    @RequestMapping(value = "/addStudent.do", method = RequestMethod.POST)
    @ExceptionHandler({SpringException.class})
    public String addStudent( @ModelAttribute("")Student student,
                              ModelMap model) {

        System.out.println("xx22xx");
        if(student.getName().length() < 5 ){
            throw new SpringException("Given name is too short");
        }else{
            model.addAttribute("name", student.getName());
        }
        if( student.getAge() < 10 ){
            throw new SpringException("Given age is too low");
        }else{
            model.addAttribute("age", student.getAge());
        }
        model.addAttribute("id", student.getId());
        return "/result.jsp";
    }

}
