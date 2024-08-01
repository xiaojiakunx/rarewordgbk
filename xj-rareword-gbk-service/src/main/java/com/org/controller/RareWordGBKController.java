package com.org.controller;

import com.org.dto.UserDTO;
import com.org.dto.UserIdDTO;
import com.org.service.RareWordGBKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author: xj
 * @version: 2024/7/14
 * @description:
 */
@RestController
public class RareWordGBKController {

    @Autowired
    RareWordGBKService rareWordGBKService;

    @RequestMapping("rare/word")
    public Integer saveRareWordGbk(@RequestBody UserDTO userDTO) throws UnsupportedEncodingException {

        System.out.println(userDTO.getName());
        return rareWordGBKService.saveUserTc(userDTO);

    }
    @PostMapping("/controller")
    public String handlePostRequest(
            @RequestParam("data") String data) {
        // 打印接收到的参数
        System.out.println("Received data: " + data);
        // 响应客户端
        return "Received data: " + data;
    }


}
