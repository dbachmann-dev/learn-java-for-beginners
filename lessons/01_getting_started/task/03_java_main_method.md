# 03 - The main-method in Java

## Content of this file:

1. Learn the `main` method
2. Components of the `main` method
3. Implementing it into your `FirstExample.java` file (Exercise)

---

## 01 - Why do we need a `main` method?

In the last lesson, we created our class `FirstExample` and added a few variables. However, if you try to run this file right now, nothing happens – or Java will throw an error.

Why? Because Java needs a clear **starting point** to know where to begin executing your program. 

Think of the `main` method as the front door to your code. Whenever you hit "Run" in VS Code, the Java Virtual Machine (JVM) looks specifically for this exact method and starts executing everything inside its `{}` brackets line by line from top to bottom.

---

## 02 - Components of the `main` method

In Java, the `main` method always has the exact same signature:

```java
public static void main(String[] args) {
    // Your executable code goes here
}
```

It looks a bit intimidating at first, so let's break down what each keyword actually means:

* **public:** Just like with classes and variables, this means the method is publicly accessible. The JVM needs to access this method from outside your class to start the program.
* **static:** This means the method belongs directly to the class itself, not to a specific object created from the class. Because of `static`, Java can run the `main` method immediately without having to build an object first.
* **void:** This is the return type. `void` simply tells Java that this method does not return any value after it finishes running.
* **main:** The fixed name of the method. Java is hardcoded to look for a method named `main` as the entry point.
* **(String[] args):** These are parameters (arguments) that can be passed to your program when starting it from the terminal. `String[]` stands for an array (a list) of text strings, and `args` is just the standard variable name for it. You don't have to use it right now, but it must be there so Java recognizes the method.

*(Tip for VS Code: Simply type `main` inside your class and hit Enter – VS Code will autocomplete the entire line for you!)*

---

## 03 - Exercise: Implementing the `main` method

Now it's time to upgrade your code from the last lesson so it becomes an actual runnable Java program.

**Your Task:**
1. Open your `FirstExample.java` file.
2. Inside the `FirstExample` class (above your variables), add the `public static void main(String[] args)` method.
3. Make sure the curly brackets `{}` of the `main` method are properly closed inside the class brackets.

*(Note: For now, the `main` method can stay empty – we will write code inside it in the next file to print out our variables! You will have to remove the "public" beginning in your file to avoid errors!)*

Once you're done, compare your structure with the solution file inside the `solution/` folder.
