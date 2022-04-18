package com.example.cameratest;

public class MainData {

    private int iv_profile;
    private String tv_list1;
    private String tv_list2;

    public MainData(int iv_profile, String tv_list1, String tv_list2) {
        this.iv_profile = iv_profile;
        this.tv_list1 = tv_list1;
        this.tv_list2 = tv_list2;
    }

    public int getIv_profile() {
        return iv_profile;
    }

    public void setIv_profile(int iv_profile) {
        this.iv_profile = iv_profile;
    }

    public String getTv_list1() {
        return tv_list1;
    }

    public void setTv_list1(String tv_list1) {
        this.tv_list1 = tv_list1;
    }

    public String getTv_list2() {
        return tv_list2;
    }

    public void setTv_list2(String tv_list2) {
        this.tv_list2 = tv_list2;
    }
}
