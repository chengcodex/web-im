package com.example.demo.netty.service;

import com.example.demo.netty.model.ReqModel;
import com.example.demo.netty.model.RespModel;
import org.springframework.stereotype.Service;

/**
 * @author xiao
 * @date 9/7/2020 9:10 AM
 */
@Service
public interface ChatService {

  void addUser(ReqModel reqModel, RespModel respModel);

  void delUser(ReqModel reqModel, RespModel respModel);

  void addGroup(ReqModel reqModel, RespModel respModel);

  void joinGroup(ReqModel reqModel, RespModel respModel);

  void sendGroupMsg(ReqModel reqModel, RespModel respModel);

  void sendPrivateMsg(ReqModel reqModel, RespModel respModel);
}
