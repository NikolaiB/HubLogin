### Commands for work with Serenity:

All commands will need to run from hub-qa directory!

## Clean a hub-qa project (remove target directory with reports):  

    mvn clean  

## Run a specific stories

For run specific stories you need change AcceptanceTestSuite.class:
    
    ...
        public AcceptanceTestSuite()
        {
            findStoriesCalled("stories/INPUT_DIRECTORY/INPUT_NAME_STORY_HERE.story"); 
        }
    ... 
    
For run all stories you need change this code on findStoriesCalled("stories/*/*.story");

Default running story is SmokeTest.story which verify main functionality and all main pages.

## Run tests with taking screenshots on all steps

    mvn integration-test

## Generate reports in html format

    mvn serenity:aggregate

All reports are stored in directory: hub-qa/target

If you want see reports please open file target/site/serenity/index.html in any browser.