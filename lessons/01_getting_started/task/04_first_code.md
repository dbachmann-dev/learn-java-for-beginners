# 04 - Your first code

## Content of this file:

1. Learn the basic Java output / print commands
2. Implement it in your code (Exercise)

---

## 01 - Basic Java output commands

Now that our variables are inside the `main` method, we finally want to see some actual results in our console / terminal. To output text or variable values in Java, we use the `System.out` commands.

There are two main ways to print something:

* **`System.out.print(...)`:** Prints the text or variable inside the brackets to the console, and the cursor stays on the **exact same line**. Whatever you print next will appear right next to it.
* **`System.out.println(...)`:** Prints the content and automatically adds a **line break** (`ln` = line) at the end, so the next output starts on a new line.

*(Tip for VS Code: Just type `sout` inside your `main` method and hit Enter – VS Code will automatically expand it to `System.out.println();`!)*

### Combining text and variables (`+`)

Inside the brackets of `print` or `println`, you can combine normal text (in double quotes `""`) with your variables using the `+` operator. In Java, this is called **String concatenation**.

Here is a quick example:

```java
String name = "Dominik";
int age = 18;

System.out.println("Name: " + name + " | Age: " + age);
// Output: Name: Dominik | Age: 18
```

This is super useful because if you change the value of your variables later, the output automatically updates without you having to rewrite the text.

---

## 02 - Exercise: Implement it in your code

Let's bring everything together and print our date variables to the console.

**Your Task:**
1. Open your `FirstExample.java` file with the variables inside your `main` method:
   ```java
   public class FirstExample {

     public static void main(String[] args) {
       String date = "15.04.1985";
       int day = 15;
       int month = 4;
       int year = 1985;
     }

   }
   ```
2. Below the variables (still inside the `main` method), use `System.out.println(...)` to print out the `date` variable first (f. e. `"Full date: " + date`).
3. Next, use `System.out.println(...)` again, but this time build the date dynamically by combining text and your three separate `int` variables (`day`, `month`, `year`) with `+` so the console outputs something like: `Date: 15.4.1985`.
4. Run your code (click the **Run** button above `main` in VS Code) and check the terminal output!

*(Try changing the numbers of `day`, `month`, or `year` and run it again to see how easily your output adapts.)*

Once you're done, compare your code with the solution file inside the `solution/` folder!

After that, congrats! You've finished your first lesson!

More coming soon!