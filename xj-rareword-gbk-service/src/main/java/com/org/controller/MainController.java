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

        System.out.println("�ַ�����"+Charset.defaultCharset());

        // ����URL���Ƴ�ĩβ�ĵ�����
        String url = "http://192.168.1.209:8014/rare/word";
        RestTemplate restTemplate = new RestTemplate();
        // ��������ͷ
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=GBK");

        // ����������
        String dataStr = "{\"id\": \"65\", \"name\": \"������\", \"yearold\": 18, \"opcode\": \"10140814\"}";
        byte[] dataBytes = dataStr.getBytes(Charset.forName("GBK"));

        // ����HttpEntity����������ͷ��������
        HttpEntity<byte[]> requestEntity = new HttpEntity<>(dataBytes, headers);

        // ����POST���󲢽�����Ӧ
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                String.class
        );
        // ��ӡ��Ӧ�ı�
        System.out.println(response.getBody());
    }


}
