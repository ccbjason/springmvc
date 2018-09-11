package zxq.springmvc.helloworld;


import com.sun.deploy.net.HttpResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping("/ajaxUser.do")
    public void userNumber(String userNumber, HttpServletResponse response){
       try
       {
           response.setContentType("text/html");
           response.setCharacterEncoding("utf-8");
           PrintWriter out =response.getWriter();
           if("admin".equals(userNumber))
           {
               out.println("管理员已存在！");
           }
           else
           {
               out.println(userNumber+"该账号可用！");
           }
           out.flush();
           out.close();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }

   //@RequestBody 将json对象转成java对象
//@ResponseBody 表示返回的是json对象
@ResponseBody      //会将响应返回的消息转成json数组返回给前台
@RequestMapping("/ajaxgetUser.do")
    public
List<UserInfo> ajaxUser(UserInfo userxx)
    {
      //   Logger logger = Logger.getLogger(UserController.class);

      System.out.println("username:"+userxx.getUsername()+"----password:"+userxx.getPassword());
      logger.info("username:"+userxx.getUsername()+"----password:"+userxx.getPassword());
        //模拟调用service-dao

      UserInfo user1=new UserInfo(1,userxx.getUsername(),userxx.getUserId(),userxx.getPassword(),userxx.getCardid(),userxx.getSex(),userxx.getClsize(),userxx.getEmpno(),userxx.getPhone(),userxx.getRuntype());
//        UserInfo user2=new UserInfo(2,userxx.getCardid(),0,userxx.getClsize());
//        UserInfo user3=new UserInfo(3,userxx.getEmpno(),0,userxx.getRuntype());
//        UserInfo user4=new UserInfo(4,userxx.getPhone(),0,"--");
        List<UserInfo> users = new ArrayList<>();
        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);

        return  users;
    }
}
