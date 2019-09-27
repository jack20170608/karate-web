package com.fangming.eip.karate.config;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class KarateReportResourcesConfig implements WebMvcConfigurer {

    private final Logger logger = LoggerFactory.getLogger(KarateReportResourcesConfig.class);

    private final String reportFileHome;
    private final String reportContextPath;

    @Autowired
    public KarateReportResourcesConfig(@Value("${karate-web.report.home}") String reportFileHome
            , @Value("${karate-web.report.context-path:report}") String reportContextPath) {
        if (StringUtils.startsWith(reportContextPath, "/")){
            throw new IllegalArgumentException("Karate report context path should not start with any /");
        }
        if (!StringUtils.endsWith(reportFileHome, File.separator)){
            throw new IllegalArgumentException("Karate report file home is a directory, should end with a File separator " + File.separator);
        }
        this.reportFileHome = reportFileHome;
        this.reportContextPath = reportContextPath;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler(reportContextPath + "/**")
                .addResourceLocations("file:" + reportFileHome);
    }
}//:~)
