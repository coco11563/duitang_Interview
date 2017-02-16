import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import pub.sha0w.model.CommaArray;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by coco1 on 2017/2/16.
 * 10:13通过测试
 * 默认返回值为0
 */
public class ModelTest {
    private CommaArray commaArray;
    private CommaArray commaArray_1;
    private CommaArray commaArray_2;
    private final Logger logger = Logger.getLogger(ModelTest.class);

    @Before
    public void init() {
        commaArray = new CommaArray("1,2,4,5,22,44,5,2");
        commaArray_1 = new CommaArray(" ");
        commaArray_2 = new CommaArray("南京李志");
    }

    @Test
    public void normalTest() {
        for (int i : commaArray.getArray()) {
            System.out.println(i);
        }
        for (int i : commaArray_1.getArray()) {
            System.out.println(i);
        }
        for (int i : commaArray_2.getArray()) {
            System.out.println(i);
        }
    }
}
