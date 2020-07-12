# BuilderDesignPattern


#### Definition
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.”

#### Where we need Builder Pattern
We use builder design pattern when after creating an object we don't want to change it.Considering coded exmaple,  any user management module, primary entity is User, let’s say. 
Ideally and practically as well, once a user object is fully created, you will not want to change it’s state.So in such scenarios Builder Pattern is useful.

#### Advanatges
1) Clean Code
2) Backward Compatbility
3) Client doesn't need to remember any order of passing arguments
4) Build Immutable objects without any complicated methods


