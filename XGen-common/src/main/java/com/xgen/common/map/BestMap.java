package com.xgen.common.map;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 更易用的哈希映射，支持重复添加，批量映射
 * @param <k>
 * @param <v>
 */
public class BestMap<k,v> extends HashMap<k,v> {
    @Override
    public v put(k key, v value) {
        return super.put(key, value);
    }

    /**
     * 放入一组映射并且返回总的映射条数
     * @param key 关键字
     * @param value 值
     * @return 总数
     */
    public int addOne(k key, v value) {
        super.put(key, value);
        return super.size();
    }
    /**
     * 添加且返回该map对象
     * @param key 关键字
     * @param value 值
     * @return BestMap
     */
    public BestMap<k,v> coiledPut(k key,v value){
        super.put(key,value);
        return this;
    }

    /**
     * 批量映射
     * @param value 映射值
     * @param keys 关键字
     * @return BestMap
     */
    @SuppressWarnings("unchecked")
    public BestMap<k,v> batchPut(v value, k... keys){
        Arrays.stream(keys).forEach(x->super.put(x,value));
        return this;
    }
}
