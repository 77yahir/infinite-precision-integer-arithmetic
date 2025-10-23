# Infinite Precision Integer Arithmetic

This Java project implements arithmetic operations (addition, subtraction, and multiplication) on arbitrarily large integers using **custom linked-list data structures**.  
It was developed to explore how low-level number representations work under the hood and how to design algorithms that go beyond Java’s built-in data type limits.

---

## Features

- Handles integers of **any size** using a custom linked-list representation  
- Performs **addition, subtraction, and multiplication** manually — no `BigInteger` library used  
- Includes **carry propagation** and **sign management** logic for accurate computation  
- Extensively tested with small and large integer cases to ensure correctness  

---

## Concepts Applied

- Linked lists and node-based data structures  
- Algorithm design for arithmetic operations  
- Manual handling of carries and signs  
- Object-Oriented Programming (OOP) in Java  
- Software testing and debugging  

## Testing

The file **`SampleTest_Provided.java`** was included with the course starter code to demonstrate the use of JUnit.  
All additional testing was performed independently to validate arithmetic methods at the unit level.

Custom test cases verify:
- Correctness of arithmetic results  
- Edge cases (zero inputs, very large values)  
- Consistent performance across varying input sizes  

**Tools Used:**  
- Java  
- IntelliJ IDEA  
- JUnit (for testing)

---

## Planned Improvements

- Finish implementation of **negative integer support**  
- Add **input validation** for invalid characters  

---

## What I Learned

- How arithmetic operations actually work under the hood  
- Designing and debugging algorithms for precision beyond native types  
- The importance of **testing and validation** to ensure software reliability  
- Using GitHub and IntelliJ IDEA for version control and structured development  

---

## How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/77yahir/infinite-precision-integer-arithmetic.git
   ```
2. Open the project in **IntelliJ IDEA** (or any Java IDE).
3. **Run the program**
   - Open `Main.java`
   - Press **Run**

---

## Repository Info
Author: Yahir Flores  
Language: Java  
IDE: IntelliJ IDEA  
Status: In Progress (Version 1.0 - Core Operations Complete)

---

> This project was developed as part of a university assignment and refined to demonstrate problem-solving, algorithm design, and testing fundamentals.
