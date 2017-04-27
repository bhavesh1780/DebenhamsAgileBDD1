package DebenhamsAgileBDD;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Unit test for simple BasePage.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format = "html:target/CucumberReport",tags = "@basket")
public class RunTest {
}