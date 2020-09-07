package com.example.demo.netty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xiao
 * @date 9/7/2020 9:11 AM
 */
@Data @AllArgsConstructor @NoArgsConstructor
public class GroupModel {
  private String id;
  private String name;
  private List<UserModel> users;
}
