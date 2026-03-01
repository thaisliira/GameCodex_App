# 🎮 GameCodex

> An Android application developed in Kotlin for managing video game collections and wishlists, featuring authentication, dynamic age-based filtering, and real-time metric calculations (price and storage).

---

## 📌 Project Overview

**GameCodex** demonstrates the implementation of complex data flows in Kotlin, utilizing **View Binding** for safe UI manipulation and **Intents** to transfer state and user metadata between application components. The project focuses on clean code practices and efficient collection handling.

---

## ✨ Features

### 🔐 Authentication & Security
- **Login System:** Validates credentials against a pre-defined list of authorized users.
- **Data Persistence:** Passes user metadata (name and birth year) between activities using `intent.putExtra`
- **Session Management:** Uses `finish()` to ensure users cannot return to the login screen after a successful session start.

### 📜 Intelligent Catalogue
- **Dynamic Age Filtering:** The game catalogue is automatically filtered based on the user's age (calculated using `java.time.LocalDate`), ensuring only age-appropriate titles are displayed.
- **Custom Adapters:** Utilizes `ArrayAdapter` to render game lists within the catalogue and wishlist views.

### 🛒 Dynamic Wishlist Management
- **Add/Remove Logic:** Intuitive click system to move games between the catalogue and the wishlist.
- **Real-time Metrics:** - **Price Tracking:** Automatic summation of total costs in Euro (€).
  - **Storage Calculation:** Calculates total size in GB with precise decimal formatting.
  - **Category Analysis:** Tracks unique game categories using collection transformations (`map` and `set`).

---

## 🛠️ Tech Stack & Conventions

This project adheres to modern Android development standards:

- **Language:** Kotlin (strictly following the convention of omitting unnecessary semicolons).
- **UI Framework:** XML with **View Binding** to replace traditional `findViewById`.
  **Naming Conventions:** 
  - `camelCase` for variables, methods, and class attributes.
  - `PascalCase` for Classes[cite: 40].
  - `snake_case` for layout element IDs (e.g., `button_login`, `edit_username`)].
- **UI/UX:** Implementation of **Toasts** for immediate user feedback and self-closing XML tags for cleaner layout code.

---

## 🚀 How It Works

1. **Login:** The user enters credentials. The system validates the input and calculates the user's age.
2. **Wishlist:** When a game is selected, the system checks for duplicates. If unique, it adds the game to the wishlist and updates the total price and storage size displays.
3. **Logout:** The logout button terminates the current activity, effectively ending the user session.

---

## 👩‍💻 Author

**Thais Lira**
