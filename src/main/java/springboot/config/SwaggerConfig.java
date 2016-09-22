package springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableSwagger
@EnableAutoConfiguration
public class SwaggerConfig {

	private SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }


    public SwaggerSpringMvcPlugin customImplementation(){
        return  new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(new ApiInfo("restfule API", "用户相关操作", "1.0.0", "wqinduo@qq.com", null, null))
                /*.useDefaultResponseMessages(false)*/
                .includePatterns("/users.*");
    }
}
