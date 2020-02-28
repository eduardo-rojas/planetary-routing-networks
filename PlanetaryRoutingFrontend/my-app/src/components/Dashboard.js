import React, { Component } from "react";
import NoteItem from "./Note/NoteItem";
import CreateNoteButton from "./Note/CreateNoteButton";

class Dashboard extends Component {
  render() {
    return (
      <div>
        <div className="projects">
          <div className="container">
            <div className="row">
              <div className="col-md-12">
                <h1 className="display-4 text-center">Notes</h1>
                <br />
                <CreateNoteButton />

                <br />
                <hr />
                <NoteItem />
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Dashboard;
