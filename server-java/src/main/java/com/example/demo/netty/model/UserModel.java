package com.example.demo.netty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiao
 * @date 9/7/2020 9:12 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

  private String uid;
  private String nickname;
  // 状态  1 在线  0 离线
  private int status;

  public UserModel(String uid, String nickname) {
    this.uid = uid;
    this.nickname = nickname;
  }
}
