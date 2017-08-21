# spring-clound-sso
spring cloud单点登录demo

通过spring cloud搭建了一个sso的简单demo。项目分为四个子项目，
sso-main为服务注册，sso-common为统一登录部分，sso-a和sso-b分别模拟两个项目。
sso-a、sso-b分别有三个请求/login、/logout、/resource三个请求。
在请求resource资源时，如果未登录会提示请登录，在任何一个项目中访问了/login也就是登录了，则可以访问resource。
在a后者b项目中/logout了，则退出登录，再次访问/resource则依旧提示请登录。

a、b项目的端口号分别为8081、8082。

此demo的单点登录是使用cookie完成的，读者可根据自身需求通过获取Header中token信息对项目进行重构。
也没有对cookie进行redis缓存，感兴趣的可以在common项目中加上redis的缓存。

注意：项目启动时最好先启动main，然后再启动其他。
