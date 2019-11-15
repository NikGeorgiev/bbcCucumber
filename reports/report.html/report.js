$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/BbcLogin.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a BBC user I want to utilise the login feature\n  So that I can use the customisation features",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I receive a valid error when using an incorrect password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the signing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BbcLoginStepDefs.i_am_on_the_signing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input a valid email",
  "keyword": "When "
});
formatter.match({
  "location": "BbcLoginStepDefs.i_input_a_valid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "BbcLoginStepDefs.an_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive a valid error",
  "keyword": "Then "
});
formatter.match({
  "location": "BbcLoginStepDefs.i_receive_a_valid_error()"
});
formatter.result({
  "status": "passed"
});
});