package com.netbee.mybatisplus.generator;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dongyang
 * @date 2019年06月12日 10:18
 */
@Configuration
@ConditionalOnClass(CodeGenerator.class)
@EnableConfigurationProperties({CodeGeneratorProperties.class, DataSourceProperties.class})
public class CodeGeneratorAutoConfigure {
    @Bean
    @ConditionalOnMissingBean
    public CodeGenerator codeGenerator() {
        return new CodeGenerator();
    }
}
