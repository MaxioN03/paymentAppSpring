import com.netcracker.kutz.dao.dao.CardDao;
import com.netcracker.kutz.dao.entity.Card;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "META-INF/context.xml" })
public class CardTest {
    @Autowired
    private CardDao cardDao;

    @Test
    public void listCarsTest() {
        List<Card> cards = cardDao.getCards();
//      logger.info("Cars: " + cars.size());
        Assert.assertNotNull(cards);
        Assert.assertEquals(15, cards.size());
    }

}
