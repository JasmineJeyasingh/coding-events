package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    //localhost:8080, add text states 3 possible languages one could work on
    //h1 with title "Skills Tracker" an h2, and an ol containing
    //3 programming languages of your choosing.

    @GetMapping("title")
    @ResponseBody
    public String titlePage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


    //localhost:8080/form add a form that lets the user enter name
    //and choose their favorite, second favorite, and third favorite language
    //use select elements for each ranking. use @GetMapping()

    @GetMapping("form")
    @ResponseBody
    public String inputPage(){
        return "<html>" +
                "<body>" +
                "<form action='listFav' method='post'>" +
                "<input type='text' name='name'>" +
                "<select name='favLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<select name='secondFavLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<select name='thirdFavLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='submit'>" +
                "</form></body></html>";
    }

    //localhost:8080/form, use @PostMapping and @RequestParam to
    //update the HTML with a h1 stating name, ol showing the 3
    //languages in the order they choose

    @RequestMapping(method = {RequestMethod.POST}, value="listFav")
    @ResponseBody
    public String listFav(@RequestParam String name, @RequestParam String favLang, @RequestParam String secondFavLang, @RequestParam String thirdFavLang){

        return "<html>" +
                "<body>" +
                "<table>" +
                "<tr>" +
                "<th style='border:1px solid #dddddd;text-align:left;padding:8px;'>"+name+"'s</th>" +
                "<th style='border:1px solid #dddddd;text-align:left;padding:8px;'>Favorite Languages</th>" +
                "</tr>" +
                "<tr>" +
                "<td style='border:1px solid #dddddd;text-align:left;padding:8px; background-color:#dddddd;'>1.</th>" +
                "<td style='border:1px solid #dddddd;text-align:left;padding:8px; background-color:#dddddd;'>"+favLang+"</th>" +
                "</tr>" +
                "<tr>" +
                "<td style='border:1px solid #dddddd;text-align:left;padding:8px;'>2.</th>" +
                "<td style='border:1px solid #dddddd;text-align:left;padding:8px;'>"+secondFavLang+"</th>" +
                "</tr>" +
                "<tr>" +
                "<td style='border:1px solid #dddddd;text-align:left;padding:8px;background-color:#dddddd;'>3.</th>" +
                "<td style='border:1px solid #dddddd;text-align:left;padding:8px;background-color:#dddddd;'>"+thirdFavLang+"</th>" +
                "</tr>";
    }
}
