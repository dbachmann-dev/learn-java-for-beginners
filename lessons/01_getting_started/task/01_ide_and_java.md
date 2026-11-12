# 01 - Getting Started: IDE, Java & Setup

## Content of this file:

1. What is Java, Java VM, JDK, IDE?
2. Installing Java (JDK)
3. Installing an IDE
4. Installing Extensions that I Use

---

## 01 - What is Java, Java VM, JDK, IDE?

Before we write our first line of code, let's briefly clarify what these terms actually mean and how they work together:

* **Java (Programming Language):** The high-level programming language we use to write our code. It is "object-oriented" and follows the principle: *Write once, run anywhere*.
* **JDK (Java Development Kit):** The core toolset you need to *develop* Java applications. It includes the compiler (which translates your human-readable `.java` code into bytecode) and the JRE.
* **JRE & JVM (Java Virtual Machine):** The JVM is the engine that executes your compiled Java code. Because of the JVM, Java can run on Windows, macOS, and Linux without changing the code. The JRE contains the JVM plus standard libraries.
* **IDE (Integrated Development Environment):** Your main workspace (like VS Code or IntelliJ). It combines a text editor, code completion, debugging tools, and terminal integration into one app so you don't have to compile everything manually in the terminal.

---

## 02 - Installing Java (JDK)

To run and compile Java programs, you need the Java Development Kit (JDK) installed on your system.

*Since I use a Mac, the commands below are specifically for macOS (using Homebrew):*

1. Open your terminal.
2. Install a modern JDK version (for example, OpenJDK) via Homebrew:
   ```bash
   brew install openjdk
   ```
3. Verify that the installation was successful by checking the version:
   ```bash
   java -version
   ```

---

## 03 - Installing an IDE

I primarily use **VS Code** on my MacBook and Linux machines because I am used to its clean design, speed, and massive extension ecosystem. In the past, I used Eclipse, which is known to be very powerful for Java, but I personally didn't like its older-looking design or having to click through endless menus just to change a theme.

The most well-known IDEs for Java are IntelliJ IDEA, Eclipse IDE, VS Code, and sometimes lighter editors like Zed.

You can use whatever IDE you like best. Since I use VS Code, here is how I set it up:

1. Visit [code.visualstudio.com/download](https://code.visualstudio.com/download) and download the installer for your operating system.
2. Install VS Code.
3. Create a main workspace folder on your computer (for example, `Visual_Studio_Code`) to keep all your projects organized in one place.

Personally, I like to split my workflows inside this main folder into clear categories. Here is an example of how my structure looks:

* `Visual_Studio_Code/` – Main workspace folder you open in your IDE
  * `private_projects/` – Personal coding projects
  * `school/` – School projects and assignments
  * `java_learning_course_public/` – This course repository
    * `lessons/`
      * `01_getting_started/`

  !!! Please note: From now on, all steps I'll show you are done in Visual Studio Code !!!

---

## 04 - Installing Extensions that I Use

VS Code is lightweight by default, so we need a few extensions to make Java development smooth. You can install any extension you like, but for Java specifically, I use the following:

* **Extension Pack for Java** – by Microsoft *(Note: Installing this package automatically includes most other Microsoft Java tools like the Debugger, Maven/Gradle support, and Test Runner)*.
* **Debugger for Java** – by Microsoft
* **Error Lens** – by Alexander (Highlights errors directly in your code line so you see them instantly)
* **Gradle for Java** – by Microsoft
* **Maven for Java** – by Microsoft
* **Project Manager for Java** – by Microsoft
* **Test Runner for Java** – by Microsoft
* **Tokyo Night** – by enkia (My favorite dark theme)
* **Ayu** – by Ayu Theme (Alternative clean theme)
