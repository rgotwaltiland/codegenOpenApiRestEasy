# OpenAPI Code Generation with RESTEasy

This project serves as an example of how to generate server stubs based on the OpenAPI specification document. 
This goal is achieved by leveraging the [Maven plugin module from the OpenAPI codegen project](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-maven-plugin). 
The benefit derived from generating the stubs from the specification document is an avoidance of the API specification differing from the actual API implementation. 

## OpenAPI Specification

The OpenAPI specification is defined with YAML and located at `src/main/resources/openapi.yaml`.
Changing the name or location of this file requires the `inputSpec` property in `pom.xml` to be updated as well. 
The specification uses [OpenAPI 3.0.0](https://swagger.io/specification/).
Changing to an earlier version (i.e. Swagger specification) will require additional work to be done to the file as various aspects of the specification changed between versions.

## Maven Plugin

The server stub generation is accomplished by adding a `plugin` to the `pom.xml`.
Inline comments in this file detail the various options available for generating the server stubs. 

Of particular importance, changing the `swaggerCodeGenVersion` to an earlier version should be done only with an understanding of the changes between Swagger 2.0 and OpenAPI 3.0.0.
Reverting to earlier versions may require `openapi.yaml` to be updated. 

For this project, RESTEasy is being used for API definition. Other example projects are available using other technologies such as Jersey and Spring. 

## Server Stub Generation

TODO - Detail server stub generation and add comments to `pom.xml`.

## Dependency Issues

There is a [known issue](https://github.com/swagger-api/swagger-codegen/issues/5410) with the OpenAPI code generation Maven plugin. 
When generating server stubs, an additional `pom.xml` is generated which contains required dependencies for the generated code. 
However, these dependencies are not properly configured into the project. 
A simple manual workaround involves coping the dependencies from the generated `pom.xml` to the project's base `pom.xml`.  