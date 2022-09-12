package org.wangpai.reflectionuses.test;

import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;
import org.wangpai.reflectionuses.model.Demo;
import org.wangpai.reflectionuses.model.ParaA;
import org.wangpai.reflectionuses.model.ParaB;

/**
 * 反射调用方法
 *
 * @since 2022-9-11
 */
public class ReflectionMethodTest {
    /**
     * 反射调用公有静态方法
     *
     * @since 2022-9-11
     */
    @Test
    void callPublicStaticMethodWithReflection() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        ParaA paraA = new ParaA("这是 ParaA");
        ParaB paraB = new ParaB("这是 ParaB");
        Demo.class.getMethod("publicStaticFun", ParaA.class, ParaB.class)
                .invoke(null, paraA, paraB);
    }

    /**
     * 反射调用私有静态方法
     *
     * @since 2022-9-11
     */
    @Test
    void callPrivateStaticMethodWithReflection() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        ParaA paraA = new ParaA("这是 ParaA");
        ParaB paraB = new ParaB("这是 ParaB");
        var privateFun = Demo.class.getDeclaredMethod("privateStaticFun", ParaA.class, ParaB.class);
        privateFun.setAccessible(true); // 如果此处的类本来就有权限调用用反射调用的方法，则此行代码可以省略
        privateFun.invoke(null, paraA, paraB);
    }


    /**
     * 反射调用公有非静态方法
     *
     * @since 2022-9-11
     */
    @Test
    void callPublicMethodWithReflection() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Demo demo = new Demo();
        ParaA paraA = new ParaA("这是 ParaA");
        ParaB paraB = new ParaB("这是 ParaB");
        Demo.class.getMethod("publicFun", ParaA.class, ParaB.class)
                .invoke(demo, paraA, paraB);
    }

    /**
     * 反射调用私有非静态方法
     *
     * @since 2022-9-11
     */
    @Test
    void callPrivateMethodWithReflection() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Demo demo = new Demo();
        ParaA paraA = new ParaA("这是 ParaA");
        ParaB paraB = new ParaB("这是 ParaB");
        var privateFun = Demo.class.getDeclaredMethod("privateFun", ParaA.class, ParaB.class);
        privateFun.setAccessible(true); // 如果此处的类本来就有权限调用用反射调用的方法，则此行代码可以省略
        privateFun.invoke(demo, paraA, paraB);
    }

    /**
     * 反射调用公有非静态可变参方法（无前面的固定参数）
     *
     * @since 2022-9-11
     */
    @Test
    void callPublicNoFixedVarParaMethodWithReflection() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Demo demo = new Demo();
        ParaA paraAOne = new ParaA("这是第一个 ParaA");
        ParaA paraATwo = new ParaA("这是第二个 ParaA");
        ParaA[] paraAs = new ParaA[]{paraAOne, paraATwo};
        /**
         * 虽然 paraAs 已经是数组，但此处还是要将可变参数组再封装到一个数组中。
         * 不过，如果固定参数存在时，可以不用再外加数组，改为直接将各个元素列出。
         * 此处因为固定参数不存在，所以需再套一层数组
         */
        Demo.class.getMethod("publicVarParaFunWithNoFixedPara", ParaA[].class)
                .invoke(demo, new Object[]{paraAs});
    }

    /**
     * 反射调用私有非静态可变参方法（有前面的固定参数）
     *
     * @since 2022-9-11
     */
    @Test
    void callPublicFixedVarParaMethodWithReflection() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Demo demo = new Demo();
        ParaA paraA = new ParaA("这是 ParaA");
        ParaB paraBOne = new ParaB("这是第一个 ParaB");
        ParaB paraBTwo = new ParaB("这是第二个 ParaB");
        ParaB[] paraBs = new ParaB[]{paraBOne, paraBTwo};
        Demo.class.getDeclaredMethod("publicVarParaFunWithFixedPara", ParaA.class, ParaB[].class)
                .invoke(demo, paraA, paraBs); // 因为固定参数有 1 个及以上，所以此处可以不用数组来包装
    }

    /**
     * 反射调用私有非静态可变参方法（无前面的固定参数）
     *
     * @since 2022-9-11
     */
    @Test
    void callPrivateNoFixedVarParaMethodWithReflection() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Demo demo = new Demo();
        ParaA paraAOne = new ParaA("这是第一个 ParaA");
        ParaA paraATwo = new ParaA("这是第二个 ParaA");
        ParaA[] paraAs = new ParaA[]{paraAOne, paraATwo};
        var privateFun = Demo.class.getDeclaredMethod(
                "privateVarParaFunWithNoFixedPara", ParaA[].class);
        privateFun.setAccessible(true);
        /**
         * 虽然 paraAs 已经是数组，但此处还是要将可变参数组再封装到一个数组中。
         * 不过，如果固定参数存在时，可以不用再外加数组，改为直接将各个元素列出。
         * 此处因为固定参数不存在，所以需再套一层数组
         */
        privateFun.invoke(demo, new Object[]{paraAs});
    }

    /**
     * 反射调用私有非静态可变参方法（有前面的固定参数）
     *
     * @since 2022-9-11
     */
    @Test
    void callPrivateFixedVarParaMethodWithReflection() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Demo demo = new Demo();
        ParaA paraA = new ParaA("这是 ParaA");
        ParaB paraBOne = new ParaB("这是第一个 ParaB");
        ParaB paraBTwo = new ParaB("这是第二个 ParaB");
        ParaB[] paraBs = new ParaB[]{paraBOne, paraBTwo};
        var privateFun = Demo.class.getDeclaredMethod(
                "privateVarParaFunWithFixedPara", ParaA.class, ParaB[].class);
        privateFun.setAccessible(true);
        // 因为固定参数有 1 个及以上，所以此处可以不用数组来包装
        privateFun.invoke(demo, paraA, paraBs);
    }
}
