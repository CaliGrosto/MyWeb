package com.diana.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hyperlink {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/List")
    public String list(){
        return "List";
    }

    @RequestMapping("/Login")
    public String Login(){
        return "Login";
    }

    @RequestMapping("/List/create")
    public String ListCreate(){
        return "create";
    }

    @RequestMapping("/PluginsList")
    public String PluginList(){
        return "PluginsList";
    }

    @RequestMapping("/PluginsList/FTB")
    public String PluginsListFTB(){
        return "FTB";
    }
}
