# Experiment 7 - Role-Based Authorization (RBAC)

Student Details
Name: Piyush
Course: B.Tech CSE
Semester: 6th Semester
Subject: Full Stack Development

## Objective
Implement RBAC using Spring Boot and Spring Security.

## Roles
- USER
- ADMIN

## Endpoints

| Endpoint | Access |
|----------|--------|
| /api/public/hello | Public |
| /api/user/profile | USER, ADMIN |
| /api/admin/dashboard | ADMIN |

## Testing
- Public API works without login
- USER can access user endpoint
- USER cannot access admin endpoint (403)
- ADMIN can access admin endpoint
- Unauthorized access returns 401

## Tech Used
- Spring Boot
- Spring Security
- H2 Database (optional)
- Postman
