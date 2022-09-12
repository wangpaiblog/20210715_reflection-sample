package org.wangpai.reflectionuses.test;

import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;
import org.wangpai.reflectionuses.model.Demo;
import org.wangpai.reflectionuses.model.ParaA;
import org.wangpai.reflectionuses.model.ParaB;

/**
 * 反射创建对象
 *
 * @since 2022-9-11
 */
public class ReflectionObjectTest {
    /**
     * 反射创建对象
     *
     * @since 2022-9-11
     */
    @Test
    void createObjectWithReflection() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        ParaA paraA = new ParaA("这是 ParaA");
        ParaB paraB = new ParaB("这是 ParaB");
        Demo demo = Demo.class
                .getConstructor(ParaA.class, ParaB.class)
                .newInstance(paraA, paraB);
    }
}
