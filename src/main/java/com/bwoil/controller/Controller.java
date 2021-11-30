package com.bwoil.controller;

import com.bwoil.entity.UserDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
public class Controller {

    @GetMapping("/info")
    public String testInfo(){
        return "20211130";
    }

    @ApiOperation(value = "新增用户")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK", response = UserDto.class) })
    @PostMapping("/user")
    public UserDto addUser(@RequestBody AddUserParam param) {
        System.err.println(param.getName());
        return new UserDto();
    }


}
