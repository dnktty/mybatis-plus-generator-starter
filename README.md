# mybatis plus代码生成器使用

**说明：基于mybatis plus generator快速生成 Entity、Mapper、Mapper XML、Service、Controller 等各个模块的代码**

### 1.引入依赖

``` xml
<!--代码生成器依赖-->
<dependency>
    <groupId>com.netbee</groupId>
    <artifactId>mybatis-plus-generator-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### 2.配置

直接在application.properties中配置
``` properties
#创建人
mybatisplus.generator.author=dongyang
#模块名
mybatisplus.generator.module-name=wms
#表名(大小写敏感,后期优化)
mybatisplus.generator.table-names=WM_VEHICLE
#父包名
mybatisplus.generator.package-name=com.netbee
#实体后缀名(可选，默认model，如这里最终的生成的实体为:WmVehicleEntity)
mybatisplus.generator.entity-name=entity
```

### 3.运行

springBoot测试类中运行
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