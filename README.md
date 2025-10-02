# 🎯 Guesser Game

A fun and interactive number guessing game built in Java, designed to demonstrate object-oriented programming principles like encapsulation, abstraction, and modular design. This project is ideal for beginners and showcases clean code structure, user input handling, and control flow logic.

## 📌 Project Overview

The Guesser Game simulates a simple competition between three players trying to guess a randomly generated number by the "Guesser." An "Umpire" class orchestrates the game, collecting inputs and determining the winner(s). The game continues in a loop until the user chooses to exit.

### 👨‍💻 Technologies Used

- **Java** (JDK 8+)
- **OOP Concepts**: Classes, Objects, Methods, Encapsulation
- **Standard Input/Output**: `Scanner` class
- **Randomization**: `Math.random()`

## 🧩 Game Flow

1. The game starts with a welcome message.
2. The `Guesser` generates a random number between 0 and 9.
3. Each of the three `Player` instances inputs their guess.
4. The `Umpire` compares all guesses with the Guesser's number.
5. The result is displayed, showing who won or if all lost.
6. The magic number is revealed.
7. The user is prompted to continue or exit the game.

## 📸 Demo

```bash
------ Game Started -----
Player 1 Guess a Number
5
Player 2 Guess a Number
3
Player 3 Guess a Number
5
Player 1 & Player 3 Won
Magic Number : 5
You want to Exit game : Y | N
Select Y for Yes | N for No

```
## 💡 What This Project Says About Me

This project reflects my passion for clean code, user-centric design, and continuous improvement. It’s a simple idea executed with clarity and scalability in mind. I believe in building from the ground up—starting with fundamentals and growing into robust systems.

## 🚀 How to Run

Clone the repository:

```bash
git clone https://github.com/adarshrai03/GuesserGame.git
```
Navigate to the project directory:
```
cd GuesserGame
```
Compile and run:
```
javac GuesserGame.java
java Guessor.GuesserGame
```
ThankYou <3
