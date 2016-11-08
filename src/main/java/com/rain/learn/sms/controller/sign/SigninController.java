package com.rain.learn.sms.controller.sign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rain.learn.sms.controller.BaseController;


@Controller
@RequestMapping(value = "/sign")
public class SigninController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(SigninController.class);

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String showLogin(ModelMap model) {
        logger.debug("request signin");
        return "/sign/signin";
    }
}