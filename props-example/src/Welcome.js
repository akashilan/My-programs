import React, {Component} from 'react';

class Welcome extends Component{
    render(){
        // return <h1> Welcome {this.props.name}</h1>
        return React.createElement('div', {id:'div-id', className:'div-class'}, React.createElement('h1', {id:'h1-id', className:'h1-class'},"hello"));
    }
}

export default Welcome