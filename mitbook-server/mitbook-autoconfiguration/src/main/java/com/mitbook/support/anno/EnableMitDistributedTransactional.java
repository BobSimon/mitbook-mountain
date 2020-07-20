package com.mitbook.support.anno;

import com.mitbook.support.marker.GlobalServerMarkerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 开启自定义的aop功能
 *
 * @author pengzhengfa
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(GlobalServerMarkerConfiguration.class)
public @interface EnableMitDistributedTransactional {

}
