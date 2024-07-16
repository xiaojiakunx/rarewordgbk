package com.org.service;

import com.org.dto.UserDTO;
import com.org.dto.UserIdDTO;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.List;

/**
 * @author: xj
 * @version: 2024/7/14
 * @description:
 */
public interface RareWordGBKService {
    Integer saveUserTc(UserDTO userDTO);

    List<UserDTO> queryRareWord(UserIdDTO id);
}
