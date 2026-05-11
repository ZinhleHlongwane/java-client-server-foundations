# Robot World Networking Foundation

## Overview
This project rebuilds the networking foundation of a Java multi-client Robot World system from scratch.

The goal is to deeply understand:
- Java Socket programming
- ServerSocket architecture
- Multi-client threading
- Client-server communication
- BufferedReader / PrintWriter
- Runnable and Thread
- Object-Oriented Design
- Iteration 1 Robot World foundations

---

# Project Goal
Build a networking-first Robot World system where:
- A server listens for multiple clients
- Clients connect using sockets
- Users send commands
- The server processes requests
- Multi-threading supports multiple clients

---

# Core Concepts
## Server Side:
- Server
- MultiServer
- ClientHandler

## Client Side:
- Client
- ClientConnection
- ClientInputHandler

---

# Technologies Used
- Java
- Maven
- JUnit 5
- Sockets
- Multithreading
- Git/GitHub

---


# Learning Objectives
This project focuses on:
- Understanding networking from scratch
- Building systems before abstraction
- Reading and writing socket data
- Separation of concerns
- Strong OOP foundations
- Portfolio-quality Java development

---

# Current Features
- Server startup
- Multi-client support
- Client connection
- User input handling
- Basic command communication
- Unit testing structure

---

# Future Expansion
- launch command
- look command
- state command
- Protocol integration
- World logic
- Obstacles
- Full Robot World system

---

# How to Run

## Compile:
mvn clean compile

## Run Server:
mvn exec:java -Dexec.mainClass="za.co.wethinkcode.server.Server"

## Run Client:
mvn exec:java -Dexec.mainClass="za.co.wethinkcode.client.Client"

---

# Why This Project Matters
This project exists to strengthen real understanding of Java networking and architecture, while also serving as a portfolio project demonstrating client-server development, multithreading, and software engineering fundamentals.


EOF
