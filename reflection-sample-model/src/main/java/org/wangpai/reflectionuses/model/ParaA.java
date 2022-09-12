package org.wangpai.reflectionuses.model;

/**
 * 参数类 ParaA
 *
 * @since 2022-9-11
 */
public class ParaA {
    private String info;

    public ParaA() {
        super();
    }

    public ParaA(String str) {
        super();
        this.info = str;
    }

    @Override
    public String toString() {
        return this.info;
    }
}
