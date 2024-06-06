package RunnerPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import BasePack.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\File\\demo.feature", glue = "com.stepPack", dryRun = false, publish = true, monochrome = true,plugin = {"html:target\\Dominus.report\\Report1.html","json:target\\Dominus.report\\repart2.json"})

public class RunnerClass extends BaseClass {
	@BeforeClass
	public static void start() {
		Bowserlaunch();
		toMaximize();
	}

	@AfterClass
	public static void end() {
		quit();
	}
}
