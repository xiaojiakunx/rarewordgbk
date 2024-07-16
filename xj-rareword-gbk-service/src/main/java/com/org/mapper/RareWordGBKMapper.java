package com.org.mapper;

import com.org.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: xj
 * @version: 2024/7/14
 * @description:
 */
@Mapper
public interface RareWordGBKMapper {
    public Integer saveUserTc(UserDTO userDTO);

}
