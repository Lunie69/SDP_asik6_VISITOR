# Assignment 6 — Visitor Design Pattern
#Nurlanov Shakhriyar | SE-2512

## Implemented Components

| Component | Class | Responsibility |
|---|---|---|
| Element Interface | MenuItem | Declares the accept() method |
| Concrete Element | CheremshaSalad | Represents a cheremsha salad |
| Concrete Element | CheremshaSoup | Represents a cheremsha soup |
| Concrete Element | CheremshaSauce | Represents a cheremsha sauce |
| Visitor Interface | MenuVisitor | Declares visit methods for all elements |
| Concrete Visitor | PriceVisitor | Calculates dish prices and total menu price |
| Concrete Visitor | NutritionVisitor | Calculates calories and total menu calories |
| Object Structure | List<MenuItem> | Stores and traverses menu items |
| Client | Main | Creates the menu and executes visitors |

## How It Works

The project uses the Visitor behavioral design pattern to perform different operations on menu items without modifying their classes.

Two visitors are implemented:

- **PriceVisitor** — displays the price of each dish and calculates the total menu price.
- **NutritionVisitor** — displays the calories of each dish and calculates the total menu calories.

Each menu item implements the `MenuItem` interface and its `accept()` method.

## Double Dispatch

Double Dispatch is implemented through the interaction between `accept()` and `visitX()` methods.

1. The client calls `item.accept(visitor)`.
2. Java selects the `accept()` implementation based on the actual element type.
3. The element calls the corresponding visitor method, passing itself using `this`.
4. Java executes the matching method implementation of the concrete visitor.

No `instanceof`, `switch`, or type-checking chains are used.

## Clean Code Principles

1. **Meaningful Names** — class and method names clearly describe their responsibilities.
2. **Single Responsibility Principle** — each visitor performs one specific operation.
3. **No Type Checking** — Double Dispatch replaces manual type checking.
4. **Encapsulation** — element fields are private and accessed through getters.
5. **Open/Closed Principle** — new operations can be added through new visitors without modifying existing elements.
6. **Extensibility** — the project supports additional visitors, such as DiscountVisitor.

## Extensibility

A new `DiscountVisitor` can be added to calculate discounts for all menu items.

Existing element classes do not need modifications when adding a new visitor.

However, adding a new element type requires adding a corresponding method to the `MenuVisitor` interface and implementing it in every concrete visitor.

## Output

```text

PRICE ANALYSIS
Fresh Cheremsha Salad price: 1800.0 KZT
Cheremsha Soup price: 2280.0 KZT
Cheremsha Sauce price: 670.0 KZT
Total menu price: 4750.0 KZT

NUTRITION ANALYSIS
Fresh Cheremsha Salad calories: 250 kcal
Cheremsha Soup calories: 180 kcal
Cheremsha Sauce calories: 67 kcal
Total menu calories: 497 kcal
```
