# spring-boot-getting-started
![Spring Boot](https://spring.io/img/homepage/icon-spring-boot.svg)

## 系统要求

- Java 1.8 以上
- `Spring Boot` 版本号：`1.5.9.RELEASE`
- 构建工具：`maven` 或 `gradle`（因为项目中已经包含了 `mvnw` 和 `gradlew` ，所以 `maven` 和 `gradle` 不是必要的）
- `Lombok` IDE 插件

## 目录

- 入门  [博客](https://blog.csdn.net/github_39939645/article/details/86583893) [代码](https://github.com/heyuxian/spring-boot-getting-started/tree/master/gradle/demo01)
  - `Spring Boot` 简介 
  - 开发第一个 `Spring Boot` 应用
- 使用 `Spring Boot` 
  - 构建系统  [博客](https://blog.csdn.net/github_39939645/article/details/86602347)   [源码(maven)](https://github.com/heyuxian/spring-boot-getting-started/tree/master/maven/demo02)   [源码(gradle)](https://github.com/heyuxian/spring-boot-getting-started/tree/master/gradle/demo02)
  - 配置
  - `Spring Bean`
  - 打包和运行 `Spring Boot` 程序
- `Spring Boot` 的功能
  - `SpringApplication`
  - `Spring Boot` 属性配置
  - `Profiles`
  - 日志
  - `JSON`
  - 开发 Web 应用程序
  - 安全
  - 数据库（SQL）
  - 数据库（NoSQL）
  - 缓存
  - 消息
  - 调用 REST 服务
  - Validation
  - 邮件
  - JTA 分布式事物
  - 分布式缓存 - `Hazelcast`
  - 定时任务
  - 任务执行及调度
  - `Spring Session`
  - JMX 的监控及管理
  - 测试
  - `WebSockets`
  - Web Services 及 `WebServiceTemplate` 
  - 创建自己的 `Spring Boot Stater`
- `Spring Boot Actuator`

## 如何运行

**克隆项目到本地**

```shell
git clone https://github.com/heyuxian/spring-boot-getting-started.git
```

**构建工具**

此项目将同时支持 `Maven` 及 `Gradle` 作为构建工具，你可以根据自己的喜好，选择相应的构建工具，并进入对应的 demo 中，如：

```shell
cd ./maven/demo02
```

**编译项目**

```shell
#maven
./mvnw clean install
#gradle
./gradlew build
```

**运行**

```shell
#maven
java -jar ./target/demo02-0.0.1-SNAPSHOT.jar
#gradle
java -jar ./build/libs/demo01-0.0.1-SNAPSHOT.jar
```

你还可以直接通过 `Spring Boot` 插件运行：

```shell
#maven
./mvnw spring-boot:run
#gradle
./gradlew bootRun
```

## 源码

[GitHub](https://github.com/heyuxian/spring-boot-getting-started)

## 相关文档

[Docs4dev](https://www.docs4dev.com/)

## 源码

[GitHub](https://github.com/heyuxian/spring-boot-getting-started)

## 相关文档

[Docs4dev](https://www.docs4dev.com/)