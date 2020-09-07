package com.example.demo;

import com.example.demo.netty.Server;
import com.example.demo.netty.WebSocketInitializer;
import io.netty.channel.ChannelFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class NettyImApplication implements ApplicationRunner /*implements CommandLineRunner*/ {


  @Value("${netty.port}")
  private int port;

  @Autowired
  private Server server;

  @Resource
  private WebSocketInitializer webSocketInitializer;

  public static void main(String[] args) {
    SpringApplication.run(NettyImApplication.class, args);
  }

//  @Override
//  public void run(String... args) throws Exception {
//    ChannelFuture future = server.start(port, webSocketInitializer);
//    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//      server.destroy();
//    }));
//    future.channel().closeFuture().sync();
//  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    ChannelFuture future = server.start(port, webSocketInitializer);
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      server.destroy();
    }));
    future.channel().closeFuture().sync();
  }
}
