package com.org.service;

import com.org.dto.UserDTO;
import com.org.dto.UserIdDTO;
import com.org.mapper.RareWordGBKMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: xj
 * @version: 2024/7/14
 * @description:
 */
@Service
public class RareWordGBKServiceImpl implements RareWordGBKService{

    @Autowired
    RareWordGBKMapper rareWordGBKMapper;
    @Override
    public Integer saveUserTc(UserDTO userDTO) {
        return rareWordGBKMapper.saveUserTc(userDTO);
    }

    @Override
    public List<UserDTO> queryRareWord(UserIdDTO id) {

        System.out.println("这是utf8编码哦！");
        return rareWordGBKMapper.queryRareWord(id);    }
}
