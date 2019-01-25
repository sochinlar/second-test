package com.soc.secondtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NieYinjun
 * @date 2019/1/25 11:45
 * @tag
 */
@RestController

public class IndexController {
    @RequestMapping("/")
    @ResponseBody
    public Object index(){
        return "this is index page";
    }

}
