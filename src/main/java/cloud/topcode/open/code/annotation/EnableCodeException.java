package cloud.topcode.open.code.annotation;

import cloud.topcode.open.code.config.CodeExceptionAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://topcode.cloud">topcode.cloud</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(CodeExceptionAutoConfiguration.class)
@Documented
@Inherited
public @interface EnableCodeException {
}