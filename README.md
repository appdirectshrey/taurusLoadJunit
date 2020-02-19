# taurusLoadJunit
Gradle Project for Taurus Load Generation using JUnit

# Introduction
Taurus is an open source automation framework for running various open source load testing tools and functional testing tools.
We have used Taurus with JUnit Executor configuration.

# Purpose
A test case (testCase1) is written in TaurusLoadJunitApplicationTests.java to hit the Subscription API 
api/v3/subscription/developer/developerId/externalAccountId with OAuth 1.0 protocol.
Blazemeter Taurus YAML script blazemeter_junit.yaml is linked to the java file. YAML script has iteration and concurrency parameters specified, accordingly the test case is executed and load is generated.

# Output
Upon running the command bzt YAMLscriptPath.yaml, the YAML script is executed and the resulting summary stats are generated in the console log.
