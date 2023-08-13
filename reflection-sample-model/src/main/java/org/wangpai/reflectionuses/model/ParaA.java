package org.wangpai.reflectionuses.model;

/**
 * 参数类 ParaA
 *
 * @since 2022-9-11
 */
public class ParaA {
    private String info;

    /**
     * @since 2022-9-11
     */
    public ParaA() {
        super();
    }

    /**
     * @since 2022-9-11
     */
    public ParaA(String str) {
        super();
        this.info = str;
    }

    /**
     * @since 2022-9-11
     */
    @Override
    public String toString() {
        return this.info;
    }
}
