# 🧮 Fraction Calculator

A lightweight **Java CLI tool** that performs arithmetic operations with **fractions and mixed numbers**, returning simplified results in fractional or mixed form.  
Supports all basic operations: ➕ addition, ➖ subtraction, ✖️ multiplication, and ➗ division.

---

## 🚀 Features

- Supports **whole numbers**, **fractions**, and **mixed fractions** (`3_1/4`)
- Handles **addition (+)**, **subtraction (-)**, **multiplication (*)**, and **division (/)**  
- Returns results in the **most readable fractional format**
- Detects and reports **invalid inputs** (format errors, invalid operands, unknown operators)

---

## 🧩 Example Usage

### ▶️ Run the Program

Compile and execute in your terminal:

```bash
javac FractionCalculator.java
java FractionCalculator
```

### 💡 Input Format

Enter your operation in one line:

```
[operand1] [operator] [operand2]
```

- Each element separated by a **space**
- Mixed numbers use `_` between the whole number and the fraction  
  _(e.g. `2_3/4` means 2 and three-fourths)_

---

## 🧠 Examples

| Operation | Output |
|------------|---------|
| `3/4 + 1/2` | `1_1/4` |
| `5/8 - 1/4` | `3/8` |
| `2/3 * 3/5` | `2/5` |
| `1/2 / 3/4` | `2/3` |
| `2_3/4 + 1/4` | `3` |
| `5 * 2/3` | `3_1/3` |

---

## ⚠️ Error Handling

The calculator provides helpful feedback for:

- ❌ Incorrect input format (missing spaces or operators)
- ⚠️ Invalid fractions (e.g. `2_/3`, `4/0`)
- 🧮 Unknown operators (e.g. `%`, `^`)
- 🚫 Non-numeric input

Example:
```
Enter a fraction operation:
3/4 ^ 1/2
Invalid operator
```

---

## 🧱 Code Overview

The program is composed of two main classes:

- **`FractionCalculator`** – Handles user input, parsing, and operator dispatch.
- **`Fraction`** – Encapsulates fraction logic (addition, subtraction, multiplication, division) and formatting.

Fractions are automatically simplified and presented in mixed form when appropriate.

---

## 🧪 Example Session

```bash
$ java FractionCalculator
Enter a fraction operation:
2_3/4 + 1/4
Result: 3
```

---

## 🧰 Tech Stack

- **Language:** Java 17+
- **Interface:** CLI (command-line)
- **Dependencies:** None (pure Java)

---

## 🧾 License

This project is released under the [MIT License](LICENSE).  
Feel free to modify and extend it for educational or practical use.

---

### ✨ Author
**Fernando Campos**  
📍 QA Automation Engineer & SDET  
🔗 [github.com/refnando](https://github.com/refnando)
