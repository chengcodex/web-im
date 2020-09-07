package com.example.demo.netty.enums;

import lombok.Getter;

/**
 * @author xiao
 * @date 9/7/2020 9:09 AM
 */
@Getter
public enum RespType {

  OPERA(1,"操作类处理"),
  MSG(2,"消息类处理")
  ;

  private final int num;
  private final String desc;

  RespType(int num, String desc) {
    this.num = num;
    this.desc = desc;
  }
}
