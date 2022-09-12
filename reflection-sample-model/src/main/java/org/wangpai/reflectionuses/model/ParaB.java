package org.wangpai.reflectionuses.model;

/**
 * 参数类 ParaB
 *
 * @since 2022-9-11
 */
public class ParaB {
    private String info;

    public ParaB() {
        super();
    }

    public ParaB(String str) {
        super();
        this.info = str;
    }

    @Override
    public String toString() {
        return this.info;
    }
}
