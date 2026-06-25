# 🎮 Gaming Store — Android App

An Android-based mobile application for a gaming store, featuring a PHP backend for server-side data management.

---

## 📱 About

Gaming Store is a mobile shopping application built for Android that allows users to browse and purchase gaming products. The app communicates with a PHP backend for data handling and database connectivity.

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| Mobile App | Java (Android) |
| Backend | PHP |
| Database Connection | `koneksi.php` |

---

## 📁 Project Structure

```
projectandroid/
├── Project Gaming Store/     # Main Android project (Java)
└── koneksi.php               # PHP database connection file
```

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest version recommended)
- Java JDK 8 or higher
- A local or remote server running PHP (e.g., XAMPP, LAMP, or hosting)
- MySQL database

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Revataaa/projectandroid.git
   ```

2. **Set up the backend**
   - Copy `koneksi.php` to your PHP server directory
   - Update the database credentials inside `koneksi.php`:
     ```php
     $host = "your_host";
     $user = "your_username";
     $pass = "your_password";
     $db   = "your_database_name";
     ```

3. **Open the Android project**
   - Launch Android Studio
   - Open the `Project Gaming Store` folder
   - Let Gradle sync complete

4. **Configure the API base URL**
   - Update the server URL in the app to point to your PHP backend

5. **Run the app**
   - Connect an Android device or start an emulator
   - Click **Run** in Android Studio

---

## ✨ Features

- Browse gaming products
- View product details
- Shopping interface for gaming items
- Backend-connected data fetching via PHP

---

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

> Built with ❤️ by [Revataaa](https://github.com/Revataaa)
