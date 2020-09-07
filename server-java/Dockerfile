### 基础镜像，使用alpine操作系统，openjkd使用8u201
FROM openjdk:8u201-jdk-alpine3.9
#作者
MAINTAINER cheng <1204598429@qq.com>
#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8
#应用构建成功后的jar文件被复制到镜像内，名字也改成了app.jar
ADD target/*.jar app.jar
#启动容器时的进程
ENTRYPOINT ["java","-jar","/app.jar"]
#暴露8899端口
EXPOSE 8899
