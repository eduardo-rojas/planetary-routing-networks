import React from "react";
import logo from "./logo.svg";
import "./App.css";
import Dashboard from "./components/Dashboard";
import Header from "./components/Layouts/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route } from "react-router-dom";
import AddNote from "./components/Note/AddNote";

function App() {
  return (
    <Router>
      <div className="App">
        <Header />

        <Route exact path="/dashboard" component={Dashboard} />
        <Route exact path="/AddNote" component={AddNote} />
      </div>
    </Router>
  );
}

export default App;
