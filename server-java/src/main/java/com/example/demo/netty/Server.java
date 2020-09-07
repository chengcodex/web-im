package com.example.demo.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author xiao
 * @date 9/7/2020 8:52 AM
 */
@Slf4j
@Component
public class Server {

  private  final EventLoopGroup bossGroup = new NioEventLoopGroup();
  private  final EventLoopGroup workerGroup = new NioEventLoopGroup();

  private Channel channel;

  public ChannelFuture start(int port, ChannelInitializer<SocketChannel> initializer) {
    ServerBootstrap serverBootstrap = new ServerBootstrap();
    serverBootstrap.group(bossGroup, workerGroup)
      .handler(new LoggingHandler(LogLevel.INFO))
      .channel(NioServerSocketChannel.class)
      .childHandler(initializer);
    ChannelFuture future = null;

    try{
      future = serverBootstrap.bind(port).sync();
      channel = future.channel();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return future;
  }

  public void destroy(){
    if(channel != null && channel.isOpen()){
      channel.close();
    }
    bossGroup.shutdownGracefully();
    workerGroup.shutdownGracefully();
    log.info("netty server shutdown");
  }

}
