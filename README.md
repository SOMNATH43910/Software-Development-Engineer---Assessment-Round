# 🚆 Train Seat Booking System (Java Console App)

A beginner-friendly **Java CLI application** to simulate seat reservations in a train coach.  
Users can book between **1 to 7 seats**, and the system tries to assign seats in a single row if available. 🎫  
Fallback logic allocates seats across multiple rows when needed.

---

## 🪑 Coach Layout Structure

| Row No. | No. of Seats |
|---------|--------------|
| 1–11    | 7 seats each |
| 12      | 3 seats only |

> **Legend:** `0 = available`, `1 = reserved`

---

## 🔧 Features at a Glance

| Feature                                | Description                                                                 |
|----------------------------------------|-----------------------------------------------------------------------------|
| ✅ **Dynamic Booking**                | Books adjacent seats in the same row if possible                            |
| 🔄 **Fallback Allocation**            | Distributes seats across rows if required                                   |
| 🧾 **Live Status Display**            | Shows current seat status after every booking                               |
| ❌ **Coach Full Detection**           | Stops booking once all seats are filled                                     |
| 🧠 **Logical 2D Array Structure**     | Efficient seat tracking using a 2D array                                    |

---

## 📂 File Details

| File Name              | Purpose                                  |
|------------------------|------------------------------------------|
| `TrainSeatBooking.java`| Main program file with full functionality|

---

## 🚀 How to Run
--------------------------------------------------
javac TrainSeatBooking.java
java TrainSeatBooking
Make sure Java is installed on your system before running the above commands.
===================================================
🖥️ Sample Console Output
Current seat status (0 = available, 1 = reserved):
Row 1: 0 0 0 0 0 0 0 
Row 2: 0 0 0 0 0 0 0 
==================================================
Kitni seats chahiye (1-7)? 4
Book ki gayi seats: [Row 1 Seat 1, Row 1 Seat 2, Row 1 Seat 3, Row 1 Seat 4]
📌 Learning Outcomes
🧩 Understanding of 2D arrays in Java

🤖 Implementation of dynamic logic using conditions and loops

🧠 Applying real-life logic into console applications

🧼 Clean code structure with proper separation of concerns
===========================================================
📫 Want to Contribute?
Pull requests and suggestions are welcome!
This project is a great place for Java beginners to start contributing 🚀
----------------------------------------------------------------------
🙋‍♂️ Developed By
Somnath Rana
MCA ‘25 | Backend & Clean Code Enthusiast | Wipro Intern
🔗 LinkedIn | 💻 GitHub  👈


Let me know if you want this in a file (like `README.md`) or want me to include GitHub repository-level badges and licensing info too. ✅

