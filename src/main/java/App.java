import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/",(request,response) -> {
            return new ModelAndView(new HashMap(),"hello.hbs");
        },new HandlebarsTemplateEngine());

        get("photos",(request,response)-> {
            return new ModelAndView(new HashMap(),"photos.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
