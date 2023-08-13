package org.wangpai.reflectionuses.model;

/**
 * 参数类 FieldB
 *
 * @since 2023-8-13
 */
public class FieldB {
    private String info;

    /**
     * @since 2023-8-13
     */
    public FieldB() {
        super();
    }

    /**
     * @since 2023-8-13
     */
    public FieldB(String str) {
        super();
        this.info = str;
    }

    /**
     * @since 2023-8-13
     */
    @Override
    public String toString() {
        return this.info;
    }
}
