// //console.log(person);
// const change = () =>{

//     // object declaration

//     const person = {
//     "firstName": "Akash",
//     "lastName": "Ilanthendral T",
//     age: 22,
//     address: [{
//         state: "Tamilnadu",
//         city: "Trichy",
//         pincode: 620025,
//         street: "Mettu street",
//         houseNum: "2/64-B"
//     }],
//     ph: ["9003810466","9344006931"]
//     };

//     //destructuring concept - pulling the attributes of the Object...not assigning the value

//     var {firstName, lastName, age} = person;
//     firstName = "Andrew";
//     lastName = "Johnson";
//     age = 90;
//     //console.log(person.firstName + " " + person.lastName + " " + age); //output: Andrew Johnson 90

//     //array of objects

//     const persons = [
//         {
//     "firstName": "Akash",
//     "lastName": "Ilanthendral T",
//     age: 22,
//     address: [{
//         state: "Tamilnadu",
//         city: "Trichy",
//         pincode: 620025,
//         street: "Mettu street",
//         houseNum: "2/64-B"
//     }],
//     isHaveEmailid: false,
//     ph: ["9003810466","9344006931"]
//     },
//     {
//     "firstName": "B",
//     "lastName": "Ilanthendral T",
//     age: 22,
//     address: [{
//         state: "Tamilnadu",
//         city: "Trichy",
//         pincode: 620025,
//         street: "Mettu street",
//         houseNum: "2/64-B"
//     }],
//     isHaveEmailid: true,
//     ph: ["9003810466","9344006931"]
//     },
//     {
//     "firstName": "A",
//     "lastName": "Ilanthendral T",
//     age: 22,
//     address: [{
//         state: "Tamilnadu",
//         city: "Trichy",
//         pincode: 620025,
//         street: "Mettu street",
//         houseNum: "2/64-B"
//     }],
//     isHaveEmailid: true,
//     ph: ["9003810466","9344006931"]
//     }
//     ];

//     //Higher order arrays
//     //IterationUsingMap(persons)
//     //IterationUsingForEach(persons);
//     //IterationUsingForOf(persons);
//     // setEmail(persons);
//     // IterationUsingMap(persons);
//     filterFunction(persons);
    
// };
// function IterationUsingForEach(persons){
//     console.log("This iteration is done using Array.forEach()");

//     //using arrow functions

//     persons.forEach((element) => {
//        console.log(element);
//     })

//     //  using traditional function 
//     // persons.forEach(function(element){
//     //     console.log(element);
//     // })
// }
// function IterationUsingForOf(persons){
//     console.log("This iteration is done using for-of loop");

//     for(let element of persons){
//         console.log(element.firstName);
//     }
// }
// function setEmail(persons){
//     const persons_ = persons.map((person) => {
//         person.emailid = `${person.firstName}${person.lastName}@gmail.com`;
//         return person.emailid;
//     });
//     return(persons_);
// }
// function IterationUsingMap(persons){
//     //Array.map() returns an Array
//     console.log("IterationUsingMap")
//     const emailids = persons.map((person) => {
        
//         return person.emailid;
//     })
//     console.log(emailids);
// }
// // function iterationUsingFilter(persons){
// //     const personsWithEmailId
// // }
// const filterFunction = (persons) => {
//     const personWithoutEmailid = persons.filter((person) => {
//         if(person.isHaveEmailid == false ){
//             return person;
//         }
//     })
//     console.log(personWithoutEmailid);
// }
const change = () => {
   console.log(document.querySelector('#textarea'));
   //console.log("jabsd");
}
    