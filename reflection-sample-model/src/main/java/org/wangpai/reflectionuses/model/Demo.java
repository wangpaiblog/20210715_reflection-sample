package org.wangpai.reflectionuses.model;

/**
 * @since 2022-9-11
 */
public class Demo {
    private FieldA fieldA;

    private FieldB fieldB;

    /**
     * 无参构造器
     *
     * @since 2022-9-11
     */
    public Demo() {
        System.out.println("无参构造器 Demo() 被调用");
        System.out.println();
    }

    /**
     * 有参构造器
     *
     * @since 2022-9-11
     */
    public Demo(ParaA paraA, ParaB paraB) {
        System.out.println("构造器 Demo(ParaA paraA, ParaB paraB) 被调用");
        System.out.println("  > paraA：" + paraA);
        System.out.println("  > paraB：" + paraB);
        System.out.println();
        this.fieldA = new FieldA(paraA.toString());
        this.fieldB = new FieldB(paraB.toString());
    }

    /**
     * 公有静态方法
     *
     * @since 2022-9-11
     */
    public static void publicStaticFun(ParaA paraA, ParaB paraB) {
        System.out.println("公有静态方法 publicStaticFun(ParaA paraA, ParaB paraB) 被调用");
        System.out.println("  > paraA：" + paraA);
        System.out.println("  > paraB：" + paraB);
        System.out.println();
    }

    /**
     * 私有有静态方法
     *
     * @since 2022-9-11
     */
    private static void privateStaticFun(ParaA paraA, ParaB paraB) {
        System.out.println("私有有静态方法 privateStaticFun(ParaA paraA, ParaB paraB) 被调用");
        System.out.println("  > paraA：" + paraA);
        System.out.println("  > paraB：" + paraB);
        System.out.println();
    }

    /**
     * 公有非静态方法
     *
     * @since 2022-9-11
     */
    public void publicFun(ParaA paraA, ParaB paraB) {
        System.out.println("公有方法 publicFun(ParaA paraA, ParaB paraB) 被调用");
        System.out.println("  > paraA：" + paraA);
        System.out.println("  > paraB：" + paraB);
        System.out.println();
    }

    /**
     * 私有非静态方法
     *
     * @since 2022-9-11
     */
    private void privateFun(ParaA paraA, ParaB paraB) {
        System.out.println("私有方法 privateFun(ParaA paraA, ParaB paraB) 被调用");
        System.out.println("  > paraA：" + paraA);
        System.out.println("  > paraB：" + paraB);
        System.out.println();
    }

    /**
     * 公有非静态可变参方法（无前面的固定参数）
     *
     * @since 2022-9-11
     */
    public void publicVarParaFunWithNoFixedPara(ParaA... paraAS) {
        System.out.println("公有可变参方法（无前面的固定参数） publicVarParaFunWithNoFixedPara(ParaA... paraAS) 被调用");
        for (int order = 0; order < paraAS.length; ++order) {
            System.out.println(String.format("  > 可变参参数，第 %d 参数是：", order + 1) + paraAS[order]);
        }
        System.out.println();
    }

    /**
     * 公有非静态可变参方法（有前面的固定参数）
     *
     * @since 2022-9-11
     */
    public void publicVarParaFunWithFixedPara(ParaA paraA, ParaB... paraBs) {
        System.out.println("公有可变参方法（有前面的固定参数） publicVarParaFunWithFixedPara(ParaA paraA, ParaB... paraBs) 被调用");
        System.out.println("  > 固定参数 paraA：" + paraA);
        for (int order = 0; order < paraBs.length; ++order) {
            System.out.println(String.format("  > 可变参参数，第 %d 参数是：", order + 1) + paraBs[order]);
        }
        System.out.println();
    }

    /**
     * 私有非静态可变参方法（无前面的固定参数）
     *
     * @since 2022-9-11
     */
    private void privateVarParaFunWithNoFixedPara(ParaA... ParaAs) {
        System.out.println("私有可变参方法（无前面的固定参数） privateVarParaFunWithNoFixedPara(ParaA... ParaAs) 被调用");
        for (int order = 0; order < ParaAs.length; ++order) {
            System.out.println(String.format("  > 可变参参数，第 %d 参数：", order + 1) + ParaAs[order]);
        }
        System.out.println();
    }

    /**
     * 私有非静态可变参方法（有前面的固定参数）
     *
     * @since 2022-9-11
     */
    private void privateVarParaFunWithFixedPara(ParaA paraA, ParaB... paraBs) {
        System.out.println("私有可变参方法 privateVarParaFunWithFixedPara(ParaA paraA, ParaB... paraBs) 被调用");
        System.out.println("  > 固定参数 paraA：" + paraA);
        for (int order = 0; order < paraBs.length; ++order) {
            System.out.println(String.format("  > 可变参参数，第 %d 参数：", order + 1) + paraBs[order]);
        }
        System.out.println();
    }

    /**
     * @since 2023-8-13
     */
    public void showFields() {
        System.out.println("公有方法 showFields() 被调用");
        System.out.println("  > fieldA：" + this.fieldA);
        System.out.println("  > fieldB：" + this.fieldB);
        System.out.println();
    }
}
