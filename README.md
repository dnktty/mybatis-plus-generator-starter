# 基于SpringBoot Starter和Mybatis-plus实现的代码生成器

### 背景

目前开发的项目中有用到mybatis-plus，但并没有代码生成器相关的工具，然后查看mybatis-plus官方文档发现其实是有代码生成器相关的功能[mybatis-plus代码生成器](https://mp.baomidou.com/guide/generator.html)，下载下来后发现并不那么好用，且与当前项目的代码规范有较大区别，于是基于SpringBoot starter对代码生成器进行了些改进，你可以通过简单的配置快速生成 Entity、Mapper、Mapper XML、Service、Controller 等各个模块的代码。

### 相关知识点

这里不做赘述，如果不了解可以先参考下面文章

- [SpringBoot中开发自己的Starter](https://note.abeffect.com/note/articles/2018/07/18/1531840432726.html)
- [mybatis-plus官方文档](https://mp.baomidou.com/)
- [mybatis-plus代码生成器](https://mp.baomidou.com/guide/generator.html)

### 如何使用

#### 1.引入依赖

``` java
<!--代码生成器依赖-->
<dependency>
    <groupId>com.netbee</groupId>
    <artifactId>mybatis-plus-generator-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### 2.配置

直接在application.properties中配置

``` properties
#创建人(其实就是类的作者名@author)
mybatisplus.generator.author=shammgodyoung
#模块名(会在父包名下创建这个名称 的子包)
mybatisplus.generator.module-name=test
#表名(大小写敏感,后期优化，该处是mybatis-plus官方问题，目前已经在github上pr等官方发布新版本)
mybatisplus.generator.table-names=WM_VEHICLE
#父包名
mybatisplus.generator.package-name=com.shammgodyoung
#实体后缀名(可选，默认model，如这里最终的生成的实体为:WmVehicleEntity)
mybatisplus.generator.entity-name=entity
```

#### 3.运行

直接在springBoot测试类中运行

``` java
@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicServerApplicationTest {

    @Autowired
    private CodeGenerator codeGenerator;

    @Test
    public void generator() {
        codeGenerator.generator();
    }
}
```

### 总结

通过阅读mybatis-plus源码会发现其实还是有很多地方可以优化的，可以自己尝试pr，这是一个自我提升的过程
