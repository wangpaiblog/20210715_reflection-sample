package org.wangpai.reflectionuses.test;

import java.lang.reflect.Array;
import org.junit.jupiter.api.Test;
import org.wangpai.reflectionuses.model.Demo;

/**
 * 反射创建数组
 *
 * @since 2022-9-11
 */
public class ReflectionArrayTest {
    /**
     * 反射创建数组
     *
     * @since 2022-9-11
     */
    @Test
    void createArrayWithReflection() {
        int arrayLength = 10;
        // 注意：这样创建之后，得到的是一个空有长度无内容的空数组，因此，后续使用该数组，还需要依次初始化该数组的各个元素
        Demo[] targetArray = (Demo[]) Array.newInstance(Demo[].class.getComponentType(), arrayLength);
    }
}
