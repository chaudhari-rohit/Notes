![](https://img.shields.io/static/v1?label=Author&message=Rohit+Chaudhari&color=339933&logo=Apache)
![](https://img.shields.io/static/v1?label=Hibernate&message=8&color=27AE60&logo=MongoDB)

Notes

----------------------------------------------------

> Creational 
- Builder
    - For an Immutable class we have scene where we have few fields which are mandatory and 
      others are optional , immutable class will not have setters, so we would need many many 
      constructors to give the flexibility. So instead we achieve this via Builder pattern, 
      where we provide Builder which has method chaining where we have a mandatory field 
      constructor and other method which are optional add ons, and finally we build the object.
      This ensures that we are not left with partial filled object. Good Design!
      > https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
