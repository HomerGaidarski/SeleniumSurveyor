# SeleniumSurveyor
Fill out a survey using selenium.

Currently a junit springboot test that uses selenium with chromedriver to fill out a canes survey for a chance to win free canes for a year.

### Requirements
* JDK 1.8
* Gradle
* [chromedriver](https://chromedriver.chromium.org/)

### Running CanesSurveyTest

1. Copy application-example.yml to src/test/resources/application-test.yml
2. Change the values to your desired settings and run the test.

NOTE: You can run the test multiple times with the same survey code and custom values, but
I don't know if it actually counts as multiple entries.
