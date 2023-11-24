# 封装redis-start的步骤
 1、创建redis-springboot-autoconfigure 模块
 2、创建redis-springb-boot-starter模块，依赖redis-springboot-autoconfigure的模块。
 3、在redis-springboot-autoconfigure模块中初始化Jedis的bean。并定义META-INF/spring.factories文件
 4、在测试模块中引入自定义的redis-starter依赖，测试Jedis的Bean，操作Redis。

