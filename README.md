# Swift-Ride-Console-Based-Ride-App-in-Java
RapiSim is a Java-based console application that simulates a simplified version of the Rapido ride-booking platform. This mini project demonstrates how core Object-Oriented Programming (OOP) concepts can be used to design a real-world system like an app for booking two-wheeler rides.

# 🚀 swift-ride -> Rapido Ride Booking Simulator in Java

RapiSim is a **console-based ride booking application** developed in Java. It simulates the functionality of real-world platforms like **Rapido** by allowing users to book rides, make payments, give feedback, and view profile details using core Java OOP concepts.

---

## 📋 Project Overview

This project is a **Java mini project** named **RapiSim**, which allows a user to:
- Log in with name, age, and phone number.
- Simulate OTP verification.
- Book a ride by entering source and destination.
- Get an estimated fare based on distance (₹10/km).
- Simulate a payment process.
- Give star-based ride feedback.
- View ride history and user profile.

It is designed using Java’s **object-oriented principles**, making it ideal for students and beginners learning Java development.

---

## 🎯 Features

✅ Console-based User Interaction  
✅ OTP Verification Simulation  
✅ Distance-Based Fare Estimation  
✅ Payment Simulation with Validation  
✅ Star-Based Feedback Submission  
✅ User Profile Summary (Name, Age, Mobile, Total KMs, Rating)  
✅ Clean and modular code using OOP

---

## 🧰 Technologies Used

- 💻 **Language:** Java (JDK 8 or above)  
- 🧱 **OOP Concepts:**  
  - Abstraction (`UserProfile` abstract class)  
  - Interface (`AppHome`)  
  - Inheritance and Polymorphism (`Booking` class)  
- 📥 Input Handling: `Scanner` class

---

## 🏗️ Project Structure

UserProfile.java  → Abstract class with common user attributes  
AppHome.java      → Interface with ride operations  
Booking.java      → Implements AppHome, extends UserProfile  
Rapido.java       → Main class for user interaction and flow

WELCOME TO RAPIDO
WHICH MAKES YOUR RIDE EASIER AND INSURED
ENTER YOUR NAME: your name
ENTER YOUR AGE: your age 
ENTER YOUR MOBILE NO: your number
ENTER 4 DIGIT OTP SENT TO YOUR NUMBER: otp(only integers)

LOGIN SUCCESSFUL!

1. BOOK A RIDE
2. OPEN PROFILE
3. GIVE FEEDBACK
4. CLOSE APPLICATION

🔮 Future Improvements
Add database or file storage to save booking history.

Add GUI (JavaFX or Swing) for user-friendly interface.

Add multiple user accounts and admin view.

Integrate real-time maps APIs (for advanced versions).

✅ Conclusion
This project, swift-ride –> Rapido Ride Booking Simulator in Java, demonstrates how real-world ride booking applications can be simulated using core Java programming concepts. It showcases the power of object-oriented programming (OOP) through clean class structures, interfaces, inheritance, and user-driven interaction.

By building this console-based application, I have gained hands-on experience in:

Designing user profiles

Managing input-driven operations

Simulating payment and feedback systems

Structuring a program with abstraction and modular design

This mini project not only strengthens foundational Java skills but also serves as a stepping stone toward more advanced applications involving databases, GUIs, and full-stack integration.
