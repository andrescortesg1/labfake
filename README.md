[![CI/CD Pipeline](https://github.com/andrescortesg1/labfake/actions/workflows/build.yml/badge.svg)](https://github.com/andrescortesg1/labfake/actions/workflows/build.yml)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=bugs)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=coverage)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=andrescortesg1_labfake&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=andrescortesg1_labfake)

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```
