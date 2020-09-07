package com.example.demo.netty.enums;

import lombok.Getter;

/**
 * @author xiao
 * @date 9/7/2020 9:05 AM
 */
@Getter
public enum ReqType {
  CONN(1, "建立连接"),
  CANCEL(2, "断开连接"),
  ADD_GROUP(10, "创建群组"),
  JOIN_GROUP(20, "加入群组"),
  SEND_MSG(100, "发送消息"),
  ;
  private final int num;

  private final String desc;

  ReqType(int num, String desc) {
    this.num = num;
    this.desc = desc;
  }

  public static ReqType getTypeByNum(int num) {
    for (ReqType value : ReqType.values()) {
      if (value.num == num) {
        return value;
      }
    }
    return CONN;
  }
}
