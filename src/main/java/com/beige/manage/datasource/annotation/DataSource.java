
package com.beige.manage.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author Big Hero
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}
