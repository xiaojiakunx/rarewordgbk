package com.org.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

/**
 * @author: xj
 * @version: 2024/8/2
 * @description:
 */
public class MainController {

    public static void main(String[] args) {

        // 修正URL，移除末尾的单引号
        String url = "http://192.168.1.209:1014/rare/word";
        RestTemplate restTemplate = new RestTemplate();
        // 创建请求头
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");

        // 创建请求体
        String dataStr = "{\"id\": \"99\", \"name\": \"杨天翔\", \"yearold\": 18, \"opcode\": \"10140814\"}";
        byte[] dataBytes = dataStr.getBytes(Charset.forName("UTF-8"));

        // 创建HttpEntity，包含请求头和请求体
        HttpEntity<byte[]> requestEntity = new HttpEntity<>(dataBytes, headers);

        // 发送POST请求并接收响应
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                String.class
        );
        // 打印响应文本
        System.out.println(response.getBody());



    }


}
