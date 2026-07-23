import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {

  constructor() {
    super();

    this.state = {
      isLoggedIn: false
    };
  }

  login = () => {
    this.setState({
      isLoggedIn: true
    });
  };

  logout = () => {
    this.setState({
      isLoggedIn: false
    });
  };

  render() {

    return (
      <div style={{ margin: "20px" }}>

        <h1>Ticket Booking Application</h1>

        {this.state.isLoggedIn ? (
          <>
            <UserPage />

            <br />

            <button onClick={this.logout}>
              Logout
            </button>
          </>
        ) : (
          <>
            <GuestPage />

            <br />

            <button onClick={this.login}>
              Login
            </button>
          </>
        )}

      </div>
    );
  }
}

export default App;