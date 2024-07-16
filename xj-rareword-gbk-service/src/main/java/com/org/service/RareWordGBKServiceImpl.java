package com.org.service;

import com.org.dto.UserDTO;
import com.org.mapper.RareWordGBKMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
