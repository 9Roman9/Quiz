package com.roman.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuizController {

    @Autowired
    private QuizService quizService;
    @Autowired
    private Randomizer randomizer;
    private String capital;
    private int number;
    private int result;
    private String wordScore;

    @Autowired
    private NumbersCollection<Integer> usedNumbers;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/test1")
    public String test1(Model model){
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Європа"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test1";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public String test2(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Азія"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test2";
    }

    @RequestMapping(value = "/test3", method = RequestMethod.POST)
    public String test3(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Африка"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test3";
    }

    @RequestMapping(value = "/test4", method = RequestMethod.POST)
    public String test4(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Америка"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test4";
    }

    @RequestMapping(value = "/test5", method = RequestMethod.POST)
    public String test5(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Океанія"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test5";
    }

    @RequestMapping(value = "/test6", method = RequestMethod.POST)
    public String test6(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Європа"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test6";
    }

    @RequestMapping(value = "/test7", method = RequestMethod.POST)
    public String test7(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Азія"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test7";
    }

    @RequestMapping(value = "/test8", method = RequestMethod.POST)
    public String test8(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Африка"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test8";
    }

    @RequestMapping(value = "/test9", method = RequestMethod.POST)
    public String test9(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Америка"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test9";
    }

    @RequestMapping(value = "/test10", method = RequestMethod.POST)
    public String test10(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Океанія"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test10";
    }

    @RequestMapping(value = "/test11", method = RequestMethod.POST)
    public String test11(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Європа"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test11";
    }

    @RequestMapping(value = "/test12", method = RequestMethod.POST)
    public String test12(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Азія"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test12";
    }

    @RequestMapping(value = "/test13", method = RequestMethod.POST)
    public String test13(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Африка"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test13";
    }

    @RequestMapping(value = "/test14", method = RequestMethod.POST)
    public String test14(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Америка"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test14";
    }

    @RequestMapping(value = "/test15", method = RequestMethod.POST)
    public String test15(Model model, String capital){
        this.capital = capital;
        fixResult();
        do {
            number = randomizer.nextInt(193);
        } while (usedNumbers.contains(number)||!quizService.getRegion(number+1).equals("Океанія"));
        usedNumbers.add(number);
        model.addAttribute("country",quizService.getStateById(number+1).getCountry());
        return "test15";
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(Model model){
        setWord();
        model.addAttribute("word",wordScore);
        model.addAttribute("result",result);
        result = 0;
        usedNumbers.removeAll(usedNumbers);
        wordScore = "";
        return "result";
    }

    private void fixResult(){
        if (quizService.getStateById(number+1).getCapital().equals(capital)){
            result = result+1;
        }
    }

    public void setWord(){
        if (result==1){
            wordScore = "бал";
        } else if (result==2||result==3||result==4){
            wordScore = "бала";
        } else wordScore = "балів";
    }
}
