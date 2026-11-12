# 02 - Getting started with Java

## Content of this file:

1. Your first class in Java
2. Basic variables
3. Building your own code

---

## 01 - Class files in Java

Right-click the folder you created (f. e. `lesson01`) and select "New File...". You can now directly type in a name for your Java file.

Name your file `FirstExample.java` and hit Enter.

*(Good to know: In Java, class names always start with a capital letter and must match the exact file name without `.java`.)*

You'll notice that VS Code automatically recognized the programming language and created the first lines of code. Your file should look like this now:

```java
public class FirstExample {
  
}
```

Now, what does that mean?

* **public:** The class file can be accessed by every other Java program / code that you have in your project, meaning it's publicly accessible and other programs can, for example, read or change variables in this code.
* **class:** Every Java file is built around a class. With that, you tell Java that this is your new blueprint / program structure.
* **FirstExample:** That's the name of the class (and your file).
* **{}:** In Java, you use `{}` to group code together into a block. Everything you write inside these curly brackets belongs directly to this class.

---

## 02 - Learning basic variables

### What is a variable?

A variable is basically a placeholder or container in your computer's memory where you can store information (like numbers or text) under a specific name so you can use or change it later in your code.

Because Java is a strictly typed language, you always have to tell Java what kind of data you want to store:

* You can use **int** for whole numbers without decimals (f. e. `15`, `-10`, `2026`).
* You can use **String** for text. Text always has to be inside double quotes `""` (f. e. `"Hello"`). Notice that `String` is written with a capital `S`.
* You can use **long** for really big whole numbers that don't fit into a normal `int` (you put an `L` at the end, f. e. `8000000000L`).
* You can use **double** for decimal numbers (f. e. `3.14`, `19.99`).
* You can use **boolean** for simple `true` or `false` values.

### How to set variables:

You create a variable by defining its access, its data type, a name, and assigning a value with `=`:

```java
public int age = 18;
public String username = "steve";
public long bigNumber = 9000000000L;
```

### What does `public` / `private` in front do?

When you create variables directly inside your class, putting `public` or `private` in front controls who can see or modify them:

* **public:** Every other Java file / class in your project can access and change this variable.
* **private:** Only the code inside this exact file can use or change this variable. No external class has access to it.

---

## 03 - Build your first Java code

For now, we will always use `public`.

Your task is to open `FirstExample.java` (or use the starter file in the `code/` folder) and create a variable called `date` (as a `String`, f. e. `"15.04.1985"`). Then create the following `int` variables and assign these values to them:

* `day` -> `15`
* `month` -> `4` *(Note: Don't write `04` for a number in Java, because a leading zero tells Java to read it as an octal number instead of a normal decimal number.)*
* `year` -> `1985`

When you're finished, check the `solution/` folder to compare your code with mine!
