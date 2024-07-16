package com.org.mapper;

import com.org.dto.UserDTO;
import com.org.dto.UserIdDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: xj
 * @version: 2024/7/14
 * @description:
 */
@Mapper
public interface RareWordGBKMapper {
    public Integer saveUserTc(UserDTO userDTO);

    List<UserDTO> queryRareWord(UserIdDTO id);
}
