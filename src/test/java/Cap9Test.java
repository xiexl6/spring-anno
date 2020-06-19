import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.enjoy.cap7.config.Cap7MainConfigOfLifeCycle;
import com.enjoy.cap8.bean.Bird;
import com.enjoy.cap8.config.Cap8MainConfig;
import com.enjoy.cap9.bean.Moon;
import com.enjoy.cap9.bean.Sun;
import com.enjoy.cap9.config.Cap9MainConfig;
import com.enjoy.cap9.dao.TestDao;
import com.enjoy.cap9.service.TestService;

public class Cap9Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
//		System.out.println(app);
		
		TestService testService = app.getBean(TestService.class);
		testService.println();
//		直接从容器中获取TestDao, 和使用Autowired注解来取比较
		//容器中有2个实例时，不能使用类的方式获取，会报错。
//		TestDao testDao = app.getBean(TestDao.class);
//		TestDao testDao = (TestDao) app.getBean("testDao2");
//		System.out.println(testDao);
		String[] beanDefinitionNames = app.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		/*Moon moon = (Moon)app.getBean(Moon.class); 
		System.out.println(moon);
		
		Sun sun = (Sun)app.getBean(Sun.class);
		System.out.println(sun.getMoon());*/
		app.close();
		
		
		
		
		
	}
}
