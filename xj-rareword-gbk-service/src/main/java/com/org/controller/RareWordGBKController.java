package com.org.controller;

import com.org.dto.UserDTO;
import com.org.dto.UserIdDTO;
import com.org.service.RareWordGBKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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


        String utf8Str = new String(userDTO.getName().getBytes("GBK"), StandardCharsets.UTF_8);

        System.out.println(userDTO.getName().toString());

        System.out.println("这是由GBK分支发起的合并请求，相当于正常分支要增量合并数据到生僻字分支");

        return rareWordGBKService.saveUserTc(userDTO);

    }

    @RequestMapping()
    public List<UserDTO> queryRareWord(@RequestBody UserIdDTO id){
        return rareWordGBKService.queryRareWord(id);

    }


}
