package com.shanghai.springboot.service;

public enum PersonType {
    JAVA("后台","java"),
    HTML("前台台" ,"html");
    private String desc;
    private String value;

    PersonType(String desc, String value) {
        this.desc = desc;
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {
        System.out.println(PersonType.HTML.desc);
        System.out.println(PersonType.HTML);
    }
}
