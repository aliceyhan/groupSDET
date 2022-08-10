package interview_questions;

public class Topic_1 {
    //1.When do you do automation in your sprint?
    //• When developers are done with their part
    //• When code is deployed to QA/test environment
    //• When testing framework is set up
    //• When all manual tests are done
    //• Smoke tests are passing

    //2.Who writes test plans and test cases?
    // Test plans are typically written by the quality assurance lead while testers usually write test cases.

    //3.Difference between Test case and Test script?
    //• Test case terminology mostly used for Manual Testing whereas Test Script mostly used for Automation Testing
    //• A test case is a documentation which specifies input values, expected output and the preconditions for executing
    //the test. It's also a layout of the low-level details on how to test the scenario
    //• A test script in software testing is a set of instructions that will be performed on the system under test to test that the
    //system functions as expected.

    //4.What will you do when script fails?
    //• In my experience, I will identify the failure,
    //- if it is this due to application error, sync error, script issue or environment is down,
    // first of all I analyze the result by reproduce it through Jenkins run only the fail one,
    //- if it is due to synchronization issue, I will add extra time by using implicit, explicit and some custom expected conditions,
    //- If it is script issue I will debugging (identify) my script and fix it, analyze the exceptions,
    //- if it is real defect then I will log defect.

    //5.Test Scenario?
    //• Make sure that end to end functionality of application under test is working as expected
    //• The tester needs to put his/her foot in the end users’ shoes to check and perform the action as how they are using application under test
    //• T.S can have many test cases associated with it, Before executing the T.S we need to think of test cases for scenario
    //• Test Scenario: Validate the login page
    //Test Case 1: Enter a valid username and password
    //Test Case 2: Reset your password
    //Test Case 3: Enter invalid credentials
    //• In each test case are detailed steps and condition for execution

    //6.What is the difference between Quality Control and Quality Assurance?
    //Quality control (QC) and quality assurance (QA) are closely linked but are very different concepts.
    // While QC evaluates a developed product, the purpose of QA is to ensure that the development process is
    // at a level that makes certain that the system or application will meet the requirements.


    //7. What is the role of QA in a project development?
    //QA team is responsible for monitoring the process to be carried out for development.
    //Responsibilities of QA team are planning testing execution process.
    //QA Lead creates the time tables and agrees on a Quality Assurance plan for the product.
    //QA team communicated QA process to the team members. QA team ensures traceability of test cases to requirements.

    //8.Explain the difference between bug severity and bug priority.
    //Bug severity refers to the level of impact that the bug has on the application or system while bug priority refers to the level of urgency in the need for a fix.
    //Usually the severity is defined in terms of financial loss, damage to environment, company's reputation and loss of life.
    // Priority of a defect is related to how quickly a bug should be fixed and deployed to live servers.

    //9.What is the difference between system testing and integration testing?
    //For system testing, the entire system as a whole is checked,
    //whereas for integration testing, the interaction between the individual modules are tested.

    //10.What to do when you find a defect?
    //If I find a defect, before reporting it I reproduce the bug that I need to make sure that is a valid defect.
    //If it is a small issue, I will go to the developer desk, and he can fix it right away.
    //If it is a big issue, then I open my JIRA and log the defect.
    //If I am not sure it is bug or not, I will talk to SME (subject matter expert it means the person who knows the application better than anyone).
}
