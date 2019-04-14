/**
 * 
 */
package com.OpenWealthMapTest.Home;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OpenWealthMapTest.Base.HelperClass;
import com.OpenWealthMapTest.pages.OpenWealthHome;

/**
 * @author admin
 *
 */
public class Lables extends HelperClass {


	@BeforeMethod
	public void setup() {
		Initialization();		
	}

	@Test
	public void testOpenWealthMapsLable() {
		OpenWealthHome OWM=new OpenWealthHome();	
		/*String API=OWM.getAPItxt();
		System.out.println("API lables Name :"+API);
		//Assert.assertEquals(API, "API");
		String Blog=OWM.getBlogtxt();
		System.out.println("Blogs lables Name :"+Blog);
		//Assert.assertEquals(API, "Blog");

		String Wather=OWM.getWeathertxt();
		System.out.println("Weather lables Name :"+Wather);
		//Assert.assertEquals(API, "Weather");

		String Widgts=OWM.getWiedgtstxt();
		System.out.println("Widgets lables Name :"+Widgts);
		//Assert.assertEquals(API, "Widgets");

		String Partners=OWM.getPartnerstxt();
		System.out.println("Partners lables Name :"+Partners);
		//Assert.assertEquals(API, "Partners");

		String Title=OWM.getTitle();
		System.out.println("Title of Page :"+Title);
		//Assert.assertEquals(API, Title);

		String Guide=OWM.getGuidetxt();
		System.out.println("Guide lables Name :"+Guide);
		//Assert.assertEquals(API, "Guide");

		String Price=OWM.getPricetxt();
		System.out.println("Price lables Name :"+Price);
		//Assert.assertEquals(API, "Price");

		String Stations=OWM.getStationstxt();
		System.out.println("Stations lables Name :"+Stations);
		//Assert.assertEquals(API, "Stations");

		String Maps=OWM.getMapstxt();
		System.out.println("Maps lables Name :"+Maps);
		//Assert.assertEquals(API, "Maps");\
	*/	
		driver.quit();
		


	}


}
