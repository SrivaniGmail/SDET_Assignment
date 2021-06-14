$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Assignment.feature");
formatter.feature({
  "line": 1,
  "name": "Add an account in eLearning portal; send mail from this account and acknowledge mail sent to sender",
  "description": "",
  "id": "add-an-account-in-elearning-portal;-send-mail-from-this-account-and-acknowledge-mail-sent-to-sender",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3589547100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create an account and Send mail with newly created account",
  "description": "",
  "id": "add-an-account-in-elearning-portal;-send-mail-from-this-account-and-acknowledge-mail-sent-to-sender;create-an-account-and-send-mail-with-newly-created-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch the eLearning portal",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicked signup button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Create User and verify user created",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Send Mail",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify Acknowledge message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_the_eLearning_portal()"
});
formatter.result({
  "duration": 5130151500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicked_signup_button()"
});
formatter.result({
  "duration": 1567337600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.create_User_and_verify_user_created()"
});
formatter.result({
  "duration": 16547746700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.send_Mail()"
});
formatter.result({
  "duration": 11220781900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_Acknowledge_message()"
});
formatter.result({
  "duration": 197085100,
  "status": "passed"
});
formatter.after({
  "duration": 960445200,
  "status": "passed"
});
});