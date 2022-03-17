## A Microservice Architecture Course using Springboot framework to handle-server side functionality, and React.js to consume REST API and also for Client-Side functionality

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

##Endpoint - Delete a course by Id

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

