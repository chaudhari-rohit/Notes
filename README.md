![](https://img.shields.io/static/v1?label=Author&message=Rohit+Chaudhari&color=339933&logo=Apache)
![](https://img.shields.io/static/v1?label=Java&message=8&color=27AE60&logo=Java)

Notes

----------------------------------------------------

- Why non static variable be referenced from static context in Java ?
    - When we mark some variable or method as non static we are saying that `this member needs an object to work`. Static variables are saying `I am a class level member`. So to access instance level from class level would break this. Hence noe allowed.
      

