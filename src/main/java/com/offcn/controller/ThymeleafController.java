package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

/**
 * @author ：yz
 * @date ：Created in 2020/9/27 10:27
 * @version: 1.0
 *
 * 注意：
 *      千万不能使用@RestController
 *          @Controller
 *          @ResponseBody
 *
 *    ThymeleafController:
 *             作用：
 *                  设置模型数据
 *                  跳转到页面显示，不是直接写入responsebody 响应到浏览器
 *
 *
 *
 *
 */
@Controller
public class ThymeleafController {


    @GetMapping("/demo1")
    public String demo1(Model model){

        model.addAttribute("msg","欢迎来到优就业");


        return "index1";
    }

    @GetMapping("/demo2")
    public String demo2(Model model){

        //创建user对象
        User user=new User();
        user.setId(1);
        user.setName("刘亦菲");
        user.setAge(38);
        //存储
        model.addAttribute("user",user);
        //创建map
        Map map=new HashMap();
        map.put("id",2);
        map.put("name","张三");
        map.put("age",28);
        map.put("sex","男");

        model.addAttribute("map",map);




        return "index2";
    }

    @GetMapping("/demo3")
    public String demo3(Model model){

        //创建集合
        List<User> list=new ArrayList<User>();
        //创建user对象
        User user=new User(1,"张三",18);
        User user2=new User(2,"李四",28);
        User user3=new User(3,"王五",38);
        User user4=new User(4,"赵六",48);

        //存储到集合
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        //存储到model
        model.addAttribute("list",list);


        return "index3";

    }



    @GetMapping("/demo4")
    public String demo4(Model model){

        //字符串
        model.addAttribute("str","优就业");
        //连接
        model.addAttribute("hrefValue","http://www.ujiuye.com");
        //图片
        model.addAttribute("srcValue","01.jpg");



        return "index4";

    }

    @GetMapping("/demo5")
    public String demo5(Model model){

        //存储布尔类型的数据
        model.addAttribute("flag","false");
        //菜单
        model.addAttribute("menu","admin");
        //权限
        model.addAttribute("manager","manager");


        return "index5";

    }

      @GetMapping("/demo6")
    public String demo6(Model model){


        return "index6";

    }

    @GetMapping("/demo7")
    public String demo7(Model model){

        //添加事件
        model.addAttribute("date",new Date());
        //添加一个小数
        model.addAttribute("price",12.456789d);
        //大量文本
        String  str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n\" ;";

        model.addAttribute("str",str);

        //字符串截取
        model.addAttribute("str2","JAVA-AAA");


        return "index7";

    }



}
