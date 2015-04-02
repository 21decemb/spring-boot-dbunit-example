package ricardo.kwon;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import ricardo.kwon.entity.StaticResource;
import ricardo.kwon.service.StaticResourceService;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HsqldbexampleApplication.class)
@ActiveProfiles("local")
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@DatabaseSetup("/META-INF/dbtest/sampleData.xml")
public class HsqldbexampleApplicationTests {

    @Autowired
    StaticResourceService staticResourceService;

    @Test
    public void contextLoads() {
        List<StaticResource> all = staticResourceService.findAll();
        assertThat(all, is(notNullValue()));
        assertThat(all.size(), is(4));
    }
}
