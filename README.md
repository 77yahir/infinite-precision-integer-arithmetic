# Infinite Precision Integer Arithmetic

This Java project implements arithmetic operations (addition, subtraction, and multiplication) on arbitrarily large integers using **custom linked-list data structures**. It was developed to explore how low-level number representations work under the hood and how to design algorithms that go beyond Java’s built-in data type limits.

---

## Features

- Handles integers of **any size** by using a custom linked-list representation
- Performs **addition, subtraction, and multiplication** manually — no `BigInteger` library used.
- Includes **sign management** and **carry propagation** logic for accurate computation.
- Extensively tested with small and large integer cases to ensure correctness.

---

## Concepts Applied

- Linked Lists and Node-based data structures  
- Algorithm design for arithmetic operations  
- Manual handling of carries and signs  
- Object-Oriented Programming (OOP) in Java  
- Software testing and debugging  

---

## Testing

The file `SampleTest_Provided.java` was included with the course starter code to demonstrate the use of JUnit.
My own testing focused on unit-level validation of arithmetic methods.

Test cases were created to verify:
- Correctness of arithmetic results  
- Edge cases (e.g., negative numbers, zero, very large values)  
- Consistent performance across varying input sizes  

**Tools:**  
- Java  
- IntelliJ IDEA  
- JUnit (for testing)

---

## What I Learned

- How arithmetic operations actually work under the hood  
- Designing and debugging algorithms for precision beyond native types  
- The importance of **testing and validation** to ensure software reliability  
- Using GitHub and IntelliJ for version control and structured development  

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yahirflores/infinite-precision-integer-arithmetic.git
2. Open in **IntelliJ IDEA** (or any Java IDE).
3. Run the `Main.java` file to test arithmetic operations.
   
---

## Repository Info
Author: Yahir Flores  
Language: Java  
IDE: IntelliJ IDEA  
Status: In Progress (Version 1.0 - Core Operations Complete)

---

> This project was developed as part of a university assignment and refined to demonstrate problem-solving, algorithm design, and testing fundamentals.

