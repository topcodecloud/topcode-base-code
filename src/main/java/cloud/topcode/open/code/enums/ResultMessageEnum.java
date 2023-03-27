package cloud.topcode.open.code.enums;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://topcode.cloud">topcode.cloud</a>
 */
public enum ResultMessageEnum {
    SYSTEM_ERROR("system error!"),
    SYSTEM_SUCCESS("well done!"),
    SYSTEM_OK("OK!");
    String value;

    ResultMessageEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}