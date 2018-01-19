package com.xiaohe66.test.util.convert;

/**
 * @author xh
 * @date 2018-1-19
 */
public class Obj2 {

    private int integer;
    private String string;

    private String obj1NotHave;

    private long typeDifferent;

    public int getInteger() {
        return integer;
    }

    public String getString() {
        return string;
    }

    public String getObj1NotHave() {
        return obj1NotHave;
    }

    public long getTypeDifferent() {
        return typeDifferent;
    }

    @Override
    public String toString() {
        return "Obj2{" +
                "integer=" + integer +
                ", string='" + string + '\'' +
                ", obj1NotHave='" + obj1NotHave + '\'' +
                ", typeDifferent=" + typeDifferent +
                '}';
    }
}
