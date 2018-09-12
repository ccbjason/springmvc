package zxq.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller


//@RequestBody 将json对象转成java对象

//@ResponseBody 表示返回的是json对象
public class JsonSource {

    @RequestMapping("/testJson6")
    public String testJson6(@RequestBody List<UserInfo> persons) {
        System.out.println("persons2222:" + persons);
        return "success";
    }
}