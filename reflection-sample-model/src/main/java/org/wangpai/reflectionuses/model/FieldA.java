package org.wangpai.reflectionuses.model;

/**
 * 参数类 FieldA
 *
 * @since 2023-8-13
 */
public class FieldA {
    private String info;

    /**
     * @since 2023-8-13
     */
    public FieldA() {
        super();
    }

    /**
     * @since 2023-8-13
     */
    public FieldA(String str) {
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
