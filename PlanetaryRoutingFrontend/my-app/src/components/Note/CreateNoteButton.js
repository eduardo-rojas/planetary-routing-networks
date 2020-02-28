import React from "react";
import { Link } from "react-router-dom";

const CreateNoteButton = () => {
  return (
    <React.Fragment>
      <Link to="/AddNote" className="btn btn-lg btn-info">
        Create a Note
      </Link>
    </React.Fragment>
  );
};
export default CreateNoteButton;
