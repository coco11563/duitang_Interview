package pub.sha0w.service;

import pub.sha0w.model.CommaArray;

import java.util.Arrays;

/**
 * Created by coco1 on 2017/2/16.
 */
public class CommaArrayService {
    public static int Service(Object object) {
        CommaArray commaArray = new CommaArray(object);
        int[] array = commaArray.getArray();
        if (array.length < 3) {
            return 0;
        } else if (array.length == 3) {
            return Product(array[0], array[1], array[2]);
        }
        int length = array.length - 1;
        Arrays.sort(array);
        int max = Product(array[length], array[length - 1], array[length - 2]);
        int min = Product(array[length],array[1], array[0]);
        int ret = 0;
        if (max > min) {
            ret = max;
        } else {
            ret = min;
        }
        if (ret > 0) {
            return ret;
        } else {
           if (haveZero(array)) return 0;
        }
        return ret;
    }

    private static int Product(int a, int b, int c) {
        return a * b * c;
    }

    private static boolean haveZero(int[] in) {
        for(int i : in) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }
}