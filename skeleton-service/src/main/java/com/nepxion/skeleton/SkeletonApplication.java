package com.nepxion.skeleton;

/**
 * <p>Title: Nepxion Skeleton</p>
 * <p>Description: Nepxion Skeleton For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ com.nepxion.skeleton.framework.config.SkeletonFrameworkConfig.class })
public class SkeletonApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SkeletonApplication.class).web(true).run(args);
    }
}