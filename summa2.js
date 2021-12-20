class Person{
    constructor(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
const person1 = new Person("Akash", "Ilanthendral", '5-7-1999');
console.log( person1);