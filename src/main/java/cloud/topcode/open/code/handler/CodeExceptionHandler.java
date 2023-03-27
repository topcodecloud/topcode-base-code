package cloud.topcode.open.code.handler;

import cloud.topcode.open.code.CodeException;
import cloud.topcode.open.code.CodeResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://topcode.cloud">topcode.cloud</a>
 */
@Slf4j
@RestControllerAdvice
public class CodeExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public CodeResult handleIllegalArgumentException(IllegalArgumentException e) {
        log.error("Error is:{}, Error Info:{}", "Params error.", e.getLocalizedMessage());
        return CodeResult.error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "Params error.", e.getLocalizedMessage());
    }

    @ExceptionHandler(SecurityException.class)
    public CodeResult handleSecurityException(SecurityException e) {
        log.error("Error is:{}, Error Info:{}", "No access allowed.", e.getLocalizedMessage());
        return CodeResult.error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "No access allowed.", e.getLocalizedMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    public CodeResult handleNullPointerException(NullPointerException e) {
        log.error("Error is:{}, Error Info:{}", "Null pointer exception.", e.getLocalizedMessage());
        return CodeResult.error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "Null pointer exception.", e.getLocalizedMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public CodeResult handlerNoFoundException(NoHandlerFoundException e) {
        log.error("Error is:{}，Error Info:{}", "NOT FOUND.", e.getLocalizedMessage());
        return CodeResult.error(HttpStatus.SC_NOT_FOUND, "Corresponding resource not found.", e.getLocalizedMessage());
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public CodeResult handlerHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        log.error("Error is:{}, Error Info:{}", "Request type is not supported.", e.getLocalizedMessage());
        return CodeResult.error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "Request type is not supported. ", e.getLocalizedMessage());
    }

    @ExceptionHandler(CodeException.class)
    public CodeResult handleCodeException(CodeException e) {
        log.error("Error is:{}, Error Info:{}", e.getLocalizedMessage(), e.getErrorInfo());
        return CodeResult.error(e.getCode(), e.getLocalizedMessage(), e.getErrorInfo());
    }

    @ExceptionHandler(RuntimeException.class)
    public CodeResult handleRuntimeException(RuntimeException e) {
        log.error("Error is:{}, Error Info:{}", "RuntimeException.", e.getLocalizedMessage());
        return CodeResult.error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "error.", e.getLocalizedMessage());
    }

    @ExceptionHandler(Exception.class)
    public CodeResult handleException(Exception e) {
        log.error("Error is:{}, Error Info:{}", "Error.", e.getLocalizedMessage());
        return CodeResult.error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "error", e.getLocalizedMessage());
    }
}