package com.yzh.gym.controller;


import com.yzh.gym.utils.R;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-09-28
 */
@CrossOrigin
@RestController
@RequestMapping("/gym/coach")
public class CoachController {
    //login
    @PostMapping("login")
    public R login(){
        System.out.println("登陆了");
        return R.ok().data("token","admin");
    }
    //info
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}

