package task2;

import java.lang.annotation.*;

/**
 * Annotation which represents calculator operation
 *
 * @author Nadia
 * @version 1.0
 * @since 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CalculatorOperation {
    /**
     * First operation parameter
     *
     * @return first operation parameter
     */
    double num1() default 0;

    /**
     * Second operation parameter
     *
     * @return second operation parameter
     */
    double num2() default 0;


}

