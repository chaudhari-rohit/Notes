#Notes


- Why non static variable be referenced from static context in Java ?
    - When we mark some variable or method as non static we are saying that `this member needs an
      object to work`. Static variables are saying `I am a class level member`. So to access instance
      level from class level would break this. Hence noe allowed.
      

