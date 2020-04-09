## spring-cloud-starter-netflix-zuul
#### 最简教程
##### 1. 添加注解
    @EnableZuulProxy
##### 2. 添加路由配置
    zuul.routes.user.path=/user/**
    zuul.routes.user.url=http://localhost:8000/user
###### 即可完成一个最简单的网关
--
##### 四种过滤器类型
- pre
- route
- post
- error