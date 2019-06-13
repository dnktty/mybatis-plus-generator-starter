package com.netbee.mybatisplus.generator;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * mybatis plus代码生成器配置
 *
 * @author dongyang
 * @date 2019年06月12日 10:15
 */
@Data
@ConfigurationProperties("mybatisplus.generator")
public class CodeGeneratorProperties {

    /**
     * 创建人
     */
    private String author;

    /**
     * 父包名
     */
    private String packageName;

    /**
     * 实体名(默认model)
     * 这里设置后，实体的后缀名和实体的包名都为entityName
     */
    private String entityName = "model";

    /**
     * 模块名
     */
    private String moduleName;

    /**
     * 表名
     */
    private String tableNames;
}
