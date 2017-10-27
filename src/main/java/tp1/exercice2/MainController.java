package tp1.exercice2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")


public class MainController {
    @RequestMapping(value="/person-formation",method = {RequestMethod.GET})
    public ModelAndView getPersonFormation(){
        ModelAndView mav = new ModelAndView("personAndFormation");
        mav.addObject("requestForm",new SubmitRequest());
        mav.addObject("formation","ing3 ESIPE");
        return mav;

    }
    @RequestMapping(value="/person-formation",method = {RequestMethod.POST})
    public ModelAndView postPersonAndFormation(
            @ModelAttribute("requestForm") SubmitRequest requestForm, BindingResult result, Model model) {
        ModelAndView mav = new ModelAndView("response"); //param dans jsp qui est formation
        System.out.println(requestForm);
         return mav;
        }

    }



