# Overview

This repository contains solutions for **Problem 2** and **Problem 4**. Each problem’s solution code is organized into its own folder, with each sub-problem having a dedicated Java file.
---

## Directory Structure

```
problem_2
 ├─ 2.1.java
 └─ 2.2.java

problem_4
 ├─ 4.1.java
 ├─ 4.2.java
 ├─ 4.3.java
 └─ 4.4.java

README.md
```

- **problem_2/**: Contains two Java files (`2.1.java` and `2.2.java`) that address the sub-problems of Problem 2.  
- **problem_4/**: Contains four Java files (`4.1.java`, `4.2.java`, `4.3.java`, and `4.4.java`) for the sub-problems of Problem 4.

---

## Coding Guidelines Followed

1. **Code Readability and Documentation**  
   - Each class and method includes descriptive comments that explain the purpose, logic, and any assumptions made.  
   - Where operations are not self-evident, additional inline comments clarify how and why they are performed.  
   - JavaDoc-style comments are used where appropriate (e.g., for complex methods or class-level explanations).

2. **Low Coupling and High Cohesion**  
   - Classes and methods focus on a single responsibility to maintain high cohesion.  
   - Where multiple responsibilities exist, functionality is separated into smaller methods or helper classes.  
   - Dependencies between classes or methods are minimized (low coupling), improving maintainability and testability.

3. **Naming Conventions**  
   - Class names, method names, and variable names are chosen to be meaningful and consistent with standard Java conventions (e.g., `CamelCase` for classes, `lowerCamelCase` for methods and variables).  
   - Abbreviations are avoided unless they are well known and improve clarity.

4. **Code Style and Organization**  
   - Proper indentation and spacing are used for better readability.  
   - Logical blocks of code are grouped together, often separated by blank lines or explanatory comments.  
   - Long methods are broken down into smaller private methods if they perform distinct sub-tasks.

5. **Error Handling**  
   - Wherever user input or external resources are involved, the code includes checks to prevent unexpected failures.  
   - Where appropriate, `try-catch` blocks or conditionals handle exceptional cases, and meaningful error messages are logged or returned.  
   - Methods validate input parameters before proceeding with critical operations.

---
