# Elemental Skill Bridge

## Project Description

This Java project demonstrates the Bridge Structural Design Pattern.

The project uses an elemental RPG theme where different skill types
can work with different elemental effects.

The Bridge Pattern separates skill abstraction from elemental
implementation so both can change independently.

## Bridge Structure

### Abstraction

`Skill`

The abstract class stores a reference to `ElementEffect`.

```java
protected ElementEffect elementEffect;
```

### Refined Abstractions

- `NormalSkill`
- `UltimateSkill`

They represent different types of skills.

### Implementor

`ElementEffect`

```java
public interface ElementEffect {
    void applyEffect(String skillName);
    String getElementName();
}
```

### Concrete Implementors

- `AnemoEffect`
- `CryoEffect`

They provide different elemental implementations.

## Runtime Switching

The implementation can be changed without changing the Skill object:

```java
Skill skill =
        new NormalSkill("Wind Blade", new AnemoEffect());

skill.use();

skill.setElementEffect(new CryoEffect());

skill.use();
```

The abstraction remains `NormalSkill`, while the implementation
changes from Anemo to Cryo.

## Clean Code Principles

### 1. Clear Separation of Responsibilities

`Skill` controls skill behavior while `ElementEffect` controls
elemental effects.

### 2. Meaningful Names

Names such as `NormalSkill`, `UltimateSkill`, `AnemoEffect`,
and `CryoEffect` clearly describe their purpose.

### 3. Small Focused Classes

Each class has one main responsibility.

### 4. No Duplicated Creation Logic

Both elemental effects follow the same `ElementEffect` interface
and only contain element-specific behavior.

### 5. Easy Extension

A new element can be added without changing `Skill`,
`NormalSkill`, or `UltimateSkill`.

For example:

```java
class PyroEffect implements ElementEffect {
    // Pyro implementation
}
```

## Technologies

- Java
- IntelliJ IDEA
- Git
- GitHub
