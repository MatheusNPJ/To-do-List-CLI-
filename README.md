✅ To-Do List (CLI)
A command-line interface (CLI) application for managing weekly tasks, developed in Java following the MVC (Model-View-Controller) architecture pattern. The system allows you to create, list, edit, and delete tasks, as well as mark them as completed and generate a report in a .txt file.

🚀 Features
✅ Task registration (day, location, title, and description)

✅ Weekly task listing

✅ Editing existing tasks

✅ Deleting tasks

✅ Marking tasks as completed

✅ Generating a report with all tasks saved in a .txt file

✅ 100% textual interface via the terminal (CLI)

📁 Project Structure
bash
Copiar
Editar
src/
├── controller/       # Business rules and application flow control
├── dto/              # Data Transfer Objects (DTOs)
├── model/            # Domain classes (Task, Location, Day, TaskFile)
├── view/             # User interface (menus, input, and output in the terminal)
└── Main.java         # Application entry point
🛠️ Technologies Used
☕ Java 17+

📦 Maven (for build and dependency management)

📦 How to Run the Project
✅ Prerequisites
Java 17 or higher installed

Maven installed

▶️ Steps:
Clone this repository:

bash
Copiar
Editar
git clone <YOUR-REPO-URL>
cd to-do-list
Compile the project:

bash
Copiar
Editar
mvn clean compile
Run the application:

bash
Copiar
Editar
mvn exec:java -Dexec.mainClass="Main"
💾 .txt File Generation
When using the save option, the application generates a .txt file containing all registered tasks, allowing for backup or external consultation.

🎯 Architecture Pattern
This project follows the MVC (Model-View-Controller) architecture, organizing the code into three main layers:

🔸 Model: Data and business rules (Task, Location, Day, TaskFile)

🔸 View: Responsible for user interaction (text-based terminal interface)

🔸 Controller: Manages the application flow and bridges between Model and View

🙋‍♂️ Author
Matheus Navalski
