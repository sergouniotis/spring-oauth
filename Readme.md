A spring project which acts as a prototype for OAuth2 ( spring-oauth). 

Build and Run Project
---------------------------------------------------------------------------------------------------------------------------------------------
./gradlew build bootRun

Request token
-----------------------------------------------------------------------------------------------------------------------------------------------
curl -X POST http://localhost:8080/app/oauth/token -d grant_type=client_credentials -d username=author -d password=author -d client_id=my-client-with-secret -d client_secret=secret

Access Resource
------------------------------------------------------------------------------------------------------------------------------------------------
curl --header "Authorization: Bearer bcb7cec8-5614-4a34-9e27-fd6632dc1ca1" http://localhost:8080/app/endpoint/public

