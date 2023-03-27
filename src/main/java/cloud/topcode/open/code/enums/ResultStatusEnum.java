package cloud.topcode.open.code.enums;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://topcode.cloud">topcode.cloud</a>
 */
public enum ResultStatusEnum {
    SUCCESS(0),
    FAIL(1);
    private int code;

    ResultStatusEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name();
    }
}
