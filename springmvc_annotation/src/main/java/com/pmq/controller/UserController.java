package com.pmq.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.pmq.po.User;
import com.pmq.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * Spring MVC重定向和转发
	 * Spring MVC 请求方式分为转发、重定向 2 种，分别使用 forward 和 redirect 关键字在 controller 层进行处理。
	 * 1）转发过程
	 *	客户浏览器发送 http 请求，Web 服务器接受此请求，调用内部的一个方法在容器内部完成请求处理和转发动作，将目标资源发送给客户；在这里转发的路径必须是同一个 Web 容器下的 URL，其不能转向到其他的 Web 路径上，中间传递的是自己的容器内的 request。
	 *  在客户浏览器的地址栏中显示的仍然是其第一次访问的路径，也就是说客户是感觉不到服务器做了转发的。转发行为是浏览器只做了一次访问请求。
	 *  return "forward:/index/isLogin";
	 * 2）重定向过程
	 *  客户浏览器发送 http 请求，Web 服务器接受后发送 302 状态码响应及对应新的 location 给客户浏览器，客户浏览器发现是 302 响应，则自动再发送一个新的 http 请求，请求 URL 是新的 location 地址，服务器根据此请求寻找资源并发送给客户。
	 * return "redirect:/index/isRegister";
	 */
	/**
	 * Spring MVC Controller 接收请求参数的方式
	 * 1. 通过实体 Bean 接收请求参数 public String login(User user, Model model)
	 * 2. 通过处理方法的形参接收请求参数 public String login(String name, String pwd, Model model)
	 * 3. 通过HttpServletRequest接收请求参数 public String login(HttpServletRequest request, Model model) { String name = request.getParameter("name");
	 * 4. 通过@PathVariable接收URL中的请求参数 @RequestMapping("/login/{name}/{pwd}") public String login(@PathVariable String name, @PathVariable String pwd, Model model)
	 * 5. 通过@RequestParam接收请求参数 public String login(@RequestParam String name, @RequestParam String pwd, Model model)
	 * 6. 通过@ModelAttribute接收请求参数 public String login(@ModelAttribute("user") User user, Model model)
	 */
	/**
	 * Spring MVC @ModelAttribute注解
	 * 1. 应用在方法上 无返回值 model.addAttribute("name", name); 有返回值 @ModelAttribute("name")
	 * 2. 应用在方法的参数上 public String register(@ModelAttribute("user") UserForm user) {
	 * 3. ModelAttribute+RequestMapping @RequestMapping(value = "/index")
     *									@ModelAttribute("name")
     *									public String model(@RequestParam(required = false) String name) {
	 */
	
	@RequestMapping("/login")
    public String getLogin(Model model) {
		User us = new User();
        us.setName("pmq");
        userService.login(us);
        model.addAttribute("user", us);
        return "login";
    }
    @RequestMapping("/register")
    public String getRegister(Model model) {
    	User us = new User();
        us.setName("pmq");
        userService.login(us);
        model.addAttribute("user", us);
        return "register";
    }
    @RequestMapping("/addUser")
    public String addUser() {
        return "addUser";
    }
    @RequestMapping("/addUserFormatter")
    public String addUserFormatter() {
        return "addUserFormatter";
    }


}
