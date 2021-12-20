// import logo from './logo.svg';
import './App.css';
// import ClassProps from './ClassProps';
import React from 'react';
import Welcome from './Welcome';

// function App() {
//   return (
//     <div className="App">
//       <ClassProps />
//       {/* <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header> */}

//     </div>
//   );
// }
class App extends React.Component{
  render() {
    return <div>
      
      <Welcome name ="Akash"/>

    </div>
  }
}
export default App;
