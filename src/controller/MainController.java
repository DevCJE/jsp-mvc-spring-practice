package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;

@Controller
public class MainController {

    @RequestMapping("/index.do")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();



        mav.addObject("msg", "MainController에서 왔어요");
        mav.setViewName("index");
        return mav;

    }

}
