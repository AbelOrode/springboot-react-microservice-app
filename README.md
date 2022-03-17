## A microservice application titled Course Management System  built on Spring WebFlux, and React.js. 
-- Each of the services would be implemented using three different databases which are postgreSQL, H2 in-memory DB, and MYSQL. 
-- This application, being the first out of the three microservices, would be implemented using postgreSQL.



## Endpoint - Create a Course
```
POST /api/course/ HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json

{
    "title" : "Service Oriented Achitecture",
    "subtitle" : "This is a course handled by Jackie Stewart",
    "price" : 200.50
```

## Endpoint - GET ALL Courses

```
GET /api/course/ HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json


{
    "title" : "Service Oriented Achitecture",
    "subtitle" : "This is a course handled by Jackie Stewart",
    "price" : 200.50
}
```

## Endpoint - Delete a course by Id
```
DELETE /api/course/2 HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json


{
    "title" : "Service Oriented Achitecture",
    "subtitle" : "This is a course handled by Jackie Stewart",
    "price" : 200.50
}
```

