package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void ininitlizeTest(){
        System.out.println("Invoking the browser");


    }
    @After
    public void tearDown(){
        System.out.println("Closing the  the browser");


    }


}
