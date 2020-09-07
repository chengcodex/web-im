package com.example.demo.netty.model;

import lombok.Data;

import java.util.List;

/**
 * @author xiao
 * @date 9/7/2020 9:13 AM
 */
// 响应需要的字段
@Data
public class RespModel {

  // 对应RespType
  private int type;
  // 日期数据
  private String date;

  // 用户相关
  private String uid;
  private String nickname;
  private int status;
  // 联系人和群组列表
  private List<UserModel> users;
  private List<GroupModel> groups;
  private String groupId;
  // 消息相关
  private String msg;
  private List<String> bridge;
}
