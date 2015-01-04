$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestFeature.feature");
formatter.feature({
  "line": 1,
  "name": "This is to see how reports are generated in Jenkins",
  "description": "",
  "id": "this-is-to-see-how-reports-are-generated-in-jenkins",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14971694,
  "status": "passed"
});
formatter.before({
  "duration": 109100,
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
  "duration": 79634126,
  "status": "passed"
});
formatter.match({
  "location": "HomePagedef.whenstep()"
});
formatter.result({
  "duration": 39915,
  "status": "passed"
});
formatter.match({
  "location": "HomePagedef.thensteps()"
});
formatter.result({
  "duration": 29271,
  "status": "passed"
});
formatter.before({
  "duration": 25469,
  "status": "passed"
});
formatter.before({
  "duration": 15586,
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
  "duration": 26610,
  "status": "passed"
});
formatter.match({
  "location": "HomePagedef.thensteps()"
});
formatter.result({
  "duration": 22808,
  "status": "passed"
});
});