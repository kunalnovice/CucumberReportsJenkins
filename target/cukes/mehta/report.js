$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestFeature.feature");
formatter.feature({
  "line": 1,
  "name": "This is to see how reports are generated in Jenkins",
  "description": "",
  "id": "this-is-to-see-how-reports-are-generated-in-jenkins",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8392663,
  "status": "passed"
});
formatter.before({
  "duration": 53979,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "basic testing for reports",
  "description": "",
  "id": "this-is-to-see-how-reports-are-generated-in-jenkins;basic-testing-for-reports",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@runner"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "givenstep",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "whenstep",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "thensteps",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePagedef.givenstep()"
});
formatter.result({
  "duration": 69224076,
  "status": "passed"
});
formatter.match({
  "location": "HomePagedef.whenstep()"
});
formatter.result({
  "duration": 35733,
  "status": "passed"
});
formatter.match({
  "location": "HomePagedef.thensteps()"
});
formatter.result({
  "duration": 30411,
  "status": "passed"
});
formatter.before({
  "duration": 24709,
  "status": "passed"
});
formatter.before({
  "duration": 17866,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "basic testing for reports",
  "description": "",
  "id": "this-is-to-see-how-reports-are-generated-in-jenkins;basic-testing-for-reports",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@runner"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "givenstep",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "thensteps",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePagedef.givenstep()"
});
formatter.result({
  "duration": 27370,
  "status": "passed"
});
formatter.match({
  "location": "HomePagedef.thensteps()"
});
formatter.result({
  "duration": 24709,
  "status": "passed"
});
});