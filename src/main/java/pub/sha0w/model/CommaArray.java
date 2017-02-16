package pub.sha0w.model;

import pub.sha0w.util.CastUtil;

/**
 * Created by coco1 on 2017/2/16.
 * 一个简单的数组model
 */
public class CommaArray {
    private int[] stor;
    public CommaArray(Object object) {
        String[] strArray = CastUtil.castString(object).split(",");
        stor = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            String str = strArray[i];
            stor[i] = CastUtil.castInt(str);
        }
    }
    public int[] getArray() {
        return this.stor;
    }
}
