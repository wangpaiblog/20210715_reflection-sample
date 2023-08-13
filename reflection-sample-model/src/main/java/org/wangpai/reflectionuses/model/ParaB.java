package org.wangpai.reflectionuses.model;

/**
 * 参数类 ParaB
 *
 * @since 2022-9-11
 */
public class ParaB {
    private String info;

    /**
     * @since 2022-9-11
     */
    public ParaB() {
        super();
    }

    /**
     * @since 2022-9-11
     */
    public ParaB(String str) {
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
