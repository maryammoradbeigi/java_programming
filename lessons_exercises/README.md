# Java Naming Conventions:
- A name is a sequence of letters and numbers and _
- Names may ot start with a number
- Class names utilize Camel Case (first letter in each world is capitalized)
- Finals (constants) are completely capitalized as a stylistic convention. Thus, we use _ to separate the individual worlds.
- The list of Java reserved words can be found [here](https://www.w3schools.com/java/java_ref_keywords.asp). We cannot use these words as identifiers.

# Add Comments
- Two slashes // together indicates that the rest of the line is a comment.
- Multiple line comments start with /* and end with a */. However, we should put * at the beginning of each new line.
- If a multiple line comment starts with /** instead of /*, the contents of the comment will be included in the documentation generated by `javadoc`.

# Primitive Data Types
Java uses several types of constructors:
- Outermost blocks
  - classes
  - interfaces
  - annotations
  - enums
- Other types
  - arrays
  - primitives

Primitives are variables to hold data. Java provides the following primitives (you can find the range and default values of them [here](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)):
- byte --> integer
- short --> integer
- int --> integer
- long --> integer
- float --> real numbers, infinity, NaN
- double --> real numbers, infinity, NaN
- boolean
- char
- array: hold elements of a type and allows you to define a grouping of primitives or objects (references). Each elemet has index starting from 0. Array in java is an object itself. 

Note:
- the compiler assumes that the literals are integer values. To declare a long literal use `long myLong = 23456L;`
- Real number literals default to number. To declare them as float use F like this `float myFloat = 23.45F;`
- 

You can declare your primitive anywhere in your code but their placement affects their visibility. For example, if you place the primitive inside a code block, it will be visible only inside that block from the point of declaration onwards.
Primitives and methods share the same naming convention which is Low Camel Case (the first letter of the first world is lower case and the rest of first letters are upper case).

# Java Operators:
Note: To see java operator precedence, please check [this](https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html).
- Assignment operator: =
- Mathematical operators: + - * / %
- Unary increment or decrement: ++ -- (+, - is also unary operators for sign)
  - Java has prefix and postfix increment and decrement operators:
    - prefix increment (++i) increments i by 1 and then uses it in the expression
    - prefix decrement (--i) decrements i by 1 and then uses it in the expression
    - postfix increment (i++) uses i in the expression and then increments it by 1
    - postfix decrement (i--) uses i in the expression and then decrements it by 1
- Relational operators: < == > <= >= !=
  - These operators result in a boolean value which is normally used in branching or looping statements.
- Logical operators: && (and-ing) || (or-ing) ! (not)
- Logical and Bitwise operators: & | ~ ^ << >> >>>
  - ^ is called `exclusive or`
  - ~ is called `bitwise complement`
  - << is called `bitwise shfit left`
  - the >> is called `bitwise shfit right, sign extension`
  - the >>> is called `bitwise shfit right, zero extension`

![logical_operators.png](images%2Flogical_operators.png)

- The `dot` operator is used to access attributes and methods withing a specific instance of a class.

# Branching
The `if` statement works with relational operators to execute a block of code only if some condition is true. You can also set up a block of code that will execute only when the comparison is false, i.e. 1else1 statement.
- Both `if` and `else` code block can be a set of statements inside curly braces or a single statement.
- If the code block consist of one statement only, you can drop the curly braces but the best practice is to always use them.

**switch statement**: If you have several conditions for the variable, it is easier to use `switch` statement than `if` statement:
Let's imagin that we have a primative baned `wattage` and we wanna take different actions based on the values of it:
```
swith ( wattage ) {
  case 40:
    proce = 1,.20;
    break;
  case 60:
    proce = 1,.30;
    break;
  case 100: //delibrate 'fall through' to repeat the code for different case values
  case 150:
    proce = 1,.15;
    break;
  default:
    price = 0;
}
```
- the moment that the case meets, the rest of the code will be executed. Let's assume that the wattage = 60. If we did not have break, from case 60 all the codes will be executed until the end. That is why we need the break to stop where we want to.

**Ternary expressions** produce a value based on the truth of the expression
Example: int y = ( x > 7 ) ?  2 : 5; is translated to: if x is greater than 7, y will be set to 2, otherwise y will be set to g.

