package com.poc.seleniumsurveyor;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@ActiveProfiles("test")
@SpringBootTest
public class CanesSurveyTest {
    @Value("${canes-survey.input.survey-code}")
    private String surveyCode;

    @Value("${canes-survey.input.name}")
    private String name;

    @Value("${canes-survey.input.address}")
    private String address;

    @Value("${canes-survey.input.city}")
    private String city;

    @Value("${canes-survey.input.state}")
    private String state;

    @Value("${canes-survey.input.zipcode}")
    private String zipcode;

    @Value("${canes-survey.input.email}")
    private String email;

    @Value("${canes-survey.input.phone-number}")
    private String phoneNumber;

    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void doSurvey() throws Exception {
        driver.get("https://raisingcane.survey.marketforce.com/");
        driver.findElement(By.linkText("English")).click();

        // extract survey code pieces
        String[] splitCode = surveyCode.split("-");
        assertThat(splitCode, Matchers.arrayWithSize(4));

        driver.findElement(By.id("EntryCode1")).click();
        driver.findElement(By.id("EntryCode1")).clear();
        driver.findElement(By.id("EntryCode1")).sendKeys(splitCode[0]);
        driver.findElement(By.id("EntryCode2")).clear();
        driver.findElement(By.id("EntryCode2")).sendKeys(splitCode[1]);
        driver.findElement(By.id("EntryCode3")).clear();
        driver.findElement(By.id("EntryCode3")).sendKeys(splitCode[2]);
        driver.findElement(By.id("EntryCode4")).clear();
        driver.findElement(By.id("EntryCode4")).sendKeys(splitCode[3]);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Begin Survey'])[1]/input[1]")).click();
        driver.findElement(By.id("Question_124200102196150218178053017029202235094208184212")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='A few times a week'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Between 12 and 24 months ago'])[1]/preceding::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='How often do you visit OTHER quick service or fast food restaurants? Mark one only:'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('What did you order at Raising Cane', \"'\", 's Chicken Fingers® today? Check all that apply:')])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='What came with your order today? Check all that apply:'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Chicken Sandwich'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='French Fries'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Coleslaw'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sauce'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Questions'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='How satisfied are you with the value you received for the money you paid?'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… cleanliness of the parking lot and surrounding outside areas?'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… cleanliness of the parking lot and surrounding outside areas?'])[1]/following::label[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Overall, how satisfied were you with the service you received?'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… the friendliness of our crew?'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… the attentiveness of our crew?'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('… recommend Raising Cane', \"'\", 's Chicken Fingers® to a friend or family member?')])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('… return to THIS Raising Cane', \"'\", 's Chicken Fingers® location?')])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='How satisfied were you with the time it took to place your order?'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='How satisfied were you with the time it took to place your order?'])[1]/following::label[10]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Longer than 15 minutes'])[1]/preceding::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Was your order accurate?'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Back'])[1]/following::div[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='How satisfied were you with the quality of the food?'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… the Chicken'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… the French Fries'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… the Texas Toast or bun'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… the Sauce'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='… the Beverage'])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('I LOVE Raising Cane', \"'\", 's Chicken Fingers®!')])[1]/following::label[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('I LOVE Raising Cane', \"'\", 's Chicken Fingers®!')])[1]/following::label[10]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Great Crew and Customer Service'])[1]/preceding::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yes'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Drove by location'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Walked by location'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Radio advertisement'])[1]/preceding::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Drove by location'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yes'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.id("Question_120094177164234154161238156156125236252076167165")).click();
        driver.findElement(By.id("Question_120094177164234154161238156156125236252076167165")).clear();
        driver.findElement(By.id("Question_120094177164234154161238156156125236252076167165")).sendKeys("amazing service, delicious chicken");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Female'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Please select your age group:'])[1]/following::label[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Other'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$150,000 or more'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Are you a Caniac Club Member?'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No'])[1]/preceding::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No'])[1]/preceding::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
        driver.findElement(By.id("Questions[0].CustomFields[0].Response")).click();
        driver.findElement(By.id("Questions[0].CustomFields[0].Response")).clear();
        driver.findElement(By.id("Questions[0].CustomFields[0].Response")).sendKeys(name);
        driver.findElement(By.id("Questions[0].CustomFields[1].Response")).clear();
        driver.findElement(By.id("Questions[0].CustomFields[1].Response")).sendKeys(address);
        driver.findElement(By.id("Questions[0].CustomFields[2].Response")).clear();
        driver.findElement(By.id("Questions[0].CustomFields[2].Response")).sendKeys(city);
        driver.findElement(By.id("Questions[0].CustomFields[3].Response")).clear();
        driver.findElement(By.id("Questions[0].CustomFields[3].Response")).sendKeys(state);
        driver.findElement(By.id("Questions[0].CustomFields[4].Response")).clear();
        driver.findElement(By.id("Questions[0].CustomFields[4].Response")).sendKeys(zipcode);
        driver.findElement(By.id("Questions[0].CustomFields[5].Response")).clear();
        driver.findElement(By.id("Questions[0].CustomFields[5].Response")).sendKeys(email);
        driver.findElement(By.id("Questions[0].CustomFields[6].Response")).clear();
        driver.findElement(By.id("Questions[0].CustomFields[6].Response")).sendKeys(phoneNumber);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/input[1]")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}

