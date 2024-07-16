package com.org.controller;

import com.org.dto.UserDTO;
import com.org.service.RareWordGBKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

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
        return rareWordGBKService.saveUserTc(userDTO);

    }


}
