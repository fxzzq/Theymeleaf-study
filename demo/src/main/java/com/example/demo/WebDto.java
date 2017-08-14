package com.example.demo;

/**
 * @author:xzq
 * @Descripition:
 * @Date: Created in 9:50 2017/8/14
 * @Modified:
 */
public class WebDto {
    private String name;
    private  String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebDto(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public WebDto() {
    }
}
