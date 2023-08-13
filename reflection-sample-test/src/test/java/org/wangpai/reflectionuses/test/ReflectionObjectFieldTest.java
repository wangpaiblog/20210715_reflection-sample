package org.wangpai.reflectionuses.test;

import java.lang.reflect.Field;
import org.junit.jupiter.api.Test;
import org.wangpai.reflectionuses.model.Demo;
import org.wangpai.reflectionuses.model.FieldA;
import org.wangpai.reflectionuses.model.FieldB;
import org.wangpai.reflectionuses.model.ParaA;
import org.wangpai.reflectionuses.model.ParaB;

/**
 * 反射访问、注入字段
 *
 * @since 2023-8-13
 */
public class ReflectionObjectFieldTest {
    /**
     * 反射访问字段
     *
     * @since 2023-8-13
     */
    @Test
    void getObjectFieldWithReflection() throws NoSuchFieldException, IllegalAccessException {
        ParaA paraA = new ParaA("这是 ParaA");
        ParaB paraB = new ParaB("这是 ParaB");
        Demo demo = new Demo(paraA, paraB);

        // ------- 访问 fieldA ----------
        Field fA = demo.getClass().getDeclaredField("fieldA");
        fA.setAccessible(true); // 设置允许反射读写私有字段
        FieldA fieldA = (FieldA) fA.get(demo);
        System.out.println("fieldA：" + fieldA);
        // ----------------------------

        // ------- 访问 fieldB ----------
        Field fB = demo.getClass().getDeclaredField("fieldB");
        fB.setAccessible(true); // 设置允许反射读写私有字段
        FieldB fieldB = (FieldB) fB.get(demo);
        System.out.println("fieldB：" + fieldB);
        // ----------------------------
    }

    /**
     * 反射修改字段值
     *
     * @since 2023-8-13
     */
    @Test
    void setObjectFieldWithReflection() throws NoSuchFieldException, IllegalAccessException {
        ParaA paraA1 = new ParaA("这是 ParaA1");
        ParaB paraB1 = new ParaB("这是 ParaB1");
        Demo demo = new Demo(paraA1, paraB1);
        FieldA fieldA2 = new FieldA("这是 FieldA2");
        FieldB fieldB2 = new FieldB("这是 FieldB2");

        // ------- 修改 fieldA ----------
        Field fA = demo.getClass().getDeclaredField("fieldA");
        fA.setAccessible(true); // 设置允许反射读写私有字段
        fA.set(demo, fieldA2);
        demo.showFields();
        // ----------------------------

        // ------- 修改 fieldB ----------
        Field fB = demo.getClass().getDeclaredField("fieldB");
        fB.setAccessible(true); // 设置允许反射读写私有字段
        fB.set(demo, fieldB2);
        demo.showFields();
        // ----------------------------
    }
}
