import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import pub.sha0w.model.CommaArray;
import pub.sha0w.service.CommaArrayService;

/**
 * Created by coco1 on 2017/2/16.
 */
public class ServiceTest {
    private final Logger logger = Logger.getLogger(ServiceTest.class);

    @Before
    public void init() {
    }

    @Test
    public void normalTest() {
        System.out.println(CommaArrayService.Service("1,2,3,4,5,0,-10,-9,4"));
        System.out.println(CommaArrayService.Service("1,3,5,4,-10,1,2,0"));
        System.out.println(CommaArrayService.Service("-1,0,-2,-3,-4"));
        System.out.println(CommaArrayService.Service("1,2,3"));
        System.out.println(CommaArrayService.Service("1,2"));
        System.out.println(CommaArrayService.Service("w,2,3,421,ad,f"));
    }
}
