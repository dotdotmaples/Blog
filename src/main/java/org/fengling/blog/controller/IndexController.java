package org.fengling.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 枫铃也
 * @description 前端  主页
 * @since 2019-11-07 17:48
 */
@Controller
public class IndexController {

    @GetMapping({"", "/", "/index"})
    public String index() {
        return "index";
    }

}
