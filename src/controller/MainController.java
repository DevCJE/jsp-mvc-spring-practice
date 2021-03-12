package controller;

import model.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;

@Controller
public class MainController {

    @RequestMapping("/index.do")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();

        UserDTO user1 = new UserDTO(1, "조주일", "1111");
        UserDTO user2 = new UserDTO(2, "조주이", "2222");
        UserDTO user3 = new UserDTO(3, "조주삼", "3333");

        ArrayList<UserDTO> users = new ArrayList<UserDTO>();

        users.add(user1);
        users.add(user2);
        users.add(user3);

        mav.addObject("items", users);
        mav.addObject("msg", "MainController에서 왔어요");
        mav.setViewName("index");
        return mav;

    }

}
