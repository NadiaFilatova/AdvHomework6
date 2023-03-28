package task3;

import java.lang.annotation.*;

@Inherited
@Documented
@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String value() default "None";
int age () default 1;
}
